SUMMARY = "End of life dates for specific packages"
DESCRIPTION = "Package lifecycle data.  This is the source of zypper lifecycle information."
LICENSE = "MIT"

PV = "1"

RPM_NAME = "lifecycle-data-openSUSE-1-5.19.noarch.rpm"
RPM_HASH = "63ce591790fe2d401c48be572137b43d2316f71b621b485a65ba9c3cc5e9c5b3d79874df90ee69582ebffad1e895ab589593ce8b0a2a01ca283c4e9900338791"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "lifecycle-data-openSUSE"

RDEPENDS:${PN} += ""

inherit rpm
