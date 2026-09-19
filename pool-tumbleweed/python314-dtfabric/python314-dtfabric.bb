SUMMARY = "Data type fabric (dtfabric)"
DESCRIPTION = "dtFabric, or data type fabric, is a project to manage data types and structures, as used in the libyal projects."
LICENSE = "Apache-2.0"

PV = "20230520"

RPM_NAME = "python314-dtfabric-20230520-1.12.noarch.rpm"
RPM_HASH = "c4485daba7901b8f1e72581bcb3b5ccbf96c021c0b6753b817a45555bd5b096dad4070daa9f7226f653f6d2ea2e5cec6178a7111c6f5e284702bdf07847df70d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-dtfabric \
python314-dtfabric \
python3dist-dtfabric"

RDEPENDS:${PN} += "/usr/bin/python3.14 \
/usr/bin/sh \
python-abi \
python314-PyYAML \
python314-pip \
update-alternatives"

inherit rpm
