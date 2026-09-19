SUMMARY = "Python bindings for the LangChain agent streaming protocol"
DESCRIPTION = "Python bindings for the LangChain agent streaming protocol. \
 \
This package provides generated TypedDict and Literal definitions for the \
protocol's commands, events, results, and payload shapes. It does not include \
a runtime client, transport, or helper APIs; it is intended as a source of \
typing primitives only."
LICENSE = "MIT"

PV = "0.0.19"

RPM_NAME = "python313-langchain-protocol-0.0.19-1.1.noarch.rpm"
RPM_HASH = "f783f5af4b5e5079ad5d823d2000f5676d6a2631dba3430e03d82d473ef1544a0bedcae9eb843383ac08b26ef3a91fcfbbb6a22c54ce46e4986601b242e8c032"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-langchain-protocol \
python3.13dist-langchain-protocol \
python313-langchain-protocol \
python3dist-langchain-protocol"

RDEPENDS:${PN} += "python-abi \
python313-typing-extensions"

inherit rpm
