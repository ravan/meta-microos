SUMMARY = "A library for Perl-compatible regular expressions"
DESCRIPTION = "The PCRE2 library is a set of functions that implement regular \
expression pattern matching using the same syntax and semantics \
as Perl 5. \
 \
PCRE2 is a re-working of the original PCRE library to provide an entirely new \
API."
LICENSE = "BSD-2-Clause & BSD-3-Clause-with-PCRE2-exception"

PV = "10.48"

RPM_NAME = "pcre2-tools-10.48-1.1.aarch64.rpm"
RPM_HASH = "13a1fcf8874869f6566b4625c13211436b78956c2cc98b6c99ef4ef50ad9f65f20dc2f1ad2eefd5c21f8271614992bec78d9e0c37a86b4b31cb1790f3c98bd02"

RPROVIDES:${PN} += "pcre2-tools"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libbz2.so.1 \
libc.so.6 \
libedit.so.0 \
libpcre2-16.so.0 \
libpcre2-32.so.0 \
libpcre2-8.so.0 \
libpcre2-posix.so.3 \
libz.so.1"

inherit rpm
