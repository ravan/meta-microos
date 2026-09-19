SUMMARY = "A cross platform Zero Configuration Networking library for Mono"
DESCRIPTION = "Mono.Zeroconf is a cross platform Zero Configuration Networking library \
for Mono and .NET. It provides a unified API for performing the most \
common zeroconf operations on a variety of platforms and subsystems: \
all the operating systems supported by Mono and both the Avahi and \
Bonjour/mDNSResponder transports. \
 \
 \
 \
Authors: \
-------- \
    Aaron Bockover <abockover@novell.com>"
LICENSE = "MIT"

PV = "0.9.0"

RPM_NAME = "mono-zeroconf-doc-0.9.0-23.6.noarch.rpm"
RPM_HASH = "e8443e773e83ada775f747b5b7254bbb5786d3f098dddfc84efdb5d0ce1c99b2faef44268fffb2eadcdaa2574908aceee968d57fa1d2d1e188cf20415e8803bb"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "mono-zeroconf-doc"

RDEPENDS:${PN} += ""

inherit rpm
