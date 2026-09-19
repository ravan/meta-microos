SUMMARY = "Unicode Normalization Forms"
DESCRIPTION = "Parameters: \
 \
'$string' is used as a string under character semantics (see perlunicode). \
 \
'$code_point' should be an unsigned integer representing a Unicode code \
point. \
 \
Note: Between XSUB and pure Perl, there is an incompatibility about the \
interpretation of '$code_point' as a decimal number. XSUB converts \
'$code_point' to an unsigned integer, but pure Perl does not. Do not use a \
floating point nor a negative sign in '$code_point'."
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"

PV = "1.26"

RPM_NAME = "perl-Unicode-Normalize-1.26-1.38.aarch64.rpm"
RPM_HASH = "57d7123b4ffb7890c2c10f68ff9a6c05e8c023434c454e7744dcdecce76781115b5c0c6c12108f43ffca0d09d82a9081a43e266b51da3a6aea83f2775e00912c"

RPROVIDES:${PN} += "perl-Unicode--Normalize \
perl-Unicode-Normalize"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
perl--MODULE-COMPAT-5.44.0"

inherit rpm
