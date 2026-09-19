SUMMARY = "Virtual machine needed for libguestfs"
DESCRIPTION = "libguestfs-appliance provides the appliance used by libguestfs."
LICENSE = "GPL-2.0-or-later"

PV = "1.60.1"

RPM_NAME = "libguestfs-appliance-1.60.1-1.1.aarch64.rpm"
RPM_HASH = "008f6c4eec78fce5c2e04cd7c8344143208d50b5186f1cdab040b5d1ff8fc4c6558888275ccd1e5e387ec35c742f0a132e8016d6ea3a413297ca9b3c59116323"

RPROVIDES:${PN} += "guestfs-data \
libguestfs-appliance"

RDEPENDS:${PN} += "augeas \
augeas-lenses \
btrfsprogs \
cryptsetup \
dhcpcd \
dosfstools \
e2fsprogs \
gptfdisk \
jfsutils \
ldmtool \
libaugeas0 \
libcap2 \
libguestfs0 \
libhivex0 \
libpcre2-8-0 \
mdadm \
mkisofs \
parted \
qemu-tools \
supermin \
xfsprogs"

inherit rpm
