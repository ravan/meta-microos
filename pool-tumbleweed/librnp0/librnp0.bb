SUMMARY = "OpenPGP implementation as a C++ library fully compliant with RFC 4880"
DESCRIPTION = "RNP is a set of OpenPGP (RFC4880) tools, an alternative to GnuPG. \
librnp is the library used by RNP for all OpenPGP functions, useful for \
developers to build against, different from GPGME."
LICENSE = "Apache-2.0 & BSD-2-Clause & BSD-3-Clause"

PV = "0.18.1"

RPM_NAME = "librnp0-0.18.1-5.1.aarch64.rpm"
RPM_HASH = "6d2813acfcdd358c55b515f6214c464eb41ee53c48a8cd066dced587fbc97c0256e6f07ea3c92f35fbe00dc4d5d713ce610f09f45cef696e268e20f46a4ea08a"

RPROVIDES:${PN} += "librnp.so.0 \
librnp0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libbotan-3.so.13 \
libbz2.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libjson-c.so.5 \
libsexpp.so.0 \
libstdc++.so.6 \
libz.so.1"

inherit rpm
