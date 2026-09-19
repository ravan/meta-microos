SUMMARY = "A library for Perl-compatible regular expressions"
DESCRIPTION = "The PCRE2 library is a set of functions that implement regular \
expression pattern matching using the same syntax and semantics \
as Perl 5. \
 \
PCRE2 is a re-working of the original PCRE library to provide an entirely new \
API. \
 \
This package contains static versions of the PCRE2 libraries."
LICENSE = "BSD-2-Clause & BSD-3-Clause-with-PCRE2-exception"

PV = "10.48"

RPM_NAME = "pcre2-devel-static-10.48-1.1.aarch64.rpm"
RPM_HASH = "9a573c0ccad89964c429983dbf172a75a7b8f30a6c6ed2fe86fe5b666f2a18ffaa496b182ccc8f4ae0334d8fa6d7ab2c4ad45f1fc6ebf11a1f63bd93f2c3673c"

RPROVIDES:${PN} += "pcre2-devel-static"

RDEPENDS:${PN} += "pcre2-devel"

inherit rpm
