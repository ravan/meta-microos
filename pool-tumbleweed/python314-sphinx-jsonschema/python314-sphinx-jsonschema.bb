SUMMARY = "Sphinx extension to display JSON Schema"
DESCRIPTION = "Sphinx extension to display JSON Schema."
LICENSE = "GPL-3.0-only"

PV = "1.19.2"

RPM_NAME = "python314-sphinx-jsonschema-1.19.2-1.4.noarch.rpm"
RPM_HASH = "5b6a9800819d1470e739adf320285cac2ec338a4aebd8fd62ec275eb5b06f7f086212d53540f6ad57c5fb6aff9e1c40203c686da0f634c2e2c148f5a414dfc85"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-sphinx-jsonschema \
python314-sphinx-jsonschema \
python3dist-sphinx-jsonschema"

RDEPENDS:${PN} += "python-abi \
python314-PyYAML \
python314-docutils \
python314-jsonpointer \
python314-requests"

inherit rpm
