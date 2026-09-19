SUMMARY = "Unsigned static base initrd with kernel default."
DESCRIPTION = "The Unsigned static base Initrd build for kernel-default \
7.2.5."
LICENSE = "GPL-3.0-only"

PV = "0.1.0_k7.2.5"

RPM_NAME = "static-initrd-base-default-unsigned-0.1.0_k7.2.5-5.28.aarch64.rpm"
RPM_HASH = "4de30e8fbd2752e0f6ea76bbac23c0f4e7baf1042fc96556182c7ccf20384db33ce59a3cb928fb1a4e49641edfde0e4915b8567e36d995ca7a26f93d6b1edf3c"

RPROVIDES:${PN} += "static-initrd-base-default-unsigned \
static-initrd-base-unsigned"

RDEPENDS:${PN} += "kernel-default"

inherit rpm
