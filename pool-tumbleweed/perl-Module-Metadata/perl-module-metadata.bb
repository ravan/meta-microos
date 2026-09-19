SUMMARY = "Gather package and POD information from perl module files"
DESCRIPTION = "This module provides a standard way to gather metadata about a .pm file \
through (mostly) static analysis and (some) code execution. When \
determining the version of a module, the '$VERSION' assignment is 'eval'ed, \
as is traditional in the CPAN toolchain."
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"

PV = "1.000040"

RPM_NAME = "perl-Module-Metadata-1.000040-1.1.noarch.rpm"
RPM_HASH = "760e4ee59fd9ff4473b8b8a1a5f81287e4419e59370c37848d36a42ad3a49610fa6e67d1198e691e222acf4eb7231f0098b0ba3beb650448c8447b5c5fb2bb61"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-Module--Metadata \
perl-Module-Metadata"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.44.0 \
perl-version"

inherit rpm
