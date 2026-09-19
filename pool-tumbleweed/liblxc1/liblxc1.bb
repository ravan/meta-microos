SUMMARY = "LXC container runtime library"
DESCRIPTION = "This package provides the LXC container runtime library."
LICENSE = "LGPL-2.1-only"

PV = "7.0.0"

RPM_NAME = "liblxc1-7.0.0-1.3.aarch64.rpm"
RPM_HASH = "efab0047e594523a7cc3d18e792980f2009eb38066e83a0f1a4b353ba031e73613338fea0b32a8ce140ee55dd8087500d19530fc71480b2136128fee515203a3"

RPROVIDES:${PN} += "config-liblxc1 \
liblxc.so.1 \
liblxc1"

RDEPENDS:${PN} += "/sbin/ldconfig \
/usr/bin/sh \
findutils \
group-kvm \
ld-linux-aarch64.so.1 \
libapparmor.so.1 \
libc.so.6 \
libcap.so.2 \
libdbus-1.so.3 \
libgcc-s.so.1 \
libseccomp.so.2 \
libselinux.so.1 \
permissions"

inherit rpm
