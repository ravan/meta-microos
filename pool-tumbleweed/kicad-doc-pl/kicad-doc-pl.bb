SUMMARY = "Polish documentation and tutorials for KiCad"
DESCRIPTION = "This package contains Polish documentation and tutorials for KiCad"
LICENSE = "CC-BY-SA-3.0 & GPL-3.0-or-later"

PV = "10.0.6"

RPM_NAME = "kicad-doc-pl-10.0.6-1.1.noarch.rpm"
RPM_HASH = "65cb06a0945f2c6ec5b70b6003743421ea6373f063e2653c5b0ec7d25a0d0c9d2b0000ad0a33e229b4ca2c0882c6f3e88aa40679886e4ce8152ea991f4b09810"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "kicad-doc-pl \
locale-kicad-doc-pl"

RDEPENDS:${PN} += "kicad-doc-en"

inherit rpm
