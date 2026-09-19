SUMMARY = "Development Files for libnma-gtk4"
DESCRIPTION = "Development Files for libnma-gtk4."
LICENSE = "GPL-2.0-or-later"

PV = "1.10.6"

RPM_NAME = "libnma-gtk4-devel-1.10.6-3.12.aarch64.rpm"
RPM_HASH = "c8230e5cb3dd6b70ad9ff5e628b61e3531d331245fcecceb692663b223a306871818f3ff3b970a0d1defc73b5174a1a556ce262df79249076a6587ca4c9e8948"

RPROVIDES:${PN} += "libnma-gtk4-devel \
pkgconfig-libnma-gtk4"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libnma-devel \
libnma-gtk4-0 \
pkgconfig-libnm \
typelib-1-0-NMA4-1-0"

inherit rpm
