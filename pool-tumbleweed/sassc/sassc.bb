SUMMARY = "Libsass command line driver"
DESCRIPTION = "SassC is a C/C++ port of the Sass engine. The point is to be \
simple, fast, and easy to integrate. \
 \
Sass is a pre-processing language for CSS. It allows you to write \
cleaner stylesheets and makes collaboration on your CSS a breeze."
LICENSE = "MIT"

PV = "3.6.2"

RPM_NAME = "sassc-3.6.2-1.18.aarch64.rpm"
RPM_HASH = "60c86708af9880f5d6e44f3dd6c925acb918fc4db881f1ec2819f1e9cfce1a8f2a44c7f0a68ff1c2a32c015aacb8ca2bd6d2cd82fcc12335d95edd0432c6a7ce"

RPROVIDES:${PN} += "sassc"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libsass-3.6.6.so.1"

inherit rpm
