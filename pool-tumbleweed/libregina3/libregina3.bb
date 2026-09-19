SUMMARY = "The regina shared library"
DESCRIPTION = "This package provides the shared library for Mark Hessling's implementation \
of the REXX Interpreter."
LICENSE = "GFDL-1.1-only & LGPL-2.1-or-later"

PV = "3.9.7"

RPM_NAME = "libregina3-3.9.7-1.1.aarch64.rpm"
RPM_HASH = "36d797f9e72d18aa3c9756b2b9b6679f4ab1fc9bc097cb9dd88793b9d7c6bfee101c39a157ca80eedd7b8baf11dffacaac09089a34a4ab7f4b55622c7583fc83"

RPROVIDES:${PN} += "libregina.so.3 \
libregina3 \
libregutil.so \
librxtest1.so \
librxtest2.so"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libcrypt.so.1 \
libm.so.6 \
libtinfo.so.6"

inherit rpm
