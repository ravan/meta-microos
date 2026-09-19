SUMMARY = "Simple, sane and efficient module to slurp a file"
DESCRIPTION = "This module provides functions for fast and correct slurping and spewing. \
All functions are optionally exported. All functions throw exceptions on \
errors, write functions don't return any meaningful value."
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"

PV = "0.14.0"

RPM_NAME = "perl-File-Slurper-0.14.0-1.8.noarch.rpm"
RPM_HASH = "742f9e8d2adc62ee494ad41d81fa8cdf348a96fb15bc42611a8ecccaecc1a53235582d0053cc559668fdd902474d0e52f8b7088e965ca5e8caa266b922c8f422"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-File--Slurper \
perl-File-Slurper"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.44.0"

inherit rpm
