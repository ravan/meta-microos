SUMMARY = "Debug symbols for arm-uboot"
DESCRIPTION = "Debug information for grub2-arm-uboot \
 \
Information on how to debug grub can be found online: \
https://www.cnblogs.com/coryxie/archive/2013/03/12/2956807.html"
LICENSE = "GPL-3.0-or-later"

PV = "2.14"

RPM_NAME = "grub2-arm-uboot-debug-2.14-19.1.noarch.rpm"
RPM_HASH = "ded7605c7ece6ddd7fbbd5a7502056a8d3842fab1ce50022645f8a73d90fdddc280637e2d73ffc214d80d1ab8206b8556e78ce814bde3fd06f230eca4727683e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "grub2-arm-uboot-debug"

RDEPENDS:${PN} += "grub2-arm-uboot"

inherit rpm
