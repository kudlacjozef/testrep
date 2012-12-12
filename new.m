clear;
space = [-5*ones(1,10); 5*ones(1,10)];
Newpop = genrpop(20,space);% vygenerovanie nahodnej realneciselnej populacie
amp = ones(1,10);
for i=1:1000   
    fit = rastrigin(Newpop);
    Fitminimum(i)=min(fit);
    newPop20 = selsus(Newpop,fit,16);% vyber pomocou vahovaneho ruletoveho kolesa
    newPop20Cross = crossov(newPop20,2,0);% viacbodove krizenie dvoch rodicov
    newPop20Mut = mutx(newPop20Cross,0.1,space);% m. mutacia
    newPop20 = muta(newPop20Mut,0.1,amp,space);% a. mutacia
    uf = [2,1,1];
    newPop10 = selbest(Newpop,fit,uf);% vyber najlepsich retazcov
    Newpop = [newPop10;newPop20];
    
end;

Fitminimum
plot(Fitminimum);