SUMMARY = "Test a list of subroutines provided by a module"
DESCRIPTION = "This simple test module checks the subroutines provided by a module. This \
is useful for confirming a planned API in testing and ensuring that other \
functions aren't unintentionally included via import."
LICENSE = "Apache-2.0"

PV = "0.010"

RPM_NAME = "perl-Test-API-0.010-1.27.noarch.rpm"
RPM_HASH = "b8e4026e52db0a1ca4f73737253bf54765f18d33c826f61564b8879c466aa822612378b2cfa4b558261a12ff70c795265f756dfeaf88f16d88bbc2d2b42a6f9f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-Test--API \
perl-Test-API"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.44.0 \
perl-Test--Builder--Module"

inherit rpm
