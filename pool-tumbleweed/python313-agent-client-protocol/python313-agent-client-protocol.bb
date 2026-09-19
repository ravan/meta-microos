SUMMARY = "A Python implement of Agent Client Protocol (ACP, by Zed Industries)"
DESCRIPTION = "Agent Client Protocol \
 \
Build ACP-compliant agents and clients in Python with generated schema \
models, asyncio transports, helper builders, and runnable demos."
LICENSE = "Apache-2.0"

PV = "0.11.0"

RPM_NAME = "python313-agent-client-protocol-0.11.0-1.1.noarch.rpm"
RPM_HASH = "3a7459d08c1bf6eccb9797d0ff41bc0a13be16c3556d269276ee3d07fc05f231609fa68a0b3bb650238fb807be8e4e59bddaea302ce6effb1fec411429e00e0b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-agent-client-protocol \
python3.13dist-agent-client-protocol \
python313-agent-client-protocol \
python3dist-agent-client-protocol"

RDEPENDS:${PN} += "python-abi \
python313-pydantic"

inherit rpm
