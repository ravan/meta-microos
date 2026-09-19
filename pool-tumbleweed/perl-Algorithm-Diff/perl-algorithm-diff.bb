SUMMARY = "Compute `intelligent' differences between two files / lists"
DESCRIPTION = "Compute `intelligent' differences between two files / lists"
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"

PV = "1.201"

RPM_NAME = "perl-Algorithm-Diff-1.201-1.27.noarch.rpm"
RPM_HASH = "207c8a15ed9fd2f397e64f784d383bcfc9c00ff64d937a3004767da34598de3324802dcdc767464d29eecb89c8d68c8d2de3a2c5ef1dd692f8384b2985b19368"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-Algorithm--Diff \
perl-Algorithm--Diff---impl \
perl-Algorithm-Diff"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.44.0"

inherit rpm
