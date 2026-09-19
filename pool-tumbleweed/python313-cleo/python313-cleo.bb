SUMMARY = "Python module for creating testable command-line interfaces"
DESCRIPTION = "Cleo allows you to create beautiful and testable command-line interfaces."
LICENSE = "MIT"

PV = "2.1.0"

RPM_NAME = "python313-cleo-2.1.0-1.12.noarch.rpm"
RPM_HASH = "efcb88414ae138d3a326899f06b43ab83e97ed648c0d3dd480d685104dc448e08d537f96b3ad971910f511e4ffa3c92786ad902d3542c25a7835e79a396b7b44"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-cleo \
python3.13dist-cleo \
python313-cleo \
python3dist-cleo"

RDEPENDS:${PN} += "python-abi \
python313-crashtest \
python313-pylev \
python313-rapidfuzz"

inherit rpm
