SUMMARY = "Create driver update disks (DUD)."
DESCRIPTION = "Create driver update disks (DUD). \
 \
Authors: \
-------- \
    Steffen Winterfeldt"
LICENSE = "GPL-3.0-or-later"

PV = "2.6"

RPM_NAME = "mkdud-2.6-1.2.noarch.rpm"
RPM_HASH = "0b7393380fc76cc219934f746f3bdc1ff010a7e069e9fe2f6ceada8e8b9edafcfadd506f0216aa589fa04f26facd496e37275cbb32253a49c5ddaddd2ba06e7f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "mkdud"

RDEPENDS:${PN} += "/usr/bin/perl \
binutils \
coreutils \
cpio \
file \
findutils \
grep \
gzip \
kmod \
rpm \
rpm-build \
tar \
util-linux \
xz \
zstd"

inherit rpm
