SUMMARY = "Conch for Twisted"
DESCRIPTION = "Twisted is an extensible framework for Python programming, with special focus \
on event-based network programming and multiprotocol integration. \
 \
Twisted Conch: The Twisted Shell. Terminal emulation, SSHv2 and telnet."
LICENSE = "MIT"

PV = "26.4.0"

RPM_NAME = "python313-Twisted-conch-26.4.0-3.3.noarch.rpm"
RPM_HASH = "dbcee7f1c1f37d12f7c5a6ee2b2ef1ecb3d646a2a15d303c6ae8f8280d5d976c659ac3f7ef49533f8b3a673b4b999bc3be17488558c2f7f219e64b956ff0ae7c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-Twisted-conch \
python313-Twisted-conch"

RDEPENDS:${PN} += "python313-Twisted \
python313-appdirs \
python313-bcrypt \
python313-cryptography"

inherit rpm
