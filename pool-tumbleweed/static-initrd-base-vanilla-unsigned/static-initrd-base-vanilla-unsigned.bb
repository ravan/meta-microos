SUMMARY = "Unsigned static base initrd with kernel vanilla."
DESCRIPTION = "The Unsigned static base Initrd build for kernel-vanilla \
7.2.5."
LICENSE = "GPL-3.0-only"

PV = "0.1.0_k7.2.5"

RPM_NAME = "static-initrd-base-vanilla-unsigned-0.1.0_k7.2.5-5.28.aarch64.rpm"
RPM_HASH = "e57da936ead5c9215b04fb98124176004a72cd653f9acb0aaea6bd7d1795b0b9dcaaf0f5656b7120121b02cb4f038c08c43df608e9f6a8d12872e590dfb78e06"

RPROVIDES:${PN} += "static-initrd-base-vanilla-unsigned"

RDEPENDS:${PN} += "kernel-vanilla"

inherit rpm
