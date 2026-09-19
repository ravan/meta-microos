SUMMARY = "Dynamic Kernel Module Support Framework"
DESCRIPTION = "This package contains the framework for the Dynamic \
Kernel Module Support (DKMS) method for installing \
module RPMS as originally developed by Dell."
LICENSE = "GPL-2.0-only"

PV = "3.3.0"

RPM_NAME = "dkms-3.3.0-1.3.noarch.rpm"
RPM_HASH = "af5ce5d5f58398d6f0d302db5c23f6d204530c40fa53ec07c29009718023002e1c95c15121355b3f669f49cfb500d45070fb938b26178dd91b99a20fdf0ac618"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "config-dkms \
dkms"

RDEPENDS:${PN} += "/usr/bin/bash \
/usr/bin/sh \
bash \
cpio \
findutils \
gawk \
gcc \
grep \
gzip \
kernel-syms \
make \
mktemp \
modutils \
sed \
systemd \
tar \
zstd"

inherit rpm
