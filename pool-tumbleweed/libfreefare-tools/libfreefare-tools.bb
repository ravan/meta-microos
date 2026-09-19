SUMMARY = "Tools for Mifare cards"
DESCRIPTION = "The libfreefare project aims to provide a convenient API for Mifare \
card manipulations. Supported tags include: Classic 1k/4k, DESFire \
2K/4K/8K, Ultralight/C. Supported features include: Mifare \
Application Directory (MAD) v1-v3. \
 \
This package contains example programs using libfreefare for \
inspecting and manipulating Mifare cards."
LICENSE = "LGPL-3.0+"

PV = "0.4.0"

RPM_NAME = "libfreefare-tools-0.4.0-5.8.aarch64.rpm"
RPM_HASH = "4bcef5c264b84f1c927362a3b35a840823321d63aaa5f16aeb854d5487a8af0f10e0f934385f45b17aed016f4ca5d26b91879c8b590b005ff20fff4de100247e"

RPROVIDES:${PN} += "libfreefare-tools"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libfreefare.so.0 \
libnfc.so.6"

inherit rpm
