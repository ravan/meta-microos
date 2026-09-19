SUMMARY = "Produce tied (and other) separate but combined variables"
DESCRIPTION = "produce tied (and other) separate but combined variables"
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"

PV = "1.5.0"

RPM_NAME = "perl-IO-TieCombine-1.5.0-1.7.noarch.rpm"
RPM_HASH = "20ee52c6f41f787daff1ba14ac79e7a4a0eecc694784f7e4e325f60564fbe9bb645e7aac8d5271c7d8429d0d7e229645cd7bb11762f8197102a4380f38ff2732"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-IO--TieCombine \
perl-IO--TieCombine--Handle \
perl-IO--TieCombine--Scalar \
perl-IO-TieCombine"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.44.0"

inherit rpm
