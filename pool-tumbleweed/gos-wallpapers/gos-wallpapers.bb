SUMMARY = "Good Old SUSE Wallpapers"
DESCRIPTION = "This package contains wallpapers from older SUSE releases."
LICENSE = "GPL-2.0+"

PV = "2010"

RPM_NAME = "gos-wallpapers-2010-17.24.noarch.rpm"
RPM_HASH = "7205136fbd3bb1c9b3b07b51e344974d1c652a69f51dfb69803e71860aac3fd089bdbd0debec19f059fcc2b52113c4d3d7b8386d2a3581e22ea02ac433335a01"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "gos-wallpapers"

RDEPENDS:${PN} += ""

inherit rpm
