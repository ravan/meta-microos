SUMMARY = "TCTI i2c interface library"
DESCRIPTION = "A TCTI module for communication via I2C TPM device driver. Abstracts \
the details of communication with a TPM via I2C protocol. It uses user \
supplied methods for I2C and timing operations in order to be platform \
independent."
LICENSE = "BSD-2-Clause"

PV = "4.1.3"

RPM_NAME = "libtss2-tcti-i2c-helper0-4.1.3-1.6.aarch64.rpm"
RPM_HASH = "1115f1994cb8b77a59c7f4c47e28eda7f38308fcd1a6afb8238284384823810c49d96206004170bc1c663565479d8e09d0b88f3cce2ab9ccb4d59e3c05255e9f"

RPROVIDES:${PN} += "libtss2-tcti-i2c-helper.so.0 \
libtss2-tcti-i2c-helper0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libtss2-mu.so.0"

inherit rpm
