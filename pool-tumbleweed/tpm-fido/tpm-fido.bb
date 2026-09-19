SUMMARY = "Use your TPM2 as a FIDO 2FA token"
DESCRIPTION = "tpm-fido is FIDO token implementation for Linux that protects the token keys by using your system's TPM. tpm-fido uses Linux's uhid facility to emulate a USB HID device so that it is properly detected by browsers."
LICENSE = "MIT"

PV = "20230621.5f8828b"

RPM_NAME = "tpm-fido-20230621.5f8828b-2.14.aarch64.rpm"
RPM_HASH = "2dcf2d8121659d48ddd62cfcdfd82cdb4cd953c23f7f0152f26103477febc41b4df2c8897570da815a0ae85c1d374956a68b6956e0f125f11410fbfa8be5a999"

RPROVIDES:${PN} += "tpm-fido \
tpm2-fido"

RDEPENDS:${PN} += "/usr/bin/sh \
libc.so.6 \
pinentry-gui \
system-user-tss"

inherit rpm
