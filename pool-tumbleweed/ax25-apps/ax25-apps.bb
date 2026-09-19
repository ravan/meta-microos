SUMMARY = "AX.25 ham radio applications"
DESCRIPTION = "This package provides specific user applications for hamradio that use AX.25 \
Net/ROM or ROSE network protocols: \
 \
 * axcall: a general purpose AX.25, NET/ROM and ROSE connection program. \
 * axlisten: a network monitor of all AX.25 traffic heard by the system. \
 * ax25ipd: an RFC1226 compliant daemon which provides encapsulation of \
   AX.25 traffic over IP. \
 * ax25mond: retransmits data received from sockets into an AX.25 monitor \
   socket."
LICENSE = "GPL-2.0-or-later"

PV = "0.0.8~rc5"

RPM_NAME = "ax25-apps-0.0.8~rc5-2.3.aarch64.rpm"
RPM_HASH = "cc6f99a724d86fc0555fb21a330c726fc74236cdb9045446a40394466db1adcd7adfbf720d012e195aed1fcde89f59ec5d6f2916326b1f6981bdf5c744fd74ca"

RPROVIDES:${PN} += "ax25-apps"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libax25.so.0 \
libc.so.6 \
libncursesw.so.6 \
libtinfo.so.6"

inherit rpm
