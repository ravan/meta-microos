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

RPM_NAME = "mono-zeroconf-devel-0.9.0-23.6.noarch.rpm"
RPM_HASH = "544b6bbc3a576aa675e5ebf946e1544a96de4841c6fe94c0b147517e9be1ae580469350da18d0b7535cc0f50bac489bc7c882349dedcc20a6f6bd8dcd22c8f82"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "mono-zeroconf-devel \
pkgconfig-mono-zeroconf"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
mono-zeroconf"

inherit rpm
