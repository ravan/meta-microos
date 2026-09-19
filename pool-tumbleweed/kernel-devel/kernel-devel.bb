SUMMARY = "Development files needed for building kernel modules"
DESCRIPTION = "Kernel-level headers and Makefiles required for development of \
external kernel modules. \
 \
 \
Source Timestamp: 2026-09-12 06:50:42 +0000 \
GIT Revision: 6b7e8a968cce3b45e63d59e1d4981c9b7c5bc6b5 \
GIT Branch: stable"
LICENSE = "GPL-2.0-only"

PV = "7.2.5"

RPM_NAME = "kernel-devel-7.2.5-1.1.noarch.rpm"
RPM_HASH = "be63af1cdb76a2922535ec408be43ac215d01ceed5d2534b95678d6305d93afc125e32acfe93477d0f24b0d7b4f5670d0a96f4a26a3378871e0b9827f235259c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "kernel-devel \
multiversion-kernel"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
kernel-macros"

inherit rpm
