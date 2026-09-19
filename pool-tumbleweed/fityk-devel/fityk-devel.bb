SUMMARY = "Header files, libraries and development documentation for fityk"
DESCRIPTION = "Fityk is a program for nonlinear curve-fitting of analytical \
functions (especially peak-shaped) to data (usually experimental \
data). It can also be used for visualization of x-y data only. \
 \
This package contains libraries and header files for developing \
applications that use Fityk library."
LICENSE = "GPL-2.0-or-later"

PV = "1.3.2"

RPM_NAME = "fityk-devel-1.3.2-2.6.aarch64.rpm"
RPM_HASH = "569a5ddd5de3f43978a25a645a83f31fdb1f7960b7655cd4aced17b588f0e8b906853a10911cb3cd20d974221563bd186fac3963e8fc3106d47da093f6a259eb"

RPROVIDES:${PN} += "fityk-devel"

RDEPENDS:${PN} += "libfityk4"

inherit rpm
