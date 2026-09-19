SUMMARY = "Reading/Writing of Complete Files with Character Encoding Support"
DESCRIPTION = "This module wraps the File::Slurp manpage and adds character encoding \
support through the *'encoding'* parameter. It exports the same functions \
which take all the same parameters as File::Slurp. Please see the the \
File::Slurp manpage documentation for basic usage; only the differences are \
described from here on out."
LICENSE = "GPL-1.0+ | Artistic-1.0"

PV = "0.7.1"

RPM_NAME = "perl-File-Slurp-Unicode-0.7.1-12.40.noarch.rpm"
RPM_HASH = "40b6e58f1211ce03ef8191007d0ea9792fe240fe7ba3e42ff2b10b2363d93d198f7b383d43db4073c028177476289f41ca3a5b46507b5e3ae18e9d4ea9359dbd"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-File--Slurp--Unicode \
perl-File-Slurp-Unicode"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.44.0 \
perl-File--Slurp"

inherit rpm
