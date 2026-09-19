SUMMARY = "String Aspects of Scalars"
DESCRIPTION = "This module is about the string part of plain Perl scalars. A scalar has a \
string value, which is notionally a sequence of Unicode codepoints, but may \
be internally encoded in either ISO-8859-1 or UTF-8. In places, and more so \
in older versions of Perl, the internal encoding shows through. To fully \
understand Perl strings it is necessary to understand these implementation \
details. \
 \
This module provides functions to classify a string by encoding and to \
encode a string in a desired way. \
 \
This module is implemented in XS, with a pure Perl backup version for \
systems that can't handle XS."
LICENSE = "Artistic-1.0 | GPL-1.0+"

PV = "0.003"

RPM_NAME = "perl-Scalar-String-0.003-1.47.aarch64.rpm"
RPM_HASH = "0e82af20a61cff29a8e734619a9324fa2cc4c5ae9fe9c14f9e1b1a16211c89604df2deaa43cd283b6d9febc82a2b8c975385a63983aca9dff0d1986f4b05d93a"

RPROVIDES:${PN} += "perl-Scalar--String \
perl-Scalar-String"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.44.0 \
perl-parent"

inherit rpm
