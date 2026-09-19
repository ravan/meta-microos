SUMMARY = "A Python implement of Agent Client Protocol (ACP, by Zed Industries)"
DESCRIPTION = "Agent Client Protocol \
 \
Build ACP-compliant agents and clients in Python with generated schema \
models, asyncio transports, helper builders, and runnable demos."
LICENSE = "Apache-2.0"

PV = "0.11.0"

RPM_NAME = "python314-agent-client-protocol-0.11.0-1.1.noarch.rpm"
RPM_HASH = "890eda48054cb2f9a2a4e8edb8b923bc5ab2d9c438c25a7b125f6b0bb823c2e57ece84a489c061d7b00bf911b4d89709de4b8d7f27d6142ec1a51556914999c0"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-agent-client-protocol \
python314-agent-client-protocol \
python3dist-agent-client-protocol"

RDEPENDS:${PN} += "python-abi \
python314-pydantic"

inherit rpm
