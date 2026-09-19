SUMMARY = "High-level APIs for creating and executing LangGraph agents and tools"
DESCRIPTION = "LangGraph Prebuilt provides high-level, ready-to-use building blocks for \
constructing and running LangGraph agents and tools. \
 \
It ships the create_react_agent factory, the ToolNode executor for invoking \
tools inside a graph, tool-call validation and streaming helpers, and the \
InjectedState/InjectedStore annotations used to pass graph state into tools."
LICENSE = "MIT"

PV = "1.1.0"

RPM_NAME = "python313-langgraph-prebuilt-1.1.0-2.1.noarch.rpm"
RPM_HASH = "c880f7c0413d447be4250823c6fad0aebacd1b87d1e2f0e8f9ce91ce25f1d500f0c435814ad0d0677bbe33650544af28670a92dfd5eaee67256f58a14b265df0"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-langgraph-prebuilt \
python3.13dist-langgraph-prebuilt \
python313-langgraph-prebuilt \
python3dist-langgraph-prebuilt"

RDEPENDS:${PN} += "python-abi \
python313-langchain-core \
python313-langgraph-checkpoint"

inherit rpm
