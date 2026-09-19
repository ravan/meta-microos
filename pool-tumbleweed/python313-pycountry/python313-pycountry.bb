SUMMARY = "Databases for ISO standards 639 3166 3166-2 4217 15924"
DESCRIPTION = "pycountry provides the ISO databases for the standards 639 (Languages), \
3166 (Countries), 3166-2 (Subdivisions of countries), 4217 (Currencies), \
15924 (Scripts). The databases are imported from Debian's pkg-isocodes, \
packaged into pycountry and made accessible through a Python API. \
Translation files for the various strings are included as well."
LICENSE = "LGPL-2.1-only"

PV = "26.2.16"

RPM_NAME = "python313-pycountry-26.2.16-1.2.noarch.rpm"
RPM_HASH = "1e0e732f687fd37e68203969eac3b421b3507a44bc2b6a1f0f4f1ab31bcaa1e06fee348ca23420eaec8839d4db956c89a46c9df8743b25c14f15a8b86a22bd67"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-pycountry \
python3.13dist-pycountry \
python313-pycountry \
python3dist-pycountry"

RDEPENDS:${PN} += "python-abi"

inherit rpm
