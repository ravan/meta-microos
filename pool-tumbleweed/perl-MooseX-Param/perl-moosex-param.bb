SUMMARY = "Simple role to provide a standard param method"
DESCRIPTION = "This is a very simple Moose role which provides a the CGI manpage like \
'param' method. \
 \
I found that I had written this code over and over and over and over again, \
and each time it was the same. So I thought, why not put it in a role?"
LICENSE = "Artistic-1.0 | GPL-1.0+"

PV = "0.02"

RPM_NAME = "perl-MooseX-Param-0.02-9.40.noarch.rpm"
RPM_HASH = "8ae93c200467e12da7ca34ca30737251a5437a8758691a42d2baa82e5fa8dea06fac209f0f1ccc1adb50230aab909d9ba25b17037fba89952adcb311b75167c8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-MooseX--Param \
perl-MooseX-Param"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.44.0 \
perl-Moose"

inherit rpm
