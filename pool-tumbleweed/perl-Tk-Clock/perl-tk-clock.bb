SUMMARY = "Clock widget with analog and digital display"
DESCRIPTION = "This module implements a Canvas-based clock widget for perl-Tk with lots of \
options to change the appearance. \
 \
Both analog and digital clocks are implemented."
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"

PV = "0.450.0"

RPM_NAME = "perl-Tk-Clock-0.450.0-1.5.noarch.rpm"
RPM_HASH = "fd2c366920acbe7e7ab813f4793572adc422c1d119889902d343b173ef6fc8c088f11d36a70bcb0c7821f2d4720a0aaabca7c1b0866872fcf3185d0348ad36ac"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-Tk--Clock \
perl-Tk-Clock"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.44.0 \
perl-Test--More \
perl-Test--NoWarnings \
perl-Tk \
perl-Tk--Canvas \
perl-Tk--Derived \
perl-Tk--Widget"

inherit rpm
