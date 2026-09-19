SUMMARY = "Databases for ISO standards 639 3166 3166-2 4217 15924"
DESCRIPTION = "pycountry provides the ISO databases for the standards 639 (Languages), \
3166 (Countries), 3166-2 (Subdivisions of countries), 4217 (Currencies), \
15924 (Scripts). The databases are imported from Debian's pkg-isocodes, \
packaged into pycountry and made accessible through a Python API. \
Translation files for the various strings are included as well."
LICENSE = "LGPL-2.1-only"

PV = "26.2.16"

RPM_NAME = "python314-pycountry-26.2.16-1.2.noarch.rpm"
RPM_HASH = "785a58579832609bc5eede99984e3c48efe0525a2e0c2da815e7284c84c964647801619b611edbcda284be24afd56fcbe674c66914762f6982da5c5434065c7b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-pycountry \
python314-pycountry \
python3dist-pycountry"

RDEPENDS:${PN} += "python-abi"

inherit rpm
