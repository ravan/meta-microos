SUMMARY = "Secure Replacements for Problematic C Functions"
DESCRIPTION = "The 'Secure Programming Library' provides several functions that should \
serve as a replacement for problematic C functions from glibc. Besides \
the replacement functions, there are some helper functions, such as \
safe_reopen() or sigprotection(), that can be used for developing \
exposed applications."
LICENSE = "GPL-2.0+"

PV = "0.8"

RPM_NAME = "libsecprog0-0.8-166.9.aarch64.rpm"
RPM_HASH = "57b121f71042f0d42164b5ec108e6c4f8a99fc125da6d0b2825deabb54b6dc22e5a3d84b05ed2fce3ce6016a8143d1ab4c240fbd53ee1b22c5551560b84b64c3"

RPROVIDES:${PN} += "libsecprog \
libsecprog.so.0 \
libsecprog0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6"

inherit rpm
