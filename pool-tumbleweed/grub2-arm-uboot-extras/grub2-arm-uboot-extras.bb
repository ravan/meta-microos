SUMMARY = "Unsupported modules for arm-uboot"
DESCRIPTION = "Unsupported modules for grub2-arm-uboot"
LICENSE = "GPL-3.0-or-later"

PV = "2.14"

RPM_NAME = "grub2-arm-uboot-extras-2.14-19.1.noarch.rpm"
RPM_HASH = "03c7735ead672b328f384761c453700401904e14f5680ba67903e3f0389bcb08ba607c2eb9d815c486c5f709684d84d6212c0786a038455323410a33cd9bcd0c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "grub2-arm-uboot-/usr/share/grub2/arm-uboot/zfs.mod \
grub2-arm-uboot-/usr/share/grub2/arm-uboot/zfscrypt.mod \
grub2-arm-uboot-/usr/share/grub2/arm-uboot/zfsinfo.mod \
grub2-arm-uboot-extras"

RDEPENDS:${PN} += "grub2-arm-uboot"

inherit rpm
