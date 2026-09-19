SUMMARY = "Python module for repairing mis-decoded Unicode text"
DESCRIPTION = "Ftfy attempts to repair Unicode text that has been erroneously \
put through an encode/decode cycle with different encodings."
LICENSE = "MIT"

PV = "6.3.1"

RPM_NAME = "python313-ftfy-6.3.1-2.5.noarch.rpm"
RPM_HASH = "92a6d2ea907661f7338faa04f1a218afd76ec0d30fca41b76c198030ee7d5308319c9ae8057e042270491569623215934ea0cb563bb2514d9beaefcc6a4d41a4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-ftfy \
python3.13dist-ftfy \
python313-ftfy \
python3dist-ftfy"

RDEPENDS:${PN} += "/usr/bin/python3.13 \
/usr/bin/sh \
python-abi \
python313-wcwidth \
update-alternatives"

inherit rpm
