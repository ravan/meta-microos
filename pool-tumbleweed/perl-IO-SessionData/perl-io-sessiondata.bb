SUMMARY = "Supporting module for SOAP::Lite"
DESCRIPTION = "supporting module for SOAP::Lite"
LICENSE = "GPL-1.0+ | Artistic-1.0"

PV = "1.03"

RPM_NAME = "perl-IO-SessionData-1.03-3.43.noarch.rpm"
RPM_HASH = "95ce8e5b23b4e731f2c55cca959b29558ec8717cfe4496dc97ed6f3a0cff7a26d7ef9f0cf9c3c2c6b7ab0b835929048dfaf814f45d8d83e251acf0a64cccc3d9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-IO--SessionData \
perl-IO--SessionSet \
perl-IO-SessionData"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.44.0"

inherit rpm
