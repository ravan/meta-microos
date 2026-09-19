SUMMARY = "Minimalist Fennec, the commonly used bits"
DESCRIPTION = "Fennec does a ton, but it may be hard to adopt it all at once. It also is a \
large project, and has not yet been fully split into component projects. \
Fennec::Lite takes a minimalist approach to do for Fennec what Mouse does \
for Moose. \
 \
Fennec::Lite is a single module file with no non-core dependencies. It can \
easily be used by any project, either directly, or by copying it into your \
project. The file itself is less than 300 lines of code at the time of this \
writing, that includes whitespace. \
 \
This module does not cover any of the more advanced features such as result \
capturing or SPEC workflows. This module only covers test grouping and \
group randomization. You can also use the FENNEC_ITEM variable with a group \
name or line number to run a specific test group only. Test::Builder is \
used under the hood for TAP output."
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"

PV = "0.4.0"

RPM_NAME = "perl-Fennec-Lite-0.4.0-1.7.noarch.rpm"
RPM_HASH = "b4298e0a36364ede1f6318e2cbf41ec1791ab0d36cc0e03596a5814efdf0837f4395acbba0540dd67e1f8734ea2231957da60b659496ba9dae51cbab22940f6b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-Fennec--Lite \
perl-Fennec-Lite"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.44.0"

inherit rpm
