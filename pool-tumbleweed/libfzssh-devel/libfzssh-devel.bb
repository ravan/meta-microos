SUMMARY = "Development package for libfzssh"
DESCRIPTION = "Files needed for development with libfzssh."
LICENSE = "AGPL-3.0-or-later"

PV = "1.4.0"

RPM_NAME = "libfzssh-devel-1.4.0-1.1.aarch64.rpm"
RPM_HASH = "87f79436d8e1ef88be8b2232f3eff6c51780a16f40543c48c4b3cc1ff92bf109f676e4d33283c40769799d7735caa50fba38c89e3affe2517ef232aae53d78aa"

RPROVIDES:${PN} += "libfzssh-devel \
pkgconfig-libfzssh-client"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libfzssh14-0-0"

inherit rpm
