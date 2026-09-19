SUMMARY = "Linux headers for i386 userspace cross development"
DESCRIPTION = "This package provides Linux kernel headers for i386, the kernel API description \
required for compilation of almost all programs."
LICENSE = "GPL-2.0-only"

PV = "7.2"

RPM_NAME = "cross-i386-linux-glibc-devel-7.2-2.1.noarch.rpm"
RPM_HASH = "586f72d464761631fd00240b23efcfdecf9fb359f13baadac807f6172642601d5d64ec600594c2ed5da7d1c7c8289f2a8d4770283cd93572f69de490770f5141"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "cross-i386-linux-glibc-devel"

RDEPENDS:${PN} += ""

inherit rpm
