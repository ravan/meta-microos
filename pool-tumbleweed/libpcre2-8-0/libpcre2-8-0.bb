SUMMARY = "A library for Perl-compatible regular expressions"
DESCRIPTION = "The PCRE2 library is a set of functions that implement regular \
expression pattern matching using the same syntax and semantics \
as Perl 5. \
 \
PCRE2 is a re-working of the original PCRE library to provide an entirely new \
API. \
 \
This PCRE2 library variant supports 8-bit and UTF-8 strings. \
(See also libpcre2-16 and libpcre2-32)"
LICENSE = "BSD-2-Clause & BSD-3-Clause-with-PCRE2-exception"

PV = "10.48"

RPM_NAME = "libpcre2-8-0-10.48-1.1.aarch64.rpm"
RPM_HASH = "cd17714ca4a4ffb55867fb201aa55223a50aba6b2cef090dcbe071a5b3af7a5819a578b4b3393a0e1559380bc90d34e5d64247adb4b0ce15a364e50ad6d1356b"

RPROVIDES:${PN} += "libpcre2-8-0 \
libpcre2-8.so.0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6"

inherit rpm
