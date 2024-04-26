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


        g.adicionarAresta(new Aresta("a1", AC, AM, 1445));
        g.adicionarAresta(new Aresta("a2", AC, RO, 544));
        g.adicionarAresta(new Aresta("a3", AL, BA, 632));
        g.adicionarAresta(new Aresta("a4", AL, PE, 285));
        g.adicionarAresta(new Aresta("a5", AL, SE, 294));
        g.adicionarAresta(new Aresta("a6", AP, PA, 330));
        g.adicionarAresta(new Aresta("a7", AM, MT, 2357));
        g.adicionarAresta(new Aresta("a8", AM, PA, 5298));
        g.adicionarAresta(new Aresta("a9", AM, RO, 901));
        g.adicionarAresta(new Aresta("a10", AM, RR, 785));
        g.adicionarAresta(new Aresta("a11", BA, ES, 1202));
        g.adicionarAresta(new Aresta("a12", BA, PE, 839));
        g.adicionarAresta(new Aresta("a13", BA, PI, 1163));
        g.adicionarAresta(new Aresta("a14", BA, TO, 1454));
        g.adicionarAresta(new Aresta("a15", BA, GO, 1643));
        g.adicionarAresta(new Aresta("a16", BA, MG, 1372));
        g.adicionarAresta(new Aresta("a17", BA, SE, 356));
        g.adicionarAresta(new Aresta("a18", CE, PB, 688));
        g.adicionarAresta(new Aresta("a19", CE, PE, 800));
        g.adicionarAresta(new Aresta("a20", CE, PI, 634));
        g.adicionarAresta(new Aresta("a21", CE, RN, 537));
        g.adicionarAresta(new Aresta("a22", DF, GO, 209));
        g.adicionarAresta(new Aresta("a23", DF, MG, 716));
        g.adicionarAresta(new Aresta("a24", ES, MG, 524));
        g.adicionarAresta(new Aresta("a25", ES, RJ, 521));
        g.adicionarAresta(new Aresta("a26", GO, MT, 934));
        g.adicionarAresta(new Aresta("a27", GO, MS, 935));
        g.adicionarAresta(new Aresta("a28", GO, MG, 906));
        g.adicionarAresta(new Aresta("a29", GO, TO, 874));
        g.adicionarAresta(new Aresta("a30", MA, PA, 806));
        g.adicionarAresta(new Aresta("a31", MA, PI, 446));
        g.adicionarAresta(new Aresta("a32", MA, TO, 1386));
        g.adicionarAresta(new Aresta("a33", MT, MS, 694));
        g.adicionarAresta(new Aresta("a34", MT, PA, 2941));
        g.adicionarAresta(new Aresta("a35", MT, RO, 1456));
        g.adicionarAresta(new Aresta("a36", MT, TO, 1784));
        g.adicionarAresta(new Aresta("a37", MS, MG, 1453));
        g.adicionarAresta(new Aresta("a38", RS, SC, 476));
        g.adicionarAresta(new Aresta("a39", MS, SP, 1014));
        g.adicionarAresta(new Aresta("a40", MG, RJ, 434));
        g.adicionarAresta(new Aresta("a41", MG, SP, 586));
        g.adicionarAresta(new Aresta("a42", PA, RR, 6083));
        g.adicionarAresta(new Aresta("a43", PA, TO, 1283));
        g.adicionarAresta(new Aresta("a44", PB, PE, 120));
        g.adicionarAresta(new Aresta("a45", PB, RN, 185));
        g.adicionarAresta(new Aresta("a46", PR, SC, 300));
        g.adicionarAresta(new Aresta("a47", PR, SP, 408));
        g.adicionarAresta(new Aresta("a48", PE, PI, 1137));
        g.adicionarAresta(new Aresta("a49", PE, RN, 297));
        g.adicionarAresta(new Aresta("a50", PI, TO, 1401));
        g.adicionarAresta(new Aresta("a51", RJ, SP, 429));

        System.out.println(g.getDistanciaMinimaEstados(PB, TO));

    }

}