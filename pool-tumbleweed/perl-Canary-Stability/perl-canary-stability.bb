SUMMARY = "Canary to check perl compatibility for schmorp's modules"
DESCRIPTION = "This module is used by Schmorp's modules during configuration stage to test \
the installed perl for compatibility with his modules. \
 \
It's not, at this stage, meant as a tool for other module authors, although \
in principle nothing prevents them from subscribing to the same ideas. \
 \
See the _Makefile.PL_ in Coro or AnyEvent for usage examples."
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"

PV = "2013"

RPM_NAME = "perl-Canary-Stability-2013-1.31.noarch.rpm"
RPM_HASH = "d65d5f79269829b13b2a4b0cde8cbea53a214d078ee43fc78c604a595f2880fc094f5b0633de1948b011eab1e0448a93a0889fe5e49cf86e97bd195a79cf45e6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-Canary--Stability \
perl-Canary-Stability"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.44.0"

inherit rpm
