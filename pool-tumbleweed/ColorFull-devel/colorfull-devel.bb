SUMMARY = "Development files for ColorFull, a library for calculations in QCD color space"
DESCRIPTION = "ColorFull is a C++ library for calculations in QCD (SU(Nc)) color space. It can \
* Square any QCD color amplitude and calculate any interference. \
* Create a trace type basis for any number of quarks and gluons. \
* Read in and write out color bases. \
* Calculate scalar product matrices, i.e., the matrices of scalar products \
  between the basis vectors. \
* Describe the effect of gluon exchange, including calculating the color \
  soft anomalous dimension matrices. \
* Describe the effect of gluon emission. \
* Be interfaced to Herwig++ (>= 2.7) via Matchbox. \
 \
This package provides the headers and source files needed for developing applications using ColorFull."
LICENSE = "GPL-2.0-only"

PV = "1.1"

RPM_NAME = "ColorFull-devel-1.1-2.9.aarch64.rpm"
RPM_HASH = "962bb653f3431748437f954f4e053e4fef6ff5da5c8f2f160b648833c777a81ef46095c899b98c3eeb9ca65af2002cc87321f342b8790cb4ab80e3bd9bf118c5"

RPROVIDES:${PN} += "ColorFull-devel \
pkgconfig-ColorFull"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libColorFull0"

inherit rpm
