SUMMARY = "Image for Boot Loader Specification (BLS) support on arm-efi"
DESCRIPTION = "Custom EFI build tailored for Boot Loader Specification (BLS) support."
LICENSE = "GPL-3.0-or-later"

PV = "2.14"

RPM_NAME = "grub2-arm-efi-bls-2.14-19.1.noarch.rpm"
RPM_HASH = "60d8b3ec831d53ab61cc481c5fdf92c678e4785e71d133129784445785ffe1e1266d62d62684a4947231f482ea79dfd86afd5d47b7e042f4d923e408521b193d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "grub2-arm-efi-bls"

RDEPENDS:${PN} += ""

inherit rpm
