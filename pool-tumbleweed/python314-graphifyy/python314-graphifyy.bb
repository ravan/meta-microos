SUMMARY = "Code knowledge graph builder and query CLI for AI assistants"
DESCRIPTION = "Graphify turns a codebase into a queryable knowledge graph \
(graphify-out/graph.json) and registers a /graphify skill with AI coding \
assistants. The graphify CLI answers plain-English questions about the \
graph with file:line citations, traces paths between components, explains \
symbols and summarizes pull-request impact. Individual language support is \
provided by the python-tree-sitter-<language> grammar modules; a missing \
grammar only disables that language."
LICENSE = "Apache-2.0 & MIT"

PV = "0.9.61"

RPM_NAME = "python314-graphifyy-0.9.61-1.1.noarch.rpm"
RPM_HASH = "a2109855d1e967214c2a4cf868991aa9255cddeded04c7932249e37ac22ca39861d2aa6ae7cf432f6a17b9d0428b236203ef3f9b838fd8958c5694fb4319e4fc"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-graphifyy \
python314-graphifyy \
python3dist-graphifyy"

RDEPENDS:${PN} += "/usr/bin/python3.14 \
/usr/bin/sh \
alts \
python-abi \
python314-networkx \
python314-numpy \
python314-rapidfuzz"

inherit rpm
