SUMMARY = "installer and related files needed on network medium"
DESCRIPTION = "This package contains kernel, initrd and installation images \
needed on the network install medium to start an installation."
LICENSE = "GPL-2.0-or-later"

PV = "17.178"

RPM_NAME = "skelcd-installer-net-MicroOS-17.178-1.9.aarch64.rpm"
RPM_HASH = "320766860e4f4928281318a4b8e86e0d318698fc90a81927f512bfbe372ce02a5e4f86f2a6b23ff7490518917eddd2c4b55a0254b79a5e82cf541d78a1f74f47"

RPROVIDES:${PN} += "skelcd-installer \
skelcd-installer-net-MicroOS"

RDEPENDS:${PN} += ""

inherit rpm
