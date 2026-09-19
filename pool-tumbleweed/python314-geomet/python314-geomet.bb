SUMMARY = "GeoJSON <-> WKT/WKB conversion utilities"
DESCRIPTION = "GeoJSON <-> WKT/WKB conversion utilities"
LICENSE = "Apache-2.0"

PV = "1.1.0"

RPM_NAME = "python314-geomet-1.1.0-1.12.noarch.rpm"
RPM_HASH = "7fd372534744bbcc0e1b2e8c0001e422ca56c353aaee8ae803b5aa2095d974cdedcbda8a67d74aad21592e3874d11d8a3be68c3edfce419fd32ec1d47bcf7200"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-geomet \
python314-geomet \
python3dist-geomet"

RDEPENDS:${PN} += "/usr/bin/python3.14 \
/usr/bin/sh \
python-abi \
python314-click \
update-alternatives"

inherit rpm
