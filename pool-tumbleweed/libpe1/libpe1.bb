SUMMARY = "Library for PE file parsing"
DESCRIPTION = "The PE library used by pev - the PE file toolkit. \
Features \
 * Support for both 32 and 64-bits PE files. \
 * ssdeep support (built-in libfuzzy). \
 * Disassemble support (built-in libudis86). \
 * Imphash support. \
 * Crypographic digests calculation (using OpenSSL). \
 \
This subpackage contains shared library part of libpe."
LICENSE = "LGPL-3.0-or-later"

PV = "0.85.1"

RPM_NAME = "libpe1-0.85.1-1.6.aarch64.rpm"
RPM_HASH = "5c7612a939109f1b187bad9ee3f0a9c177eea90d441346d44eea0db67b2f04a2fd14d6f86617d3bf42a3406d6f9adc950d1a673870f4e236bddfc876f279200f"

RPROVIDES:${PN} += "libpe.so.1 \
libpe1"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libcrypto.so.3 \
libm.so.6"

inherit rpm
