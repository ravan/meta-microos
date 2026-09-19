SUMMARY = "Optimized module loading for forking or non-forking processes"
DESCRIPTION = "The 'prefork' pragma is intended to allow module writers to optimise module \
loading for *both* scenarios with as little additional code as possible. \
 \
prefork.pm is intended to serve as a central and optional marshalling point \
for state detection (are we running in compile-time or run-time mode) and \
to act as a relatively light-weight module loader."
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"

PV = "1.05"

RPM_NAME = "perl-prefork-1.05-1.31.noarch.rpm"
RPM_HASH = "b8783cfea0b9582d2fb1f96ca909a243d2d4245048e8c97d54fa202523c6a3d06325a4fb62f62972f2810f5acd67f8835631940f73908287adc292ae2c1f4717"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-prefork"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.44.0"

inherit rpm
