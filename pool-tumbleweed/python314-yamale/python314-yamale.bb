SUMMARY = "A schema and validator for YAML"
DESCRIPTION = "A schema and validator for YAML."
LICENSE = "MIT"

PV = "6.1.0"

RPM_NAME = "python314-yamale-6.1.0-1.4.noarch.rpm"
RPM_HASH = "cfcf90137fb79d0df395e778f58743e8ee78e040a56965862d5f1782f19865f6dbb57bc59c23ed9e79d08cf11135827812b64cc60568e96488ff361082c232a9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-yamale \
python314-yamale \
python3dist-yamale"

RDEPENDS:${PN} += "/usr/bin/python3.14 \
/usr/bin/sh \
python-abi \
python314-PyYAML \
python314-ruamel.yaml \
update-alternatives"

inherit rpm
