SUMMARY = "Utility to list client applications running on a X11 server"
DESCRIPTION = "xlsclients is a utility for listing information about the client \
applications running on a X11 server."
LICENSE = "X11"

PV = "1.1.6"

RPM_NAME = "xlsclients-1.1.6-1.3.aarch64.rpm"
RPM_HASH = "581bf7be8fc7ba51c20844a39dda934a9a308177ca70bd23dee063753a3c30620e13431207ce4f84965405fc18d19d3bcfe0006c29e7284495b27aec19d219d9"

RPROVIDES:${PN} += "xlsclients"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libxcb.so.1"

inherit rpm
