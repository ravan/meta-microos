SUMMARY = "Asynchronous SSHv2 client and server library"
DESCRIPTION = "AsyncSSH is a Python package which provides an asynchronous client and \
server implementation of the SSHv2 protocol on top of the Python asyncio framework."
LICENSE = "EPL-2.0 | GPL-2.0-or-later"

PV = "2.23.1"

RPM_NAME = "python313-asyncssh-2.23.1-1.2.noarch.rpm"
RPM_HASH = "66f9bb88d8f6f686a25a41d1fe1eb469357dc95ad4875cbd0e65a54bc72d55bd58bb08f5c901d2679f14a109a859233de4de2a6939947d7b1669976df25a1307"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-asyncssh \
python3.13dist-asyncssh \
python313-asyncssh \
python3dist-asyncssh"

RDEPENDS:${PN} += "python-abi \
python313-cryptography \
python313-typing-extensions"

inherit rpm
