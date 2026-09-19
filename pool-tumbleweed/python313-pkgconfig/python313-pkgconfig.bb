SUMMARY = "Interface Python with pkg-config"
DESCRIPTION = "A Python module to interface with the pkg-config \
command line tool"
LICENSE = "MIT"

PV = "1.6.0"

RPM_NAME = "python313-pkgconfig-1.6.0-1.2.noarch.rpm"
RPM_HASH = "8abc7061d31caec5adf4a1f42b9e911ffb8f76bae3bece0c2a17b04022ec10b8380abf8465660f50e356b31cda2ebe0fe16b46f46fbbfe8124507fe5d2ab9232"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-pkgconfig \
python3.13dist-pkgconfig \
python313-pkgconfig \
python3dist-pkgconfig"

RDEPENDS:${PN} += "pkgconfig \
python-abi"

inherit rpm
