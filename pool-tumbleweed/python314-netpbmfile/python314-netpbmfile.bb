SUMMARY = "Read and write image files in the Netpbm format"
DESCRIPTION = "Netpbmfile is a Python library to read and write image files in the Netpbm \
format."
LICENSE = "BSD-3-Clause"

PV = "2026.7.25"

RPM_NAME = "python314-netpbmfile-2026.7.25-1.1.noarch.rpm"
RPM_HASH = "7597e94246ef4b271d587a14fa1bddee3d5ee7a6a8497832a6e045efc793d5cc3a816f91a977039ed32605e3dec5b452b1705d1849ec91f77e5f7621dad599f8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-netpbmfile \
python314-netpbmfile \
python3dist-netpbmfile"

RDEPENDS:${PN} += "/usr/bin/python3.14 \
/usr/bin/sh \
python-abi \
python314-matplotlib \
python314-numpy \
update-alternatives"

inherit rpm
