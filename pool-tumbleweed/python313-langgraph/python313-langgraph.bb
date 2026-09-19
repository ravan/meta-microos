SUMMARY = "Library for building stateful, multi-actor applications with LLMs"
DESCRIPTION = "LangGraph is a low-level orchestration framework for building, running and \
managing stateful, multi-actor applications with large language models. \
 \
It models an application as a graph of nodes and edges with shared state, \
adding durable execution with checkpointing, human-in-the-loop interaction, \
streaming of tokens and intermediate steps, and time-travel debugging. This \
package provides the core graph API (StateGraph), the Pregel runtime, the \
functional API, channels and managed values shared across the LangGraph \
ecosystem."
LICENSE = "MIT"

PV = "1.2.11"

RPM_NAME = "python313-langgraph-1.2.11-2.1.noarch.rpm"
RPM_HASH = "9e03606ea9d1a0bbc190e475a4e53961e9255172f5efd730def608537fcd933e2a76a186d07166f18df16ff263f7e62e5f165921e125ba57a6d62d8137a930c6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-langgraph \
python3.13dist-langgraph \
python313-langgraph \
python3dist-langgraph"

RDEPENDS:${PN} += "python-abi \
python313-langchain-core \
python313-langgraph-checkpoint \
python313-langgraph-prebuilt \
python313-langgraph-sdk \
python313-pydantic \
python313-xxhash"

inherit rpm
