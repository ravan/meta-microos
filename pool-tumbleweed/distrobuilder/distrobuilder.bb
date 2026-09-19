SUMMARY = "System container image builder for LXC and LXD/Incus"
DESCRIPTION = "System container image builder for LXC and LXD/Incus."
LICENSE = "Apache-2.0"

PV = "3.3.1"

RPM_NAME = "distrobuilder-3.3.1-1.7.aarch64.rpm"
RPM_HASH = "aefe1d0437420393394c74867558383ce3e06a088d88f4b850383cb1d8ddae5c7c733957bc7cc0ef83aacf343826e0137c3a57a209a35168911278066c4d31a5"

RPROVIDES:${PN} += "distrobuilder"

RDEPENDS:${PN} += "btrfsprogs \
bzip2 \
debootstrap \
dirmngr \
dosfstools \
e2fsprogs \
git-core \
gpg2 \
gptfdisk \
gzip \
hivex \
libc.so.6 \
lzip \
lzop \
mkisofs \
python3-xattr \
qemu-img \
rsync \
squashfs \
wimtools \
xz \
zstd"

inherit rpm
