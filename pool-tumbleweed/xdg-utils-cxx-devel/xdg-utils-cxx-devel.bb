SUMMARY = "Development files for xdg-utils-cxx"
DESCRIPTION = "Development files for xdg-utils-cxx."
LICENSE = "MIT"

PV = "1.0.1"

RPM_NAME = "xdg-utils-cxx-devel-1.0.1-2.5.aarch64.rpm"
RPM_HASH = "5828a810876a18e4c6d071c36e25d25dd55110dec46dc5eb8a250b60fa9346979ed435cc2d2851390c119d8f9dda9a5fe9e046a112eaa58bf40ee7b94a035143"

RPROVIDES:${PN} += "cmake-XdgUtils \
xdg-utils-cxx-devel"

RDEPENDS:${PN} += "libXdgUtilsBaseDir1-0-1 \
libXdgUtilsDesktopEntry1-0-1"

inherit rpm
