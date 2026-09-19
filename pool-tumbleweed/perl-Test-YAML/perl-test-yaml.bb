SUMMARY = "Testing Module for YAML Implementations"
DESCRIPTION = "Test::YAML is a subclass of Test::Base with YAML specific support."
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"

PV = "1.07"

RPM_NAME = "perl-Test-YAML-1.07-1.33.noarch.rpm"
RPM_HASH = "7a4248d796b813c748897b2c757aeba01ca70a42d44920a5976b2d829d8ba2ca5c74c66e3a75682c9b78fa6655e25d0988eaeafd7760688d59ee2c273de39179"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-Test--YAML \
perl-Test--YAML--Filter \
perl-Test-YAML"

RDEPENDS:${PN} += "/usr/bin/bash \
perl--MODULE-COMPAT-5.44.0 \
perl-Test--Base"

inherit rpm
