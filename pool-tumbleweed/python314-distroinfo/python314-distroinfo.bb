SUMMARY = "Parsing, validation and query functions for packaging metadata"
DESCRIPTION = "Python module for parsing, validating and querying distribution/packaging \
metadata stored in human readable and reviewable text/YAML files."
LICENSE = "Apache-2.0"

PV = "0.6.3"

RPM_NAME = "python314-distroinfo-0.6.3-2.5.noarch.rpm"
RPM_HASH = "2e093d58a12447db601236618873c754cf84a1cc34acc678dd3fc11c901262c33c6d79eea92b29d53bf411f303c25d520502795c06aa2bc99a062d021c0f5099"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-distroinfo \
python314-distroinfo \
python3dist-distroinfo"

RDEPENDS:${PN} += "python-abi \
python314-PyYAML \
python314-pbr \
python314-requests \
python314-six"

inherit rpm
