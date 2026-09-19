SUMMARY = "Unsigned static network initrd with kernel default."
DESCRIPTION = "The Unsigned static network Initrd build for kernel-default \
7.2.5."
LICENSE = "GPL-3.0-only"

PV = "0.1.0_k7.2.5"

RPM_NAME = "static-initrd-network-default-unsigned-0.1.0_k7.2.5-5.28.aarch64.rpm"
RPM_HASH = "8c00a5d0907addbc78cc17c5679ac38c38d9e6fd5d65a45cf46d3695ad1223c96bf7b3877eebbc2b6f5020b5a0a769f922640b6b0d5280b6e87d5834e6fc687c"

RPROVIDES:${PN} += "static-initrd-network-default-unsigned \
static-initrd-network-unsigned"

RDEPENDS:${PN} += "kernel-default"

inherit rpm
