SUMMARY = "Development and Library files"
DESCRIPTION = "This tool lets you programatically (or manually) simulate keyboard input and \
mouse activity, move and resize windows, etc. It does this using X11's XTEST \
extension and other Xlib functions. \
 \
Library and Header files for xdotool"
LICENSE = "BSD-3-Clause"

PV = "4.20251130.1"

RPM_NAME = "xdotool-devel-4.20251130.1-1.4.aarch64.rpm"
RPM_HASH = "614e119bb9c5e400aa72602f04a70b3916fdc49c4d4128f52cff54f4e6e58ecc3c6488ac207186313e4fe1ffa566de468fbcc239d968489d420e30e166b02a3f"

RPROVIDES:${PN} += "pkgconfig-libxdo \
xdotool-devel"

RDEPENDS:${PN} += "/sbin/ldconfig \
/usr/bin/pkg-config \
pkgconfig-x11 \
xdotool"

inherit rpm
