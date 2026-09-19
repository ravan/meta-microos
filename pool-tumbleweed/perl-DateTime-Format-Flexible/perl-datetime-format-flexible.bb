SUMMARY = "DateTime::Format::Flexible - Flexibly parse strings and turn them into D[cut]"
DESCRIPTION = "If you have ever had to use a program that made you type in the date a \
certain way and thought 'Why can't the computer just figure out what date I \
wanted?', this module is for you. \
 \
_DateTime::Format::Flexible_ attempts to take any string you give it and \
parse it into a DateTime object."
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"

PV = "0.370.0"

RPM_NAME = "perl-DateTime-Format-Flexible-0.370.0-1.10.noarch.rpm"
RPM_HASH = "89f55623bf661e56ac7cb6bb029b13c2a56d0c95fd64521146312f5daeb6d8baaa5151c586fcdc338d0d69afd7c27a2d487f61854803e52ea56722813cc96c15"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-DateTime--Format--Flexible \
perl-DateTime--Format--Flexible--lang \
perl-DateTime--Format--Flexible--lang--de \
perl-DateTime--Format--Flexible--lang--en \
perl-DateTime--Format--Flexible--lang--es \
perl-DateTime-Format-Flexible"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.44.0 \
perl-DateTime \
perl-DateTime--Format--Builder \
perl-DateTime--TimeZone"

inherit rpm
