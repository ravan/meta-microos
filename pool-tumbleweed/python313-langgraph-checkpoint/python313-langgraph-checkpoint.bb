SUMMARY = "Library with base interfaces for LangGraph checkpoint savers"
DESCRIPTION = "LangGraph Checkpoint provides the base interfaces and reference \
implementations for checkpoint savers (checkpointers) used by LangGraph. \
 \
Checkpointers persist the state of a graph at every super-step, enabling \
features such as human-in-the-loop interaction, memory across runs, time \
travel and fault tolerance. This package ships the in-memory reference \
saver and the serialization machinery shared by the persistent backends."
LICENSE = "MIT"

PV = "4.2.0"

RPM_NAME = "python313-langgraph-checkpoint-4.2.0-2.1.noarch.rpm"
RPM_HASH = "f625c26709c01f580347a27d04f0ead0a71b541e5db11d8aca66924460fcffaa504e6fab587ed950af2f8aacf5965db8758d8cc44d10357e40c3af8760d7ed4f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-langgraph-checkpoint \
python3.13dist-langgraph-checkpoint \
python313-langgraph-checkpoint \
python3dist-langgraph-checkpoint"

RDEPENDS:${PN} += "python-abi \
python313-langchain-core \
python313-ormsgpack"

inherit rpm
