SUMMARY = "Scripts aimed at automating some menial installation/recovery tasks"
DESCRIPTION = "This package provides helper scripts originating in Arch Linux that are useful during manual installation and recovery of any Linux distro. \
 \
* genfstab: Automatically generate an fstab file \
* arch-chroot: Set up bind mounts and chroot into the target system"
LICENSE = "GPL-2.0-only"

PV = "30"

RPM_NAME = "arch-install-scripts-30-1.3.noarch.rpm"
RPM_HASH = "019a42b0cdf9fe4a07560758fb2250e60d3171fe3355fec81720d6d9cfdc8703eee86bfaf149701a0b0084ea6081e6cd2e5e8c96f893f65d50ea7fa429b77646"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "arch-install-scripts"

RDEPENDS:${PN} += "/usr/bin/bash \
awk \
bash \
coreutils \
util-linux \
util-linux-systemd"

inherit rpm
