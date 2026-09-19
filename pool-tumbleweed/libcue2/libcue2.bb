SUMMARY = "CUE sheet parsing library"
DESCRIPTION = "libcue parses so-called cue sheets from a char string or a FILE \
pointer."
LICENSE = "GPL-2.0-only"

PV = "2.3.0"

RPM_NAME = "libcue2-2.3.0-1.11.aarch64.rpm"
RPM_HASH = "9fbad1d999d8183c863a4bce9fbe5389b7e03cb7ee1febbdb08edd24de9c56efb873db33730655d9cfcc61e10f5d8736cbd0731d4ab094a5065952a8fb5fdd1e"

RPROVIDES:${PN} += "libcue.so.2 \
libcue2"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6"

inherit rpm
