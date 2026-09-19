SUMMARY = "Line Wrapping Module"
DESCRIPTION = "Line wrapping module with support for multibyte, fullwidth, and combining \
characters and languages without whitespaces between words."
LICENSE = "Artistic-1.0 | GPL-1.0+"

PV = "0.06"

RPM_NAME = "perl-Text-WrapI18N-0.06-9.40.noarch.rpm"
RPM_HASH = "f7546b052840353151b464cb3f7dd364ed35574ddea981c54eb74f512434c73c7ceb48dbd69d01a2044c3f2e989561b33e52bf934a36ee28ca6bcc3d6f2a04e3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-Text--WrapI18N \
perl-Text-WrapI18N"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.44.0 \
perl-Text--CharWidth"

inherit rpm
