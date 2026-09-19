SUMMARY = "Data type fabric (dtfabric)"
DESCRIPTION = "dtFabric, or data type fabric, is a project to manage data types and structures, as used in the libyal projects."
LICENSE = "Apache-2.0"

PV = "20230520"

RPM_NAME = "python313-dtfabric-20230520-1.12.noarch.rpm"
RPM_HASH = "0268f8e41a5400ceff14c51a1beb10017418b1186b075ac44c8df4ce0b0ad539827e4d3a7b1ddc7b388d9df79691f1929f703657df52fbb3cccfc3145a59bf0f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-dtfabric \
python3.13dist-dtfabric \
python313-dtfabric \
python3dist-dtfabric"

RDEPENDS:${PN} += "/usr/bin/python3.13 \
/usr/bin/sh \
python-abi \
python313-PyYAML \
python313-pip \
update-alternatives"

inherit rpm
