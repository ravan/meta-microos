SUMMARY = "See Your Data in the Nude"
DESCRIPTION = "'XXX.pm' exports a function called 'XXX' that you can put just about \
anywhere in your Perl code to make it die with a YAML dump of the arguments \
to its right. \
 \
The charm of XXX-debugging is that it is easy to type, rarely requires \
parens and stands out visually so that you remember to remove it. \
 \
'XXX.pm' also exports 'WWW', 'YYY' and 'ZZZ' which do similar debugging \
things."
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"

PV = "0.380.0"

RPM_NAME = "perl-XXX-0.380.0-1.4.noarch.rpm"
RPM_HASH = "8445ed0a52feb839799af0c0639ff7bf127edbd26542f27f02fb8c8a1f6be2271593d23f224fe4b7744cc97b8cece2c9c35468f51f8bafd904593689246ab1f4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-XXX"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.44.0 \
perl-YAML--PP"

inherit rpm
