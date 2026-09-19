SUMMARY = "Supplement packaging Python releases"
DESCRIPTION = "Tools to supplement packaging Python releases."
LICENSE = "MIT"

PV = "10.4.0"

RPM_NAME = "python314-jaraco.packaging-10.4.0-1.2.noarch.rpm"
RPM_HASH = "a6ca684981c9c341ab0e69d5b8b8189f4de12ce444b70e18b09039db73d489c233f851d695ecfbbbc6306994b208512824b81affaab7aa3928d144c33576fae5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-jaraco.packaging \
python314-jaraco.packaging \
python3dist-jaraco.packaging"

RDEPENDS:${PN} += "python-abi \
python314-Sphinx \
python314-build \
python314-domdf-python-tools \
python314-jaraco.context \
python314-virtualenv"

inherit rpm
