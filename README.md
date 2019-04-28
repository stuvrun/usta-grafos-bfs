# Foobar

Breadth-first search (BFS) is an algorithm for traversing or searching tree or graph data structures, it's base in FIFO 
(first in first out) structure. It starts at the tree root (or some arbitrary nodeTest of a graph, sometimes referred to as 
a 'search key'), and explores all of the neighbor nodes at the present depth prior to moving on to the nodes at the 
next depth level. 

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
$ java -jar target/bfs-1.0-SNAPSHOT.jar
```

## Contributing
Pull requests are welcome. For major changes, please open an issue first to discuss what you would like to change.

Please make sure to update tests as appropriate.

## License
[MIT](https://choosealicense.com/licenses/mit/)