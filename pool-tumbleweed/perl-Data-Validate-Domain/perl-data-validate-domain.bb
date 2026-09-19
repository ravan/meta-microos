SUMMARY = "Domain and host name validation"
DESCRIPTION = "This module offers a few subroutines for validating domain and host names."
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"

PV = "0.150.0"

RPM_NAME = "perl-Data-Validate-Domain-0.150.0-1.3.noarch.rpm"
RPM_HASH = "7b59899a62c94f525c072cf645faadee024cd11fce9202a50aa9daafaa36ec8842702ef6457f25c240c95e0542b10fa434d21b1b7462a1b91ff62b806dcb0371"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-Data--Validate--Domain \
perl-Data-Validate-Domain"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.44.0 \
perl-Net--Domain--TLD"

inherit rpm
