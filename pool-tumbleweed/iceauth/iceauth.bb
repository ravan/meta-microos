SUMMARY = "Utility to edit and display the ICE authorization information"
DESCRIPTION = "The iceauth program is used to edit and display the authorization \
information used in connecting with ICE. It operates very much \
like the xauth program for X11 connection authentication records."
LICENSE = "MIT"

PV = "1.0.11"

RPM_NAME = "iceauth-1.0.11-1.3.aarch64.rpm"
RPM_HASH = "48e6695ad00c149e0b2517cefff27a2e96334f102b2b097bad922c4770b6a12c24123e63554d8ef31cc81b5f93e1f3d376a5ec558066d2f329a3931c2f2791c9"

RPROVIDES:${PN} += "iceauth"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libICE.so.6 \
libc.so.6"

inherit rpm
