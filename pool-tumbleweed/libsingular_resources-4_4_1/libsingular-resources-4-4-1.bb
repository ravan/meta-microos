SUMMARY = "Singular's 'Singular' library"
DESCRIPTION = "(Upstream has not provided any description.)"
LICENSE = "BSD-3-Clause & GPL-2.0-only & GPL-3.0-only & LGPL-2.1-only"

PV = "4.4.1"

RPM_NAME = "libsingular_resources-4_4_1-4.4.1-2.9.aarch64.rpm"
RPM_HASH = "ee16ab00917ecff206b392bb26dd8f5077effd048adcba6a91e7d25c33b8f8386ccab185577e9b7d96754c71bffb6db986fa97175447af6be3319ca5d0a6dbe4"

RPROVIDES:${PN} += "libsingular-resources-4-4-1 \
libsingular-resources-4.4.1.so"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6"

inherit rpm
