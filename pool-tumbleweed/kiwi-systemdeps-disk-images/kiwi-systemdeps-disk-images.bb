SUMMARY = "KIWI - host requirements for disk images"
DESCRIPTION = "Host setup helper to pull in all packages required/useful on \
the build host to build disk images"
LICENSE = "GPL-3.0-or-later"

PV = "10.3.11"

RPM_NAME = "kiwi-systemdeps-disk-images-10.3.11-1.1.aarch64.rpm"
RPM_HASH = "ef610b9d2a68c371e3d4d1f46c25198116821567e13cafc88da0bb75d5f2678d162c86b4aad765f87eef8a6dcc9fd2ed9c8e9cb5b58402f3228328df305bfc51"

RPROVIDES:${PN} += "kiwi-image-oem \
kiwi-image-oem-requires \
kiwi-image-vmx \
kiwi-image-vmx-requires \
kiwi-systemdeps-disk-images"

RDEPENDS:${PN} += "binutils \
cryptsetup \
glibc-gconv-modules-extra \
gptfdisk \
kiwi-systemdeps-bootloaders \
kiwi-systemdeps-filesystems \
kiwi-systemdeps-iso-media \
kpartx \
lvm2 \
mdadm \
open-vmdk \
util-linux \
util-linux-systemd"

inherit rpm
