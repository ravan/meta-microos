SUMMARY = "Common data for the 'transmission' BitTorrent client"
DESCRIPTION = "Transmission is a BitTorrent client. It has GTK+ and Qt GUI clients, \
a daemon for servers and headless use, and both can be remote \
controlled by HTTP and the terminal. It supports Local Peer \
Discovery, DHT, µTP, PEX and magnet links."
LICENSE = "(GPL-2.0-only | GPL-3.0-only) & MIT"

PV = "4.1.3"

RPM_NAME = "transmission-common-4.1.3-1.2.noarch.rpm"
RPM_HASH = "670b94e9504fe23ff27b0b397d9d6defdf662716cf85bf93230b1446427f95d0e9607fc8125e63ae4c68fec1018ff3ccb0e66e3a2f9810757dffaf6e651469ed"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "transmission-common"

RDEPENDS:${PN} += "alts \
transmission-ui"

inherit rpm
