SUMMARY = "Sane and flexible OpenAPI 3 schema generation for Django REST framework"
DESCRIPTION = "Sane and flexible OpenAPI 3 schema generation for Django REST framework"
LICENSE = "BSD-3-Clause"

PV = "0.30.0"

RPM_NAME = "python313-drf-spectacular-0.30.0-1.1.noarch.rpm"
RPM_HASH = "1dd8d84c176020fe1d7d47cca3ce4afd545cc93258c664377f39d056d33f46d1062ea324466017f206a0c47da923139eb46b05b546335af4f83647e3d680c877"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-drf-spectacular \
python3.13dist-drf-spectacular \
python313-drf-spectacular \
python3dist-drf-spectacular"

RDEPENDS:${PN} += "python-abi \
python313-Django \
python313-PyYAML \
python313-djangorestframework \
python313-inflection \
python313-jsonschema \
python313-uritemplate"

inherit rpm
