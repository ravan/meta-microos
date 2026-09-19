SUMMARY = "A library for Perl-compatible regular expressions"
DESCRIPTION = "The PCRE2 library is a set of functions that implement regular \
expression pattern matching using the same syntax and semantics \
as Perl 5. \
 \
PCRE2 is a re-working of the original PCRE library to provide an entirely new \
API."
LICENSE = "BSD-3-Clause-with-PCRE2-exception"

PV = "10.48"

RPM_NAME = "pcre2-devel-10.48-1.1.aarch64.rpm"
RPM_HASH = "a6d5d45c08fa1b72cbd52847036647ff7c974839cd6d30a4a73efc25e6b604734c9b78dfa0a20b25e5c61b9f15af97d5ad64c4c8fcc09768459852e2a95088f3"

RPROVIDES:${PN} += "pcre2-devel \
pkgconfig-libpcre2-16 \
pkgconfig-libpcre2-32 \
pkgconfig-libpcre2-8 \
pkgconfig-libpcre2-posix"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
/usr/bin/sh \
libpcre2-16-0 \
libpcre2-32-0 \
libpcre2-8-0 \
libpcre2-posix3 \
libstdc++-devel \
pkgconfig-libpcre2-8"

inherit rpm
