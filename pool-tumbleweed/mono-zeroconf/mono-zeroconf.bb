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

RPM_NAME = "mono-zeroconf-0.9.0-23.6.noarch.rpm"
RPM_HASH = "8840b04e118ce10181a69fb71cc4785bcb465769c1954f9c2c082f86ceb6583caaaf4a43f7685cce00a6f215120b86a642a305dced7d410f629c620a516466f5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "mono-MZClient \
mono-Mono.Zeroconf \
mono-policy.1.0.Mono.Zeroconf \
mono-policy.2.0.Mono.Zeroconf \
mono-policy.3.0.Mono.Zeroconf \
mono-policy.4.0.Mono.Zeroconf \
mono-zeroconf"

RDEPENDS:${PN} += "/usr/bin/bash \
mono-System \
mono-mscorlib \
mono-zeroconf-provider"

inherit rpm
