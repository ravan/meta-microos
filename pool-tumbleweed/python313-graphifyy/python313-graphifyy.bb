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

RPM_NAME = "python313-graphifyy-0.9.61-1.1.noarch.rpm"
RPM_HASH = "4af3b7145bcd5aa7182bc1d356b418d030d99cc669e4e0e94b1b52313d03f9f3c2ae50f99020d6d88183ecd8ba8f9810cdc6304d905a45006dc616ff0f6fbeb0"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "graphifyy \
python3-graphifyy \
python3.13dist-graphifyy \
python313-graphifyy \
python3dist-graphifyy"

RDEPENDS:${PN} += "/usr/bin/python3.13 \
/usr/bin/sh \
alts \
python-abi \
python313-networkx \
python313-numpy \
python313-rapidfuzz"

inherit rpm
