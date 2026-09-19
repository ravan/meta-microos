SUMMARY = "Resolving Swagger/OpenAPI parser"
DESCRIPTION = "Resolving Swagger/OpenAPI 2.0 and 3.0 Parser."
LICENSE = "MIT"

PV = "25.4.8.0"

RPM_NAME = "python314-prance-25.4.8.0-1.4.noarch.rpm"
RPM_HASH = "dcbca340fc3e33075c277cb8fde70bce362d6f0453f00ec36030e322110ede1528387bf2d5fda246c90726c7197daa29bac93dfd633c107b701affda0a8fb5c7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-prance \
python314-prance \
python3dist-prance"

RDEPENDS:${PN} += "/usr/bin/python3.14 \
/usr/bin/sh \
python-abi \
python314-PyYAML \
python314-chardet \
python314-requests \
python314-semver \
python314-six \
update-alternatives"

inherit rpm
