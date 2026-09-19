SUMMARY = "Unsigned static generic initrd with kernel default."
DESCRIPTION = "The Unsigned static generic Initrd build for kernel-default \
7.2.5."
LICENSE = "GPL-3.0-only"

PV = "0.1.0_k7.2.5"

RPM_NAME = "static-initrd-generic-default-unsigned-0.1.0_k7.2.5-5.28.aarch64.rpm"
RPM_HASH = "57d8b4fd4e3363854e2c276d2720aff165029dc6f0393bb1edc8d28b7517384d57e9f01dac06ddc2e7b2211160e298143fb9a357048be693ad6d2a1d76b9e8a9"

RPROVIDES:${PN} += "static-initrd-generic-default-unsigned \
static-initrd-generic-unsigned"

RDEPENDS:${PN} += "kernel-default"

inherit rpm
