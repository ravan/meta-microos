SUMMARY = "Produce PostScript files from Perl"
DESCRIPTION = "PostScript::Simple allows you to have a simple method of writing PostScript \
files from Perl. It has graphics primitives that allow lines, curves, \
circles, polygons and boxes to be drawn. Text can be added to the page \
using standard PostScript fonts. \
 \
The images can be single page EPS files, or multipage PostScript files. The \
image size can be set by using a recognised paper size (''A4'', for \
example) or by giving dimensions. The units used can be specified (''mm'' \
or ''in'', etc) and are the same as those used in TeX. The default unit is \
a bp, or a PostScript point, unlike TeX."
LICENSE = "GPL-2.0+"

PV = "0.09"

RPM_NAME = "perl-PostScript-Simple-0.09-1.42.noarch.rpm"
RPM_HASH = "8ba67393f4b418857e83c9435792c36837c14d0654bc3c39f2817f2e265d11977f68bb307804e7bca4c0ceeac6d093a579578c70ca1fb3a2b68bfb81208dc713"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-PostScript--Simple \
perl-PostScript--Simple--EPS \
perl-PostScript-Simple"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.44.0"

inherit rpm
