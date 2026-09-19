SUMMARY = "Shared data for Kismet and its plug-ins"
DESCRIPTION = "Kismet is a wireless network and device detector, sniffer, wardriving \
tool, and WIDS (wireless intrusion detection) framework. \
 \
This subpackage sets up the system user/group for the rest of Kismet."
LICENSE = "GPL-2.0-or-later"

PV = "2025_09_R1"

RPM_NAME = "kismet-common-2025_09_R1-2.3.noarch.rpm"
RPM_HASH = "72f31bf0a939a3d58661a8d4d5acad04469a47265c22e89c30648d2db720aced612ec4d945b19e22bc8234f153c6e910590153306dc36c475b4561ba2830338d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "group-kismet \
kismet-common \
user-kismet"

RDEPENDS:${PN} += "/usr/bin/sh \
sysuser-shadow"

inherit rpm
