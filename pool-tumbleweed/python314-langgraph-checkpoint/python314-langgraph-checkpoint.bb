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

RPM_NAME = "python314-langgraph-checkpoint-4.2.0-2.1.noarch.rpm"
RPM_HASH = "bb25e3da19817c1addacb3c805917c2d69ed4d4ddce75c206c65f1f6c01c9528127040b521d5891b1d80d85bdc46f4af1aa2899f4fa828ef4739f3b19bfbe932"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-langgraph-checkpoint \
python314-langgraph-checkpoint \
python3dist-langgraph-checkpoint"

RDEPENDS:${PN} += "python-abi \
python314-langchain-core \
python314-ormsgpack"

inherit rpm
