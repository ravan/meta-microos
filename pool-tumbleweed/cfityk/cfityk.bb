SUMMARY = "Non-linear curve fitting and data analysis, command line interface"
DESCRIPTION = "Fityk is a program for nonlinear curve-fitting of analytical \
functions (especially peak-shaped) to data (usually experimental \
data). It can also be used for visualization of x-y data only. \
 \
This package contains command line interface for Fityk."
LICENSE = "GPL-2.0-or-later"

PV = "1.3.2"

RPM_NAME = "cfityk-1.3.2-2.6.aarch64.rpm"
RPM_HASH = "2faae9e4b1c20132b980aa66bba89969aa34835c2557a7454f0a72895b581307f67d066e19027c718131d1ebceb85143c086e3e9e4b05400f35655a66daccedf"

RPROVIDES:${PN} += "cfityk"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libfityk.so.4 \
libgcc-s.so.1 \
libreadline.so.8 \
libstdc++.so.6"

inherit rpm
