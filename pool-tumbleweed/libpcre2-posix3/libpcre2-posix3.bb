SUMMARY = "A library for Perl-compatible regular expressions"
DESCRIPTION = "The PCRE2 library is a set of functions that implement regular \
expression pattern matching using the same syntax and semantics \
as Perl 5. \
 \
PCRE2 is a re-working of the original PCRE library to provide an entirely new \
API. \
 \
pcre2-posix provides a POSIX-compatible API to the PCRE2 engine."
LICENSE = "BSD-2-Clause & BSD-3-Clause-with-PCRE2-exception"

PV = "10.48"

RPM_NAME = "libpcre2-posix3-10.48-1.1.aarch64.rpm"
RPM_HASH = "177f4a4b17aaf91d7e626b41804623d27f90d7037701dea0bda3558aec9c0a64cb0a7e46ed2a9172c9e6744cd237c99583796a5953475dfa23fee74929493854"

RPROVIDES:${PN} += "libpcre2-posix.so.3 \
libpcre2-posix3"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libpcre2-8.so.0"

inherit rpm
