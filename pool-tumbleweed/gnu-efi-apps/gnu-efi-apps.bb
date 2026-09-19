SUMMARY = "Example and test files for gnu-efi"
DESCRIPTION = "A package containing the example and UEFI testing files created by gnu-efi"
LICENSE = "BSD-3-Clause & GPL-2.0-or-later"

PV = "4.0.4"

RPM_NAME = "gnu-efi-apps-4.0.4-1.4.aarch64.rpm"
RPM_HASH = "52754081c42872c0cde9c04cf4f0d4cf0cad72600d62d46d23ac6259940ea6914203b8ca6495ebefea49fca8ae2925143f47c0b71786a76197dc4c8c2a4ed6bb"

RPROVIDES:${PN} += "gnu-efi-apps"

RDEPENDS:${PN} += ""

inherit rpm
