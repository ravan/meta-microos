SUMMARY = "Unsupported modules for arm-efi"
DESCRIPTION = "Unsupported modules for grub2-arm-efi"
LICENSE = "GPL-3.0-or-later"

PV = "2.14"

RPM_NAME = "grub2-arm-efi-extras-2.14-19.1.noarch.rpm"
RPM_HASH = "8486a81213c531df1a96a81cd71360ecb65bce973f881efd43020d0fe19339e9c05e4da2ccbc61c2c389464bd018aa951bb62d26ee6c831bec294be900843288"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "grub2-arm-efi-/usr/share/grub2/arm-efi/zfs.mod \
grub2-arm-efi-/usr/share/grub2/arm-efi/zfscrypt.mod \
grub2-arm-efi-/usr/share/grub2/arm-efi/zfsinfo.mod \
grub2-arm-efi-extras"

RDEPENDS:${PN} += "grub2-arm-efi"

inherit rpm
