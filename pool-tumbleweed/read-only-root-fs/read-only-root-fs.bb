SUMMARY = "Files and Scripts for a RO root fileystem"
DESCRIPTION = "Files, scripts and directories to run the system with a \
read-only root filesystem with nested writable /etc BTRFS subvolume. \
 \
This package should never be installed in an already running \
system! It should only be selected by a system role for a \
read-only root filesystem with transactional updates. \
The package will create / modify entries for mounting /etc and /var. \
Those entries are used by dracut to mount the overlay file systems \
during the early boot phase."
LICENSE = "GPL-2.0-or-later"

PV = "1.0+git20260311.ea26e1b"

RPM_NAME = "read-only-root-fs-1.0+git20260311.ea26e1b-1.2.noarch.rpm"
RPM_HASH = "ae80e45dc308b97ada3ccb585be2481495beb357085cc038eff8341420965a4bcdbf08f42beda962e428d0e2cd949d72554521d3bca405aff6c14e8efc752671"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "config-read-only-root-fs \
read-only-root-fs"

RDEPENDS:${PN} += "/usr/bin/bash \
/usr/bin/gawk \
/usr/bin/mv \
/usr/bin/rsync \
/usr/bin/sh \
/usr/sbin/btrfs \
dracut \
snapper"

inherit rpm
