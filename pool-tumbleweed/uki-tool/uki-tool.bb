SUMMARY = "Tool for the UKI and static-initrd project"
DESCRIPTION = "Tool that regroups useful command dealing with the Unified Kernel Image (UKI) \
and static-initrd project. Write in Shell script, and adapted for the packaging."
LICENSE = "MIT"

PV = "1.5.0+1.g563332e"

RPM_NAME = "uki-tool-1.5.0+1.g563332e-1.4.noarch.rpm"
RPM_HASH = "144cd08b7c836a6063605240de0651052f2d25e6887e0d2b02a3917c1a243d5bf06f7b0860241ce1cefa63f3e89ef46b01fa09f6aa6d91e1895d10d435bf52a6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "uki-tool"

RDEPENDS:${PN} += "/usr/bin/sh \
awk \
bash-sh \
bind-utils \
binutils \
coreutils \
dracut \
e2fsprogs \
rpm \
squashfs"

inherit rpm
