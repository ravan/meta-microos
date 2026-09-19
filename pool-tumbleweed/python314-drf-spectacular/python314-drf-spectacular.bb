SUMMARY = "Sane and flexible OpenAPI 3 schema generation for Django REST framework"
DESCRIPTION = "Sane and flexible OpenAPI 3 schema generation for Django REST framework"
LICENSE = "BSD-3-Clause"

PV = "0.30.0"

RPM_NAME = "python314-drf-spectacular-0.30.0-1.1.noarch.rpm"
RPM_HASH = "e340e68daf108940fbf2ed4f00f56979b16557fa3b640982f2a39762124a99c4106a1c774b0a1e6b2e42cb8b4feecc1297173cea31c131ada7306b0d4c15efbd"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-drf-spectacular \
python314-drf-spectacular \
python3dist-drf-spectacular"

RDEPENDS:${PN} += "python-abi \
python314-Django \
python314-PyYAML \
python314-djangorestframework \
python314-inflection \
python314-jsonschema \
python314-uritemplate"

inherit rpm
