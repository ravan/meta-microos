SUMMARY = "Library for manipulation with Enhanced MetaFile (EMF, ECMA-234)"
DESCRIPTION = "LibEMF is a C/C++ library which provides a drawing toolkit based on \
ECMA-234. The general purpose of this library is to create vector \
graphics files on POSIX systems which can be imported into \
StarOffice/OpenOffice. The Enhanced MetaFile (EMF) is one of the two \
color vector graphics format which is 'vectorially' understood by \
SO/OO. The EMF format also has the additional advantage that it can be \
'broken' into its constituent components and edited like any other \
SO/OO graphics object."
LICENSE = "GPL-2.0-or-later"

PV = "1.0.13"

RPM_NAME = "libEMF-utils-1.0.13-3.14.aarch64.rpm"
RPM_HASH = "ef2fa20601403a38ca415367a128a952da1e5360291ad948794f39531afa4a7f9d46a7014b9aec15d73afcea842301413d4b1503fb6a80e2b6b3f59fa90035fc"

RPROVIDES:${PN} += "libEMF-/usr/bin/printemf \
libEMF-utils"

RDEPENDS:${PN} += "libEMF.so.1 \
libc.so.6"

inherit rpm
