SUMMARY = "A rule-based device node and kernel event manager"
DESCRIPTION = "This package provides systemd-udevd. The udev daemon receives device uevents \
directly from the kernel whenever it adds or removes a device from the system in \
/dev, or it changes its state. When udev receives a device event, it matches its \
configured set of rules, located in /usr/lib/udev/rules.d/, against various device \
attributes to identify the device. Rules that match may adjust device node \
permissions, create meaningful symlink names or provide additional device \
information to be stored in the udev database. \
 \
The udev daemon may also rename network interfaces and perform various network \
device configurations, see systemd.link(5) for more details. \
 \
This package also provides various tools and services that operate on devices \
exclusively. For example it contains systemd-cryptsetup to manage encrypted \
block devices as well as systemd-growfs to instruct the kernel to grow the \
mounted filesystem to full size of the underlying block device. \
 \
This package shouldn't be necessary in containers."
LICENSE = "GPL-2.0-only"

PV = "261.2"

RPM_NAME = "udev-mini-261.2-1.1.aarch64.rpm"
RPM_HASH = "b7fde0a25e4123297dae48bebf607b24629a2162f5de2ac76e3364b0419894d978f2a677e05fa8ce1094b844cd93c7c02f66fe455c5bd783c783e9a53cdb1723"

RPROVIDES:${PN} += "config-udev-mini \
group-systemd-timesync \
pkgconfig-udev \
udev \
udev-mini \
user-systemd-timesync"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
/usr/bin/sh \
coreutils \
filesystem \
group-kvm \
group-lp \
ld-linux-aarch64.so.1 \
libc.so.6 \
libm.so.6 \
libsystemd-shared-261.2-1.1.so \
sed \
system-group-hardware \
systemd \
systemd-mini"

inherit rpm
