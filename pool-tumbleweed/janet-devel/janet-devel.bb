SUMMARY = "Headers for embedding Janet scripting"
DESCRIPTION = "Janet is a functional and imperative programming language.  Janet scripting \
can be added to an application by embedding a single C source file and a \
single header. \
 \
This package contains the development files for the Janet programming language."
LICENSE = "MIT"

PV = "1.39.0"

RPM_NAME = "janet-devel-1.39.0-1.6.aarch64.rpm"
RPM_HASH = "5850cd674e876bb8db4a1c3ea4507766c8cf6da13a8e3671c1036455f2f31f633d15d65f874e77fb9c39a2597acb04aaacaf5f4bb34438c3443682be59f8f61d"

RPROVIDES:${PN} += "janet-devel \
pkgconfig-janet"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libjanet1-39"

inherit rpm
