SUMMARY = "A Fortran-77 to C Translator"
DESCRIPTION = "This package uses an 'f77' script that hides the C translation process from the user."
LICENSE = "MIT"

PV = "20240504"

RPM_NAME = "f2c-20240504-1.3.aarch64.rpm"
RPM_HASH = "41b7737c0f46b599efeaa63384806d3852f1162d9938b2bb969e9dde73cc0734f753668679338c01129c2f0a00fbf826c526fa474edccdf165f1c2fc75aff4ab"

RPROVIDES:${PN} += "f2c"

RDEPENDS:${PN} += "/usr/bin/sh \
ld-linux-aarch64.so.1 \
libc.so.6"

inherit rpm
