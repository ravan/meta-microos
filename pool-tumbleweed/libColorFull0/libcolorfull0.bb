SUMMARY = "C++ library for calculations in QCD (SU(Nc)) color space"
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
This package provides the shared library for ColorFull."
LICENSE = "GPL-2.0-only"

PV = "1.1"

RPM_NAME = "libColorFull0-1.1-2.9.aarch64.rpm"
RPM_HASH = "24d598c0f3bff6c4ce98d4368b25f1b83a08e29302b18bc2e557b2f20ae75820a55733152e68732ba18edf9763411af30dce730e9d824582dec33bdc477c2901"

RPROVIDES:${PN} += "libColorFull.so.0 \
libColorFull0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libm.so.6 \
libstdc++.so.6"

inherit rpm
