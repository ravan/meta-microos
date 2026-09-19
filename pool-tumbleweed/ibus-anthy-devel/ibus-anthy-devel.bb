SUMMARY = "Development files for ibus-anthy"
DESCRIPTION = "The ibus-anthy-devel package includes the header files for the ibus-anthy package."
LICENSE = "GPL-2.0-or-later"

PV = "1.5.17"

RPM_NAME = "ibus-anthy-devel-1.5.17-2.4.aarch64.rpm"
RPM_HASH = "e22cb868e429252d74eb5f647e2fdaa5625407a00828d7380ba5dc6c6c0a34e6e1fe8d228aa3f2812ec168ed2d342d471898c2f1b73cb74332308bf155a9fc8a"

RPROVIDES:${PN} += "ibus-anthy-devel"

RDEPENDS:${PN} += "ibus-anthy"

inherit rpm
