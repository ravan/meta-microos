SUMMARY = "Preparation of Internationalized Strings (S<RFC 3454>)"
DESCRIPTION = "This module implements the _stringprep_ framework for preparing Unicode \
text strings in order to increase the likelihood that string input and \
string comparison work in ways that make sense for typical users throughout \
the world. The _stringprep_ protocol is useful for protocol identifier \
values, company and personal names, internationalized domain names, and \
other text strings. \
 \
The _stringprep_ framework does not specify how protocols should prepare \
text strings. Protocols must create profiles of stringprep in order to \
fully specify the processing options."
LICENSE = "Artistic-1.0 | GPL-1.0+"

PV = "1.105"

RPM_NAME = "perl-Unicode-Stringprep-1.105-1.41.noarch.rpm"
RPM_HASH = "754f1c19ee01471706357aed1b970b62119ceed2e1bcfe91fd3fefc150bebdfa6a07664041ae651ea13fb0cb4f8ee5497d3412f90a5cde75eedeeeba218e568c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-Unicode--Stringprep \
perl-Unicode--Stringprep---Common \
perl-Unicode--Stringprep--BiDi \
perl-Unicode--Stringprep--Mapping \
perl-Unicode--Stringprep--Prohibited \
perl-Unicode--Stringprep--Unassigned \
perl-Unicode-Stringprep"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.44.0 \
perl-Unicode--Normalize"

inherit rpm
