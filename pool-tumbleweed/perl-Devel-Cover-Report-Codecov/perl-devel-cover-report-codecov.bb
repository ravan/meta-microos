SUMMARY = "Backend for Codecov reporting of coverage statistics"
DESCRIPTION = "Devel::Cover::Report::Codecov is coverage reporter for at \
https://codecov.io."
LICENSE = "MIT"

PV = "0.25"

RPM_NAME = "perl-Devel-Cover-Report-Codecov-0.25-1.31.noarch.rpm"
RPM_HASH = "df17a975cd4881377a2ff18f42889b45251cdbaa0359f1eecd574e49f4b2d6091649e6af1989ea802e5f706a421deb3980ccf66ecfd4a4589aa5ff2f56fb969d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-Devel--Cover--Report--Codecov \
perl-Devel--Cover--Report--Codecov--Service--AppVeyor \
perl-Devel--Cover--Report--Codecov--Service--Bitrise \
perl-Devel--Cover--Report--Codecov--Service--Circle \
perl-Devel--Cover--Report--Codecov--Service--Codeship \
perl-Devel--Cover--Report--Codecov--Service--Drone \
perl-Devel--Cover--Report--Codecov--Service--Git \
perl-Devel--Cover--Report--Codecov--Service--GitLab \
perl-Devel--Cover--Report--Codecov--Service--Mercurial \
perl-Devel--Cover--Report--Codecov--Service--Semaphore \
perl-Devel--Cover--Report--Codecov--Service--Shippable \
perl-Devel--Cover--Report--Codecov--Service--Travis \
perl-Devel--Cover--Report--Codecov--Service--Wercker \
perl-Devel-Cover-Report-Codecov"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.44.0 \
perl-Capture--Tiny \
perl-Devel--Cover \
perl-Furl \
perl-IO--Socket--SSL \
perl-JSON--XS \
perl-Module--Find \
perl-Sub--Retry \
perl-URI"

inherit rpm
