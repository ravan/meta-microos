SUMMARY = "Simple mock test library using RAII."
DESCRIPTION = "Test::Mock::Guard is mock test library using RAII. This module is able to \
change method behavior by each scope. See SYNOPSIS's sample code."
LICENSE = "Artistic-1.0 | GPL-1.0+"

PV = "0.10"

RPM_NAME = "perl-Test-Mock-Guard-0.10-1.31.noarch.rpm"
RPM_HASH = "fa526863d5a267fadbc183877a0b5900fd80a0d1dbfd3cbf907aa3786365d8b8b8762d9d0f0053382443c42f6f6ec7bc175127698ea2c0519ff638138fc43dbb"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-Test--Mock--Guard \
perl-Test-Mock-Guard"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.44.0 \
perl-Class--Load \
perl-Exporter"

inherit rpm
