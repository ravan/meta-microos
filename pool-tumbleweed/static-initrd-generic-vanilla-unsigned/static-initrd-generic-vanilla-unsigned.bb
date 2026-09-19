SUMMARY = "Unsigned static generic initrd with kernel vanilla."
DESCRIPTION = "The Unsigned static generic Initrd build for kernel-vanilla \
7.2.5."
LICENSE = "GPL-3.0-only"

PV = "0.1.0_k7.2.5"

RPM_NAME = "static-initrd-generic-vanilla-unsigned-0.1.0_k7.2.5-5.28.aarch64.rpm"
RPM_HASH = "022b1412f3050d915c63be2ea4b34c6d43e0cfc87279f3be2fc814b3fc3dac658b785301263cbea2287bdb5e40008c4d352af1a8d01133736b5945a9cbf512c0"

RPROVIDES:${PN} += "static-initrd-generic-vanilla-unsigned"

RDEPENDS:${PN} += "kernel-vanilla"

inherit rpm
