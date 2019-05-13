# Graphs algorithms

Breadth-first search (BFS) is an algorithm for traversing or searching tree or graph data structures, it's base in FIFO 
(first in first out) structure. It starts at the tree root (or some arbitrary nodeTest of a graph, sometimes referred to as 
a 'search key'), and explores all of the neighbor nodes at the present depth prior to moving on to the nodes at the 
next depth level. 

Depth First Search (DFS) is an algorithm based on the last in first out (LIFO) structure, in order to be able to go through
the whole tree in increasing order, having prevalence the exploration in each node from left to right, and find until 
the last node of the route, before passing to a node in the same level.


## Installation

Use the package manager [maven](http://maven.apache.org/download.cgi) to install dependencies.

```bash
$ mvn install
```

### Build

```bash
$ mvn clean package
```

### Test

```bash
$ mvn clean test
```

## Usage

```bash
$ # Breadth First Search
$ java -jar target/bfs-1.0-SNAPSHOT.jar -bfs
$ # Depth First Search
$ java -jar target/bfs-1.0-SNAPSHOT.jar -dfs
```

## Contributing
Pull requests are welcome. For major changes, please open an issue first to discuss what you would like to change.

Please make sure to update tests as appropriate.

## License
[MIT](https://choosealicense.com/licenses/mit/)