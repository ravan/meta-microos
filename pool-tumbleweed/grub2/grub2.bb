SUMMARY = "Bootloader with support for Linux, Multiboot and more"
DESCRIPTION = "This is the second version of the GRUB (Grand Unified Bootloader), a \
highly configurable and customizable bootloader with modular \
architecture.  It support rich scale of kernel formats, file systems, \
computer architectures and hardware devices."
LICENSE = "GPL-3.0-or-later"

PV = "2.14"

RPM_NAME = "grub2-2.14-19.1.aarch64.rpm"
RPM_HASH = "f6b838a0680fd4b25d252a66debef3adfb77581316f221e88864f297897382c51cef5b3cd733b7ab34893ad7fbe7670c70b8c74e7fb33d55572aad4bc638a3b8"

RPROVIDES:${PN} += "grub2"

RDEPENDS:${PN} += "grub2-arm64-efi"

inherit rpm
