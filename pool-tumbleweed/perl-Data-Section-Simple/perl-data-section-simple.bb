SUMMARY = "Read data from __DATA__"
DESCRIPTION = "Data::Section::Simple is a simple module to extract data from '__DATA__' \
section of the file."
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"

PV = "0.70.0"

RPM_NAME = "perl-Data-Section-Simple-0.70.0-1.8.noarch.rpm"
RPM_HASH = "836f1d0683bc6a692e72496fe086ee20944451a68a99480a1fd5787f34eb3033151a50e98fd3047706238f967104c3a6703cdc8b308cd3592387e37391be953f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-Data--Section--Simple \
perl-Data-Section-Simple"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.44.0"

inherit rpm
