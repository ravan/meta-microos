SUMMARY = "FFI library for closures with variable arguments"
DESCRIPTION = "A library for building foreign function call interfaces in embedded \
interpreters. \
 \
This library allows for closures with variable arguments as \
first-class C functions (a reentrant combination of vacall and \
trampoline)."
LICENSE = "GPL-2.0-or-later"

PV = "2.5"

RPM_NAME = "libcallback1-2.5-1.9.aarch64.rpm"
RPM_HASH = "1f58ec6208458a426fef8f121dd695d51bcb8ff38a6377f5ffe8f426c99587b6450f34d11eb9ae6aaa8ed9a61afbc1a04c69ced3fb456168617030ed3ae70efc"

RPROVIDES:${PN} += "libcallback.so.1 \
libcallback1"

RDEPENDS:${PN} += "/sbin/ldconfig \
libc.so.6"

inherit rpm
