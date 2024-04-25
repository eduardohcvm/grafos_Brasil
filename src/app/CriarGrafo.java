package app;

public class CriarGrafo {
    public CriarGrafo(Grafo g) {

        Vertice AC = new Vertice("AC");
        Vertice AL = new Vertice("AL");
        Vertice AM = new Vertice("AM");
        Vertice AP = new Vertice("AP");
        Vertice BA = new Vertice("BA");
        Vertice CE = new Vertice("CE");
        Vertice DF = new Vertice("DF");
        Vertice ES = new Vertice("ES");
        Vertice GO = new Vertice("GO");
        Vertice MA = new Vertice("MA");
        Vertice MG = new Vertice("MG");
        Vertice MS = new Vertice("MS");
        Vertice MT = new Vertice("MT");
        Vertice PA = new Vertice("PA");
        Vertice PB = new Vertice("PB");
        Vertice PE = new Vertice("PE");
        Vertice PI = new Vertice("PI");
        Vertice PR = new Vertice("PR");
        Vertice RJ = new Vertice("RJ");
        Vertice RN = new Vertice("RN");
        Vertice RO = new Vertice("RO");
        Vertice RR = new Vertice("RR");
        Vertice RS = new Vertice("RS");
        Vertice SC = new Vertice("SC");
        Vertice SE = new Vertice("SE");
        Vertice SP = new Vertice("SP");
        Vertice TO = new Vertice("TO");


        g.adicionarVertice(AC);
        g.adicionarVertice(AL);
        g.adicionarVertice(AM);
        g.adicionarVertice(AP);
        g.adicionarVertice(BA);
        g.adicionarVertice(CE);
        g.adicionarVertice(DF);
        g.adicionarVertice(ES);
        g.adicionarVertice(GO);
        g.adicionarVertice(MA);
        g.adicionarVertice(MG);
        g.adicionarVertice(MS);
        g.adicionarVertice(MT);
        g.adicionarVertice(PA);
        g.adicionarVertice(PB);
        g.adicionarVertice(PE);
        g.adicionarVertice(PI);
        g.adicionarVertice(PR);
        g.adicionarVertice(RJ);
        g.adicionarVertice(RN);
        g.adicionarVertice(RO);
        g.adicionarVertice(RR);
        g.adicionarVertice(RS);
        g.adicionarVertice(SC);
        g.adicionarVertice(SE);
        g.adicionarVertice(SP);
        g.adicionarVertice(TO);


        g.adicionarAresta(new Aresta("a1", AC, AM, 1300));
        g.adicionarAresta(new Aresta("a2", AL, PE, 260));
        g.adicionarAresta(new Aresta("a3", AL, SE, 270));
        g.adicionarAresta(new Aresta("a4", AP, PA, 400));
        g.adicionarAresta(new Aresta("a5", BA, PA, 500));
        g.adicionarAresta(new Aresta("a6", AM, RO, 800));
        g.adicionarAresta(new Aresta("a7", AM, RR, 600));
        g.adicionarAresta(new Aresta("a8", BA, SE, 280));
        g.adicionarAresta(new Aresta("a9", BA, PE, 800));
        g.adicionarAresta(new Aresta("a10", BA, PI, 1000));
        g.adicionarAresta(new Aresta("a11", BA, MG, 1400));
        g.adicionarAresta(new Aresta("a12", BA, ES, 1200));
        g.adicionarAresta(new Aresta("a13", CE, PI, 600));
        g.adicionarAresta(new Aresta("a14", CE, PE, 800));
        g.adicionarAresta(new Aresta("a15", ES, MG, 520));

        g.adicionarAresta(new Aresta("a17", ES, RJ, 490));
        g.adicionarAresta(new Aresta("a18", GO, BA, 1500));
        g.adicionarAresta(new Aresta("a19", GO, MG, 930));
        g.adicionarAresta(new Aresta("a20", GO, MT, 720));
        g.adicionarAresta(new Aresta("a21", GO, TO, 880));
        g.adicionarAresta(new Aresta("a22", GO, DF, 210));
        g.adicionarAresta(new Aresta("a23", MA, TO, 850));
        g.adicionarAresta(new Aresta("a24", MA, PI, 640));
        g.adicionarAresta(new Aresta("a25", MT, TO, 1400));

        g.adicionarAresta(new Aresta("a27", MS, GO, 1100));
        g.adicionarAresta(new Aresta("a28", MS, MT, 980));
        g.adicionarAresta(new Aresta("a29", MG, RJ, 340));
        g.adicionarAresta(new Aresta("a30", MG, SP, 580));
        g.adicionarAresta(new Aresta("a31", MG, MS, 1400));
        g.adicionarAresta(new Aresta("a32", MG, DF, 720));
        g.adicionarAresta(new Aresta("a33", PA, AM, 1600));
        g.adicionarAresta(new Aresta("a34", PB, RN, 180));
        g.adicionarAresta(new Aresta("a35", PB, PE, 120));
        g.adicionarAresta(new Aresta("a36", PB, CE, 730));
        g.adicionarAresta(new Aresta("a37", PR, SP, 400));
        g.adicionarAresta(new Aresta("a38", PR, MS, 900));

        g.adicionarAresta(new Aresta("a39", RJ, SP, 430));
        g.adicionarAresta(new Aresta("a40", RN, CE, 520));
        g.adicionarAresta(new Aresta("a41", RS, SC, 480));
        g.adicionarAresta(new Aresta("a42", SC, PR, 300));
        g.adicionarAresta(new Aresta("a43", SP, MS, 1000));
        g.adicionarAresta(new Aresta("a44", TO, PI, 800));
        g.adicionarAresta(new Aresta("a45", TO, BA, 1500));


    }


}
