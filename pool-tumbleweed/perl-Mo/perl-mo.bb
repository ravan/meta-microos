SUMMARY = "Micro Objects. Mo is less"
DESCRIPTION = "Micro Objects. Mo is less."
LICENSE = "Artistic-1.0 | GPL-1.0+"

PV = "0.40"

RPM_NAME = "perl-Mo-0.40-1.40.noarch.rpm"
RPM_HASH = "f95156210f19d265b06d172f125c3e66c53f61541c5dc10a050ccbdf96ec46c0c38aff66f4cdf1c5473b12396d42d4b421620f3d71defeda70d719df86264e0d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-Mo \
perl-Mo--Golf \
perl-Mo--Inline \
perl-Mo--Moose \
perl-Mo--Mouse \
perl-Mo--build \
perl-Mo--builder \
perl-Mo--chain \
perl-Mo--coerce \
perl-Mo--default \
perl-Mo--exporter \
perl-Mo--import \
perl-Mo--importer \
perl-Mo--is \
perl-Mo--nonlazy \
perl-Mo--option \
perl-Mo--required \
perl-Mo--xs"

RDEPENDS:${PN} += "/usr/bin/perl \
perl--MODULE-COMPAT-5.44.0"

inherit rpm
