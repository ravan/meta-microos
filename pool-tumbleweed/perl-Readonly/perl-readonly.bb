SUMMARY = "Facility for creating read-only scalars, arrays, hashes"
DESCRIPTION = "Facility for creating read-only scalars, arrays, hashes"
LICENSE = "Artistic-1.0 | GPL-1.0+"

PV = "2.05"

RPM_NAME = "perl-Readonly-2.05-1.38.noarch.rpm"
RPM_HASH = "2c8b432d0f5a6e34b9fd61f4aa7d7fc4ce032cd0d5ac956cb2fb73b8f89631b93a24c57a2a07b34c248c08aed943d0fd655d335f4de2ff4a92c9f3007215be2e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-Readonly \
perl-Readonly--Array \
perl-Readonly--Hash \
perl-Readonly--Scalar"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.44.0"

inherit rpm
