SUMMARY = "Configuration for module loading and SUSE-specific utilities for KMPs"
DESCRIPTION = "This package contains helper scripts for KMP installation and \
uninstallation, as well as default configuration files for depmod and \
modprobe."
LICENSE = "GPL-2.0-or-later"

PV = "16.1.7"

RPM_NAME = "suse-module-tools-16.1.7-1.1.aarch64.rpm"
RPM_HASH = "3484b030db1e9749e0201acc5d71936da1e8e42b85d82f89e89507bda76fce62ac22dc3532fc051cadb370defad4a875b7c8ca1e69bfa5586adcc4dc4ad452b0"

RPROVIDES:${PN} += "suse-module-tools \
system-tuning-common-SUSE \
udev-extra-rules"

RDEPENDS:${PN} += "/usr/bin/bash \
/usr/bin/grep \
/usr/bin/gzip \
/usr/bin/sed \
/usr/bin/sh \
coreutils \
findutils \
rpm \
systemd-rpm-macros \
util-linux"

inherit rpm
