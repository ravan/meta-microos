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

RPM_NAME = "udev-261.2-1.2.aarch64.rpm"
RPM_HASH = "16de9a05e661fd9f50b0a0469d641dc30cabae37cc1b3212b57a94f0203f6360da0336d7d2b2b63f9e4ce3ffd9e6f3581a5c5de7a4ad85b495fce242da68d635"

RPROVIDES:${PN} += "config-udev \
group-systemd-timesync \
libcryptsetup-token-systemd-fido2.so \
libcryptsetup-token-systemd-pkcs11.so \
libcryptsetup-token-systemd-tpm2.so \
pkgconfig-udev \
udev \
user-systemd-timesync"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
/usr/bin/sh \
coreutils \
filesystem \
group-kvm \
group-lp \
kmod \
ld-linux-aarch64.so.1 \
libblkid1 \
libc.so.6 \
libkmod2 \
libm.so.6 \
libsystemd-shared-261.2-1.2.so \
sed \
system-group-hardware \
systemd"

inherit rpm
