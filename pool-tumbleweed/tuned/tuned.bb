SUMMARY = "A dynamic adaptive system tuning daemon"
DESCRIPTION = "The tuned package contains a daemon that tunes system settings dynamically. \
It does so by monitoring the usage of several system components periodically. \
Based on that information components will then be put into lower or higher \
power saving modes to adapt to the current usage. Currently only ethernet \
network and ATA harddisk devices are implemented."
LICENSE = "GPL-2.0-or-later"

PV = "2.27.0.0+git.38d4414"

RPM_NAME = "tuned-2.27.0.0+git.38d4414-1.2.noarch.rpm"
RPM_HASH = "447bcaa93c68290814bc0ce1f86b3f8261f2350a01e467096d98440023bdbf08e6c317aa75bb495d7c3cea30e9de6209982b11869f2c2803e3ca1a22b78b6dfc"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "config-tuned \
tuned"

RDEPENDS:${PN} += "/usr/bin/bash \
/usr/bin/python3 \
/usr/bin/sh \
ethtool \
gawk \
hdparm \
polkit \
python-abi \
python3-configobj \
python3-dbus-python \
python3-decorator \
python3-linux-procfs \
python3-pyinotify \
python3-pyudev \
systemd \
typelib-GLib \
typelib-GObject \
util-linux \
virt-what"

inherit rpm
