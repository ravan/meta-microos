SUMMARY = "Convert Strings to English Program Identifiers"
DESCRIPTION = "This module provides a utility method, to_identifier for converting an \
arbitrary string into a readable representation using the ASCII subset of \
'\\w' for use as an identifier in a computer program. The intent is to make \
unique identifier names from which the content of the original string can \
be easily inferred by a human just by reading the identifier. \
 \
If you need the full set of '\\w' including Unicode, see the subclass \
String::ToIdentifier::EN::Unicode. \
 \
Currently, this process is one way only, and will likely remain this way. \
 \
The default is to create camelCase identifiers, or you may pass in a \
separator char of your choice such as '_'. \
 \
Binary char groups will be separated by '_' even in camelCase identifiers \
to make them easier to read, e.g.: 'foo_2_0xFF_Bar'."
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"

PV = "0.12"

RPM_NAME = "perl-String-ToIdentifier-EN-0.12-1.33.noarch.rpm"
RPM_HASH = "0f846765850c89c37be7811643aae593f27a084121af6fa9e5cbb9fbcd1dd55421e18bce351366c4e7b10233ab004abef85cac40d061651b826496633741aba5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-String--ToIdentifier--EN \
perl-String--ToIdentifier--EN--Unicode \
perl-String-ToIdentifier-EN"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.44.0 \
perl-Lingua--EN--Inflect--Phrase \
perl-Text--Unidecode \
perl-namespace--clean"

inherit rpm
