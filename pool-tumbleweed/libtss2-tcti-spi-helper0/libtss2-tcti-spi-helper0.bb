SUMMARY = "TCTI spi interface library"
DESCRIPTION = "A TCTI module for communication via SPI TPM device driver. Abstracts \
the details of communication with a TPM via SPI protocol. It uses user \
supplied methods for SPI and timing operations in order to be platform \
independent."
LICENSE = "BSD-2-Clause"

PV = "4.1.3"

RPM_NAME = "libtss2-tcti-spi-helper0-4.1.3-1.6.aarch64.rpm"
RPM_HASH = "e5cb894aefd7ab8d6fa93d079f054c95679521345f309c920e608ccb895396abe1bfe808aa09f645d89d3201e299db5dd15dcee3ca1cafc41930ada14331602f"

RPROVIDES:${PN} += "libtss2-tcti-spi-helper.so.0 \
libtss2-tcti-spi-helper0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libtss2-mu.so.0"

inherit rpm
