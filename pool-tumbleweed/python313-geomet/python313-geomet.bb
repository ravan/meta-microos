SUMMARY = "GeoJSON <-> WKT/WKB conversion utilities"
DESCRIPTION = "GeoJSON <-> WKT/WKB conversion utilities"
LICENSE = "Apache-2.0"

PV = "1.1.0"

RPM_NAME = "python313-geomet-1.1.0-1.12.noarch.rpm"
RPM_HASH = "2352de06e445fa1fa9bb6bfe4e2e56672c6b3583fe46265a037d5ea50187040deff5eb9361b2a1ff2dba18f18d15c7e1908d9adcecb836e52a084c60b23b6122"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-geomet \
python3.13dist-geomet \
python313-geomet \
python3dist-geomet"

RDEPENDS:${PN} += "/usr/bin/python3.13 \
/usr/bin/sh \
python-abi \
python313-click \
update-alternatives"

inherit rpm
