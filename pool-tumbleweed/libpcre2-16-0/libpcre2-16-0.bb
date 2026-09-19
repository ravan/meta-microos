SUMMARY = "A library for Perl-compatible regular expressions"
DESCRIPTION = "The PCRE2 library is a set of functions that implement regular \
expression pattern matching using the same syntax and semantics \
as Perl 5. \
 \
PCRE2 is a re-working of the original PCRE library to provide an entirely new \
API. \
 \
libpcre2-16 supports 16-bit and UTF-16 strings."
LICENSE = "BSD-2-Clause & BSD-3-Clause-with-PCRE2-exception"

PV = "10.48"

RPM_NAME = "libpcre2-16-0-10.48-1.1.aarch64.rpm"
RPM_HASH = "a2caf2f257411eb9b30d8d1943fd78a0a483a6e551d9d1ef368b1aef0608fd7784c54e1b3925c45a57faf6f4b5dbb36c46c7350dc5411a387c311e76ce8507eb"

RPROVIDES:${PN} += "libpcre2-16-0 \
libpcre2-16.so.0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6"

inherit rpm
