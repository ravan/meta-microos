SUMMARY = "High-level APIs for creating and executing LangGraph agents and tools"
DESCRIPTION = "LangGraph Prebuilt provides high-level, ready-to-use building blocks for \
constructing and running LangGraph agents and tools. \
 \
It ships the create_react_agent factory, the ToolNode executor for invoking \
tools inside a graph, tool-call validation and streaming helpers, and the \
InjectedState/InjectedStore annotations used to pass graph state into tools."
LICENSE = "MIT"

PV = "1.1.0"

RPM_NAME = "python314-langgraph-prebuilt-1.1.0-2.1.noarch.rpm"
RPM_HASH = "2e3f1d6226daf20ddb9e8774eeba88003efce83de55af52571e970995f36313d79794b411d1dc17471d234ba8c3cdd9264531f691f9a51f2b45d1a58be96df11"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-langgraph-prebuilt \
python314-langgraph-prebuilt \
python3dist-langgraph-prebuilt"

RDEPENDS:${PN} += "python-abi \
python314-langchain-core \
python314-langgraph-checkpoint"

inherit rpm
