SUMMARY = "Tool for converting texinfo documents to HTML"
DESCRIPTION = "The basic purpose of texi2html is to convert Texinfo documents into HTML, \
and other formats.  Configuration files written in perl provide fine degree \
of control over the final output, allowing most every aspect of the final \
output not specified in the Texinfo input file to be specified."
LICENSE = "GPL-2.0-or-later"

PV = "5.0"

RPM_NAME = "texi2html-5.0-6.7.noarch.rpm"
RPM_HASH = "7302583133047d4a1f7f21b7e873ea7cb74447b874315cafdf5adf87c507aac304c41a00c8ebc9ce937ecb1fa2bad7d1a9c42c3a7bfe4b3a431eead0b328ff38"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texi2html \
texinfo-/usr/bin/texi2html"

RDEPENDS:${PN} += "/usr/bin/perl \
/usr/bin/sh \
perl-Text-Unidecode \
perl-Unicode--EastAsianWidth \
perl-gettext \
perl-libintl-perl"

inherit rpm
