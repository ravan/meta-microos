SUMMARY = "A terminal descriptions database for screen"
DESCRIPTION = "This package includes some useful entries for the screen utility in the \
terminfo database, which might introduce trouble if used over network \
connections like ssh or slogin onto systems without those terminfo database \
entries."
LICENSE = "MIT"

PV = "6.6.20260815"

RPM_NAME = "terminfo-screen-6.6.20260815-111.1.aarch64.rpm"
RPM_HASH = "768074cfb0b4f134ef18be4826c8ae47dba14a7db4c01473686a1288d52880e8d806d5fe8384cbcf3aa89772a265ff538e3235339b584b8bd4addbc1390bc62e"

RPROVIDES:${PN} += "terminfo-/usr/share/terminfo/s/screen.konsole \
terminfo-screen"

RDEPENDS:${PN} += "terminfo-base"

inherit rpm
