SUMMARY = "Peek into archives without extracting them"
DESCRIPTION = "This module lets you peek into archives without extracting them. It \
currently supports tar files and zip files. To support Bzip2- compressed \
files, you should install IO::Uncompress::Bunzip2."
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"

PV = "0.370.0"

RPM_NAME = "perl-Archive-Peek-0.370.0-1.7.noarch.rpm"
RPM_HASH = "9b381a79e94b5e17e39380c61d3e521c46d60c117a13bab2021580bc86367960ea5e856830165498289c1c1ba93416d86f8abd637490f8c6d7c61e5ce6ce5601"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-Archive--Peek \
perl-Archive--Peek--Tar \
perl-Archive--Peek--Zip \
perl-Archive-Peek"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.44.0 \
perl-Archive--Tar \
perl-Archive--Zip \
perl-Moo \
perl-Types--Path--Tiny"

inherit rpm
