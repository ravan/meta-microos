SUMMARY = "Secure Replacements for Problematic C Functions"
DESCRIPTION = "The 'Secure Programming Library' provides several functions that should \
serve as a replacement for problematic C functions from glibc. Besides \
the replacement functions there are some helper-functions (like: \
safe_reopen() or sigprotection()) that can be used for developing \
exposed applications."
LICENSE = "GPL-2.0+"

PV = "0.8"

RPM_NAME = "libsecprog-devel-0.8-166.9.aarch64.rpm"
RPM_HASH = "1206d1a90d4190796a99f85f5775d4a6065ad1730ca25cf6de23bfcc2e92afa035fd15ba713b8c671cd5f32b6bd8db30352e40927e61fe7e0bcaf8eb699f590e"

RPROVIDES:${PN} += "libsecprog-devel"

RDEPENDS:${PN} += "glibc-devel \
libsecprog0"

inherit rpm
