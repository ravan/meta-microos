SUMMARY = "Unsupported modules for arm64-efi"
DESCRIPTION = "Unsupported modules for grub2-arm64-efi"
LICENSE = "GPL-3.0-or-later"

PV = "2.14"

RPM_NAME = "grub2-arm64-efi-extras-2.14-19.1.noarch.rpm"
RPM_HASH = "66573706f52102a9393de363240efd435a73f9904928774ea7ded9a7f36aa1bc844aaa553935a6608b6ec97034e434c0b1656f2b4bf61711871d8c425644e8b4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "grub2-arm64-efi-/usr/share/grub2/arm64-efi/zfs.mod \
grub2-arm64-efi-/usr/share/grub2/arm64-efi/zfscrypt.mod \
grub2-arm64-efi-/usr/share/grub2/arm64-efi/zfsinfo.mod \
grub2-arm64-efi-extras"

RDEPENDS:${PN} += "grub2-arm64-efi"

inherit rpm
