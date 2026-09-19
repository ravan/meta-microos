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

RPM_NAME = "mono-zeroconf-provider-avahi-0.9.0-23.6.noarch.rpm"
RPM_HASH = "f5557a6e8092e0e783f1f69c65ba725e46aa3226576fa70843061b087dac7e7a83f7fccde12bc86f94c67f109a39be96903cb3eeb7f93f5d5cd6f4fe3b46c4ac"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "mono-Mono.Zeroconf.Providers.AvahiDBus \
mono-zeroconf-provider \
mono-zeroconf-provider-avahi"

RDEPENDS:${PN} += "avahi \
mono-Mono.Posix \
mono-Mono.Zeroconf \
mono-System \
mono-System.Xml \
mono-mscorlib"

inherit rpm
