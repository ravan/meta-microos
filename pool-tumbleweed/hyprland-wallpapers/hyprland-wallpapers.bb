SUMMARY = "Hyprland wallpapers"
DESCRIPTION = "Additional wallpapers for hyprland."
LICENSE = "BSD-3-Clause"

PV = "0.56.2"

RPM_NAME = "hyprland-wallpapers-0.56.2-1.2.noarch.rpm"
RPM_HASH = "a42a07cc601be7674480c6484bc9a7b0f2a23138547266dacf90439fc79213f73cedf16da9e8bb0e5675f0b1a6566fc4bee645d401e8a0de10e57d2af11a3081"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "hyprland-wallpapers"

RDEPENDS:${PN} += ""

inherit rpm
