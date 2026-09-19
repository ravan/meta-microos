SUMMARY = "A library for Perl-compatible regular expressions"
DESCRIPTION = "The PCRE2 library is a set of functions that implement regular \
expression pattern matching using the same syntax and semantics \
as Perl 5. \
 \
PCRE2 is a re-working of the original PCRE library to provide an entirely new \
API."
LICENSE = "BSD-3-Clause-with-PCRE2-exception"

PV = "10.48"

RPM_NAME = "pcre2-doc-10.48-1.1.noarch.rpm"
RPM_HASH = "f64ba2e32decb32aa1d2f5899f08f48d8b5334d395962febbede2999185cdcafb5a9f598cec9735de0b420c8986a87ddbec0f0dde5cbaf0ba021636cc5cb06ec"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "pcre2-doc"

RDEPENDS:${PN} += ""

inherit rpm
