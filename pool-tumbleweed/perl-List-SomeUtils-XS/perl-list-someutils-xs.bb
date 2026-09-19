SUMMARY = "XS implementation for List::SomeUtils"
DESCRIPTION = "There are no user-facing parts here. See List::SomeUtils for API details. \
 \
You shouldn't have to install this module directly. When you install \
List::SomeUtils, it checks whether your system has a compiler. If it does, \
then it adds a dependency on this module so that it gets installed and you \
have the faster XS implementation. \
 \
This distribution requires List::SomeUtils but to avoid a circular \
dependency, that dependency is explicitly left out from the this \
distribution's metadata. However, without LSU already installed this module \
cannot function."
LICENSE = "Artistic-2.0"

PV = "0.590.0"

RPM_NAME = "perl-List-SomeUtils-XS-0.590.0-1.3.aarch64.rpm"
RPM_HASH = "e59fa1ebfdf4b3d7acf541a8d37bc31cf539ff6c3de66f64e721673a045fd2ede7201590775955670b20163289449bcd033524874d20cf596f8d54cb9cbd23a4"

RPROVIDES:${PN} += "perl-List--SomeUtils--XS \
perl-List-SomeUtils-XS"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
perl--MODULE-COMPAT-5.44.0"

inherit rpm
