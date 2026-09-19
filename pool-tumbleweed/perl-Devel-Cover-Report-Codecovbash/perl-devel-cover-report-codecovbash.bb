SUMMARY = "Generate a JSON file to be uploaded with the codecov bash script"
DESCRIPTION = "This is a coverage reporter for Codecov. It generates a JSON file that can \
be uploaded with the bash script provided by codecov. See \
https://docs.codecov.io/docs/about-the-codecov-bash-uploader for details. \
 \
The generated file will be named _codecov.json_ and will be in the \
_cover_db_ directory by default. \
 \
Nearly all of the code in this distribution was simply copied from Pine \
Mizune's at https://metacpan.org/release/Devel-Cover-Report-Codecov \
distribution."
LICENSE = "MIT"

PV = "0.43.0"

RPM_NAME = "perl-Devel-Cover-Report-Codecovbash-0.43.0-1.1.noarch.rpm"
RPM_HASH = "0cd7fbcea1bb704ec9a3eff697c8920757b0f4dda888516176761a325a06753062df8ecabf05ebe148b0f6bfe3f962a83f91d40e109a6aaeb0dc924008c0b626"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-Devel--Cover--Report--Codecovbash \
perl-Devel-Cover-Report-Codecovbash"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.44.0 \
perl-JSON--MaybeXS \
perl-namespace--autoclean"

inherit rpm
