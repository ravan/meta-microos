SUMMARY = "Useful tools for installing self-built kernels"
DESCRIPTION = "A collection of tools useful for installing self-built kernels. \
 \
In addition to the baseline /sbin/installkernel, this package includes \
several tools for properly signing and installing kernels and certificates \
for use on systems with UEFI Secure Boot enabled."
LICENSE = "GPL-2.0-only"

PV = "0.3.0"

RPM_NAME = "kernel-install-tools-0.3.0-2.10.aarch64.rpm"
RPM_HASH = "4e687fa442c79f55c5bb6de126448c8c65f4d9ec6c71b33fb5f3236c7901b445c85673b8e67db16b4062689a163a5e01279bf97122922e995f60dc3527f56719"

RPROVIDES:${PN} += "kernel-install-tools"

RDEPENDS:${PN} += "/usr/bin/bash \
mozilla-nss-tools \
openssl \
pesign"

inherit rpm
