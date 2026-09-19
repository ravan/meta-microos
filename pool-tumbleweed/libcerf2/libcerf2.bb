SUMMARY = "A library that provides complex error functions"
DESCRIPTION = "libcerf is a self-contained numeric library that provides an efficient and \
accurate implementation of complex error functions, along with Dawson, \
Faddeeva, and Voigt functions."
LICENSE = "MIT"

PV = "2.4"

RPM_NAME = "libcerf2-2.4-3.9.aarch64.rpm"
RPM_HASH = "6bfd65df6be0a46163632aa3864e68595635c103379c9a866ca3148cb1e61f526bd4ab8f4349c46eba34f7bea728d61e1a724ac79b1c28bda60ad3b2c898e267"

RPROVIDES:${PN} += "libcerf.so.2 \
libcerf2"

RDEPENDS:${PN} += "/sbin/ldconfig \
libm.so.6"

inherit rpm
