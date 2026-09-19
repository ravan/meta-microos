SUMMARY = "Library and tools for handling X-Face data"
DESCRIPTION = "The programs compface and uncompface convert 48x48x1 images to and from \
a compressed format.  The purpose of the programs is to allow the \
inclusion of face images within mail headers using the field name \
'X-face:'.  They make use of a library that allows the compression and \
decompression algorithms to be used in other programs, such as mail \
dispatchers and mail notification daemons."
LICENSE = "MIT"

PV = "1.5.2"

RPM_NAME = "compface-1.5.2-160.7.aarch64.rpm"
RPM_HASH = "64885d5de4259abea5d568e6ea5a9a2860b50407aaf4d0e0f64f3387c0fd02a67b006f8dff7323bbf600306b938f7e21de0bd20bda9b2be22779817934050710"

RPROVIDES:${PN} += "compface \
libcompface.so.1"

RDEPENDS:${PN} += "/sbin/ldconfig \
/usr/bin/perl \
/usr/bin/sh \
ld-linux-aarch64.so.1 \
libc.so.6"

inherit rpm
