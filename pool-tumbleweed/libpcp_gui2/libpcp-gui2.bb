SUMMARY = "Performance Co-Pilot run-time GUI library"
DESCRIPTION = "Performance Co-Pilot (PCP) run-time graphical user interface library"
LICENSE = "LGPL-2.1+"

PV = "6.3.8"

RPM_NAME = "libpcp_gui2-6.3.8-3.1.aarch64.rpm"
RPM_HASH = "4fe6fe419dfacf2b19349d436271ba8b08f40de3b0bb793acd71cc62a3a45dab3d75eb20ed92bcb598f9e783c9cf996483ad53d2e9b1535f3d5c00bd6c465da9"

RPROVIDES:${PN} += "libpcp-gui.so.2 \
libpcp-gui2"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libpcp.so.3"

inherit rpm
