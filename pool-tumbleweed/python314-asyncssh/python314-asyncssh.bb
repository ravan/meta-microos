SUMMARY = "Asynchronous SSHv2 client and server library"
DESCRIPTION = "AsyncSSH is a Python package which provides an asynchronous client and \
server implementation of the SSHv2 protocol on top of the Python asyncio framework."
LICENSE = "EPL-2.0 | GPL-2.0-or-later"

PV = "2.23.1"

RPM_NAME = "python314-asyncssh-2.23.1-1.2.noarch.rpm"
RPM_HASH = "b467ced20971a232bec6561ba0ae0b0a575206f0582c94767722b42af04956864fcd5d1b4c540cd582068b80eadd7c8c107422e8009c1e0e2f7d6c9134085cde"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-asyncssh \
python314-asyncssh \
python3dist-asyncssh"

RDEPENDS:${PN} += "python-abi \
python314-cryptography \
python314-typing-extensions"

inherit rpm
