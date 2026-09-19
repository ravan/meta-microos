SUMMARY = "Wayland extension protocol for Hyprland"
DESCRIPTION = "This provides additional extensions of the Wayland protocol for Hyprland. \
 \
Development files for hyprland-protocols."
LICENSE = "BSD-3-Clause"

PV = "0.7.0"

RPM_NAME = "hyprland-protocols-devel-0.7.0-1.1.noarch.rpm"
RPM_HASH = "4c9ada706190aadb98189ed50f15a68b66e3231b2860db6a93e02ab2e134570e141b3787c022b772df764f4ed98d8f59899c27a8e398cfa7d4635215124cdccd"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "hyprland-protocols-devel \
pkgconfig-hyprland-protocols"

RDEPENDS:${PN} += "/usr/bin/pkg-config"

inherit rpm
