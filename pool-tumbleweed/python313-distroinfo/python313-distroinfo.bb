SUMMARY = "Parsing, validation and query functions for packaging metadata"
DESCRIPTION = "Python module for parsing, validating and querying distribution/packaging \
metadata stored in human readable and reviewable text/YAML files."
LICENSE = "Apache-2.0"

PV = "0.6.3"

RPM_NAME = "python313-distroinfo-0.6.3-2.5.noarch.rpm"
RPM_HASH = "c73524d17b0c780d47fe0b61996a4c4aa51a91cee0b6f0708b930669f28fb9ed8dc8b05427e7f2cb7fe7faa82bbd930a839d7429d83a3094789c6ca130ae8305"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-distroinfo \
python3.13dist-distroinfo \
python313-distroinfo \
python3dist-distroinfo"

RDEPENDS:${PN} += "python-abi \
python313-PyYAML \
python313-pbr \
python313-requests \
python313-six"

inherit rpm
