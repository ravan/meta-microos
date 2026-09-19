SUMMARY = "Themes for Window Maker"
DESCRIPTION = "This package contains themes for the Window Maker window manager. \
Documentation: \
 \
/usr/share/doc/packages/wmthemes"
LICENSE = "GPL-2.0+"

PV = "0.1"

RPM_NAME = "WindowMaker-themes-0.1-395.24.noarch.rpm"
RPM_HASH = "6b2024e92506a8668a44f489176d9ec9ea6c1b5c78886adfe435349a883d4874c5d55c326efd6c5704963f691aa84bf8f22d74c02d34e79eff1886d5126a829d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "WindowMaker-themes \
wmthemes"

RDEPENDS:${PN} += "WindowMaker"

inherit rpm
