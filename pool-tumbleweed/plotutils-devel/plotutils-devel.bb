SUMMARY = "GNU Plotting Utilities"
DESCRIPTION = "The GNU plotting utilities consist of seven command line programs: the \
graphics programs `graph', `plot', `tek2plot', and `plotfont', and the \
mathematical programs `spline', `ode', and `double'.  GNU `libplot' is \
distributed with these programs; it is the library on which the \
graphics programs are based. `Libplot' is a function library for \
device-independent two-dimensional vector graphics, including vector \
graphics animations under the X Window System."
LICENSE = "GPL-2.0-or-later & GPL-3.0-or-later"

PV = "2.6"

RPM_NAME = "plotutils-devel-2.6-31.7.aarch64.rpm"
RPM_HASH = "c7f44a70608bbd15ec1c3402b0a0349151285fec68cff7077beeb99877a7454c6103cc99976211e62e1d7d6cf2388909b05c23ddff0acf2363d9150ce0a63cb0"

RPROVIDES:${PN} += "plotutils-devel"

RDEPENDS:${PN} += "bison \
flex \
fontpackages-devel \
gcc-c++ \
libplot2 \
libplotter2 \
libpng-devel \
libstdc++-devel \
libtool \
libxmi0 \
pkgconfig \
pkgconfig-x11 \
pkgconfig-xaw7 \
pkgconfig-xext \
pkgconfig-xt \
plotutils"

inherit rpm
