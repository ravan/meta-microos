SUMMARY = "GeoLite2 (CSV) to Legacy format converter"
DESCRIPTION = "Script to convert the GeoLite2 CSV database to Legacy GeoIP \
format. Note that GeoIP is deprecated by upstream and should be \
replaced by GeoLite2."
LICENSE = "MIT"

PV = "0+git20210326.05733c4"

RPM_NAME = "geolite2legacy-0+git20210326.05733c4-2.5.noarch.rpm"
RPM_HASH = "0fcad30d42f178fb5892819d17f51c130e431653b71fc621da7cc3e3c5d78ca86496b50734d1bfc23df7d97601fd575ecd9af66f5fbe71a429c791f18df3a3f4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "geolite2legacy"

RDEPENDS:${PN} += "/usr/bin/python3"

inherit rpm
