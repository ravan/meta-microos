SUMMARY = "An uncommonly powerful .NET configuration library"
DESCRIPTION = "Nini is an uncommonly powerful .NET configuration library designed to \
help build highly configurable applications quickly."
LICENSE = "MIT"

PV = "1.1.0"

RPM_NAME = "nini-1.1.0-14.24.noarch.rpm"
RPM_HASH = "73627a4186ea853560e129a0872642409c0e23e6df4c62da72d6ce53e330fd15ae9ce51cdb98b47789cfe8da80810fd0f68cf1a513b120d6bdcebe119163491f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "mono-Nini \
nini \
pkgconfig-nini-1.1"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
mono-System \
mono-System.Xml \
mono-mscorlib"

inherit rpm
