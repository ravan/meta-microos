SUMMARY = "Debug symbols for arm-efi"
DESCRIPTION = "Debug symbols for grub2-arm-efi \
 \
Information on how to debug grub can be found online: \
https://www.cnblogs.com/coryxie/archive/2013/03/12/2956807.html"
LICENSE = "GPL-3.0-or-later"

PV = "2.14"

RPM_NAME = "grub2-arm-efi-debug-2.14-19.1.noarch.rpm"
RPM_HASH = "3a2b3859f9d84b7364e299c4ba615ea6f011f164da4b77cc1cf773e36d5e9eecc44685d9d952825c77a0b37e4570947d107cdf4ae8d21c84b1ddad532c054d25"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "grub2-arm-efi-debug"

RDEPENDS:${PN} += "grub2-arm-efi"

inherit rpm
