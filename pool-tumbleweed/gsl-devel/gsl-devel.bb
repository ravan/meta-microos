SUMMARY = "Development files for the GNU Scientific Library"
DESCRIPTION = "This package contains the headers, static libraries and some \
documentation for GSL. \
 \
The GNU Scientific Library (GSL) is a collection of routines for \
numerical computing. The routines are written from scratch by the GSL \
team in ANSI C, and present an Applications Programming Interface \
(API) for C programmers, while allowing wrappers to be written for very \
high level languages."
LICENSE = "GPL-3.0-or-later"

PV = "2.8"

RPM_NAME = "gsl-devel-2.8-5.3.aarch64.rpm"
RPM_HASH = "b9ed6ea8751610853eba9ca15a0123e2531d792e436d990c8de67d1e44896339008a8c48f393de5bd0913f8c917c94b2d92063c464fbf880a96eed76410f4b8e"

RPROVIDES:${PN} += "gsl-devel \
pkgconfig-gsl"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
/usr/bin/sh \
libgsl28 \
libgslcblas0"

inherit rpm
