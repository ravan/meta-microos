SUMMARY = "Interface Python with pkg-config"
DESCRIPTION = "A Python module to interface with the pkg-config \
command line tool"
LICENSE = "MIT"

PV = "1.6.0"

RPM_NAME = "python314-pkgconfig-1.6.0-1.2.noarch.rpm"
RPM_HASH = "ef508be3d315493382e820c6c78d55e8fd552cfba3359fe177ee1cda6fc872a90790a4e41a630313373e308961c78b93e5cc97a5ed9645853556d2a6e357ea14"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-pkgconfig \
python314-pkgconfig \
python3dist-pkgconfig"

RDEPENDS:${PN} += "pkgconfig \
python-abi"

inherit rpm
