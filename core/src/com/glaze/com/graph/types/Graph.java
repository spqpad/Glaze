package com.glaze.com.graph.types;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.utils.Array;
import com.glaze.Inf;
import com.glaze.Vertex;

/**
 * Author: Szabolcs Pásztor
 * Date: 10/16/13
 * Time: 9:45 PM
 */
public class Graph {
    private static final String TAG = Inf.TAG + "|Graph";
    public Array<Vertex> vertices;
    public Array<Edge> edges;
    public boolean vertexNameVisible = false;

    public Graph() {
        Gdx.app.log(TAG, "Creating Graph object");
        vertices = new Array<Vertex>();
        edges = new Array<Edge>();
    }

}
