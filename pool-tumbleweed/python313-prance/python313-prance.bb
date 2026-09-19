SUMMARY = "Resolving Swagger/OpenAPI parser"
DESCRIPTION = "Resolving Swagger/OpenAPI 2.0 and 3.0 Parser."
LICENSE = "MIT"

PV = "25.4.8.0"

RPM_NAME = "python313-prance-25.4.8.0-1.4.noarch.rpm"
RPM_HASH = "bed151f6568a30d5da61122f2ca748ac6f1cad8476ff9862540f3a429a8dcecfc937bb44761021ef15641b807d1121e66fa2865e0ba86355c5711b58cdb689d7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-prance \
python3.13dist-prance \
python313-prance \
python3dist-prance"

RDEPENDS:${PN} += "/usr/bin/python3.13 \
/usr/bin/sh \
python-abi \
python313-PyYAML \
python313-chardet \
python313-requests \
python313-semver \
python313-six \
update-alternatives"

inherit rpm
