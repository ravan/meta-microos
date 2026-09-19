SUMMARY = "Image for Boot Loader Specification (BLS) support on arm64-efi"
DESCRIPTION = "Custom EFI build tailored for Boot Loader Specification (BLS) support."
LICENSE = "GPL-3.0-or-later"

PV = "2.14"

RPM_NAME = "grub2-arm64-efi-bls-2.14-19.1.noarch.rpm"
RPM_HASH = "5a46b8ac7c137070b442d5361ea932f4824ce535d7e35069c593c8ff468724658785316bef592d73716f69d05814f0450e2a49348165a4d0f9439f0759c9bfc2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "grub2-arm64-efi-bls"

RDEPENDS:${PN} += ""

inherit rpm
