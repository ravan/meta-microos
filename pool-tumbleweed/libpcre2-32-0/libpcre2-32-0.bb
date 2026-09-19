SUMMARY = "A library for Perl-compatible regular expressions"
DESCRIPTION = "The PCRE2 library is a set of functions that implement regular \
expression pattern matching using the same syntax and semantics \
as Perl 5. \
 \
PCRE2 is a re-working of the original PCRE library to provide an entirely new \
API. \
 \
libpcre2-32 supports 32-bit and UTF-32 strings."
LICENSE = "BSD-2-Clause & BSD-3-Clause-with-PCRE2-exception"

PV = "10.48"

RPM_NAME = "libpcre2-32-0-10.48-1.1.aarch64.rpm"
RPM_HASH = "6f1a259cc08f0ff547ec040ac42f5f473636d45083595829b80c0f1f70c4432d4f91c6edfd1213bc2e3b206d6a06942fe6e1c471375265e437bca565d1c187a1"

RPROVIDES:${PN} += "libpcre2-32-0 \
libpcre2-32.so.0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6"

inherit rpm
