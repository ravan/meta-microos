SUMMARY = "SSH scp module for paramiko"
DESCRIPTION = "The scp.py module uses a paramiko transport to send and receive files via the \
scp protocol. This is the protocol as referenced from the openssh scp program, \
and has only been tested with this implementation."
LICENSE = "LGPL-2.1-or-later"

PV = "0.16.1"

RPM_NAME = "python314-scp-0.16.1-1.1.noarch.rpm"
RPM_HASH = "04813668aae2450ec6c1d99b4760aff3cb50e17cbd218b703be56b053d012d38afec152b9bf8ac3bbf3d4b5064286e5277cb0e8006154fcb5a43770204eb12f8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-scp \
python314-scp \
python3dist-scp"

RDEPENDS:${PN} += "python-abi \
python314-paramiko"

inherit rpm
