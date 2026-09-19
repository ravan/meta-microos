SUMMARY = "The Catalyst developer's manual"
DESCRIPTION = "The Catalyst developer's manual"
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"

PV = "5.901.300"

RPM_NAME = "perl-Catalyst-Manual-5.901.300-1.7.noarch.rpm"
RPM_HASH = "ce4018495c60b54cd5d8f79f9fcad3161b30cb28c4a2713b26277bd5ebe5f0b4d19340a842d165661af7f3b0c3e70b57d360a82d3e7090f044a13884d62785f5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-Catalyst--Manual \
perl-Catalyst-Manual"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.44.0"

inherit rpm
