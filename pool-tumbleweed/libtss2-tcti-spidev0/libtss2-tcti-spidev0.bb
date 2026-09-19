SUMMARY = "TCTI interface library for communicating with a SPI attached TPM"
DESCRIPTION = "TPM Command Transmission Interface library for communicating with a \
TPM device node. This provides direct access to the TPM through the Linux \
kernel driver."
LICENSE = "BSD-2-Clause"

PV = "4.1.3"

RPM_NAME = "libtss2-tcti-spidev0-4.1.3-1.6.aarch64.rpm"
RPM_HASH = "9e17b0277b9e27d5be991bfbf4eb217da7ecd1eb4ed45fc87024afb07d10633b12f6b2b105f6bbbe111d6ff2fca80a52a7f32739385a5f794028820f488a5557"

RPROVIDES:${PN} += "libtss2-tcti-spidev.so.0 \
libtss2-tcti-spidev0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libtss2-mu.so.0 \
libtss2-tcti-spi-helper.so.0"

inherit rpm
