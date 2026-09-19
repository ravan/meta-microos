SUMMARY = "Mint-X icon theme"
DESCRIPTION = "A mint/metal theme based on mintified versions of \
Clearlooks Revamp, Elementary and Faenza."
LICENSE = "GPL-3.0-or-later"

PV = "1.7.5"

RPM_NAME = "mint-x-icon-theme-1.7.5-1.2.noarch.rpm"
RPM_HASH = "67cef82165b1951c0b8f6956371273ff69c3c6a42f124e633515365cdbeb67d0eae7ab39d9a79942310baf2554e4830eecd8c700ad371c9ae89be9be073bc6cd"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "mint-x-icon-theme"

RDEPENDS:${PN} += "adwaita-icon-theme \
hicolor-icon-theme"

inherit rpm
