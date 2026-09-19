SUMMARY = "Python bindings for the LangChain agent streaming protocol"
DESCRIPTION = "Python bindings for the LangChain agent streaming protocol. \
 \
This package provides generated TypedDict and Literal definitions for the \
protocol's commands, events, results, and payload shapes. It does not include \
a runtime client, transport, or helper APIs; it is intended as a source of \
typing primitives only."
LICENSE = "MIT"

PV = "0.0.19"

RPM_NAME = "python314-langchain-protocol-0.0.19-1.1.noarch.rpm"
RPM_HASH = "69e016e2eb174d7aaca95801216369404b914f6a623912c0f8def311a5d4e844d3da353788dcc4b65b2a17877a078a416ac1a7964b14f49de606314a27982252"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-langchain-protocol \
python314-langchain-protocol \
python3dist-langchain-protocol"

RDEPENDS:${PN} += "python-abi \
python314-typing-extensions"

inherit rpm
