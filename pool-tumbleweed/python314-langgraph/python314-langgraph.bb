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

RPM_NAME = "python314-langgraph-1.2.11-2.1.noarch.rpm"
RPM_HASH = "e1308ba943f3753e74fac7bcad2d1ac3548f7b92ddc17cbcfcbe212b596f1bb971f75ce081c1c8e7e00174f0ca9c4d6e6aaeb80a7c27f6eb02e8d756fb72aedd"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-langgraph \
python314-langgraph \
python3dist-langgraph"

RDEPENDS:${PN} += "python-abi \
python314-langchain-core \
python314-langgraph-checkpoint \
python314-langgraph-prebuilt \
python314-langgraph-sdk \
python314-pydantic \
python314-xxhash"

inherit rpm
