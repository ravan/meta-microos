SUMMARY = "Dependency generator dependencies for Python RPMs"
DESCRIPTION = "This package contains the dependencies for Python RPMs to generate \
dependencies automatically."
LICENSE = "WTFPL"

PV = "20260909.65d2791"

RPM_NAME = "python-rpm-generators-20260909.65d2791-1.1.noarch.rpm"
RPM_HASH = "4978bd8312cabf64975a1236db1323d7901167a7a5b01e4641b551e0144c639bad4990d23d61c978560dff252d9ece29a13751ab6fbfe65fb9ea2da8d9385ea3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python-rpm-generators \
python3-rpm-generators"

RDEPENDS:${PN} += "python-rpm-macros \
python3-setuptools"

inherit rpm
