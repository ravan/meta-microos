SUMMARY = "Module to get MAC addresses of remote hosts and local interfaces"
DESCRIPTION = "A Python module to get MAC addresses of remote hosts and local interfaces."
LICENSE = "MIT"

PV = "0.9.5"

RPM_NAME = "python314-getmac-0.9.5-1.9.noarch.rpm"
RPM_HASH = "066afc09f4ce39b1087ed4389d1b188a16abfc7e34cbb970babeb7a5db342aced6b29f663094ba36e30c3cebdfe2e5b47f8db06df84600222406f0babcf614ab"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-getmac \
python314-getmac \
python3dist-getmac"

RDEPENDS:${PN} += "/usr/bin/python3.14 \
/usr/bin/sh \
python-abi \
update-alternatives"

inherit rpm
