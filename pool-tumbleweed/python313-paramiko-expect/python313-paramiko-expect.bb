SUMMARY = "An expect-like extension for the Paramiko SSH library"
DESCRIPTION = "Paramiko Expect provides an expect-like extension for the Paramiko SSH library \
which allows scripts to fully interact with hosts via a true SSH \
connection. \
 \
The class is constructed with an SSH Client object (this will likely be \
extended to support a transport in future for more flexibility)."
LICENSE = "MIT"

PV = "0.3.5"

RPM_NAME = "python313-paramiko-expect-0.3.5-2.5.noarch.rpm"
RPM_HASH = "90e17690bb0826219f036273820c37bf885dbaecceb4a8dc01bc7f2c4c62300ec3a9a1460b9677bbc5672bbb696a8362aad8ca126c19fb7d976d3819d689e7b4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-paramiko-expect \
python3.13dist-paramiko-expect \
python313-paramiko-expect \
python3dist-paramiko-expect"

RDEPENDS:${PN} += "python-abi \
python313-paramiko"

inherit rpm
