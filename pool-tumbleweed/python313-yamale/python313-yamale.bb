SUMMARY = "A schema and validator for YAML"
DESCRIPTION = "A schema and validator for YAML."
LICENSE = "MIT"

PV = "6.1.0"

RPM_NAME = "python313-yamale-6.1.0-1.4.noarch.rpm"
RPM_HASH = "0a05d3da1fec57f5d3cda1d3fe725c81fbc0799670edc8a8b9cac018786ad404c96c9d28d40341d4cd3291f1bbc2850cfa9d7b0e2f4b2c5db372ea61576f6b31"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-yamale \
python3.13dist-yamale \
python313-yamale \
python3dist-yamale"

RDEPENDS:${PN} += "/usr/bin/python3.13 \
/usr/bin/sh \
python-abi \
python313-PyYAML \
python313-ruamel.yaml \
update-alternatives"

inherit rpm
