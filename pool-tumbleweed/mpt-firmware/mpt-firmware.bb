SUMMARY = "Configuration files for autoloading mptctl at boot time"
DESCRIPTION = "This package contains modprobe configuration files to autoload the \
mptctl ioctl driver at boot time. The mptctl driver is an ioctl \
character driver for the LSI Logic Fusion-MPT Host adapter series. \
These adapters include \
 \
- Ultra320 53C1030, 53C1020 \
 \
- Fiber Channel FC909, FC919, FC929, FC919X and FC929X \
 \
- SAS SAS1064, and SAS1068"
LICENSE = "GPL-2.0+"

PV = "1.0"

RPM_NAME = "mpt-firmware-1.0-261.24.noarch.rpm"
RPM_HASH = "f133ce3e7c58ad587ae017d1f72135a93ab29bb0677eaee2b4ad47450853230afabf52886dca4cf2f11e4aff0bcf44bbc04834fa4e441fcedb8958240955564c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "mpt-firmware"

RDEPENDS:${PN} += "modutils"

inherit rpm
