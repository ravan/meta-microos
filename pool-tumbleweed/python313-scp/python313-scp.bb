SUMMARY = "SSH scp module for paramiko"
DESCRIPTION = "The scp.py module uses a paramiko transport to send and receive files via the \
scp protocol. This is the protocol as referenced from the openssh scp program, \
and has only been tested with this implementation."
LICENSE = "LGPL-2.1-or-later"

PV = "0.16.1"

RPM_NAME = "python313-scp-0.16.1-1.1.noarch.rpm"
RPM_HASH = "d3aa1c4b66711ab596841ade192ce7af3da4b636857e63d66f9a42a682c507037ff1e6ff6c604f795ab0dbd7ac74aeaa5b23e6e4a20e97d524c1b94bf6883434"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-scp \
python3.13dist-scp \
python313-scp \
python3dist-scp"

RDEPENDS:${PN} += "python-abi \
python313-paramiko"

inherit rpm
