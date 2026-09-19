SUMMARY = "Python module for collecting instance metadata from GCE"
DESCRIPTION = "A module for collecting instance metadata from Google Compute Engine."
LICENSE = "GPL-3.0-or-later"

PV = "1.1.2"

RPM_NAME = "python-gcemetadata-1.1.2-1.1.noarch.rpm"
RPM_HASH = "2a1956c3b6d1d1b943a7f67cac8c8866b844c56a66d04d386908a6006974d31abc6b229049732873157fac55f22ae8914253f8de612966fea0b8b7b3d5ab2bc5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python-gcemetadata \
python3.13dist-gcemetadata \
python3dist-gcemetadata"

RDEPENDS:${PN} += "/usr/bin/python3.13 \
python-abi"

inherit rpm
