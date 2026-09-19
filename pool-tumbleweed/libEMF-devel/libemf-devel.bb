SUMMARY = "Library for manipulation with Enhanced MetaFile (EMF, ECMA-234)"
DESCRIPTION = "LibEMF is a C/C++ library which provides a drawing toolkit based on \
ECMA-234. The general purpose of this library is to create vector \
graphics files on POSIX systems which can be imported into \
StarOffice/OpenOffice. The Enhanced MetaFile (EMF) is one of the two \
color vector graphics format which is 'vectorially' understood by \
SO/OO. The EMF format also has the additional advantage that it can be \
'broken' into its constituent components and edited like any other \
SO/OO graphics object."
LICENSE = "GPL-2.0-or-later & LGPL-2.1-or-later"

PV = "1.0.13"

RPM_NAME = "libEMF-devel-1.0.13-3.14.aarch64.rpm"
RPM_HASH = "6149c09529b7944a9196fb81f4a49673a533c7c8d60b4b6bae1026ec4da9ce4ee530fd6004863774aac16df4da22ec74942f6524163935125287abf43e5b98db"

RPROVIDES:${PN} += "libEMF-devel"

RDEPENDS:${PN} += "glibc-devel \
libEMF1"

inherit rpm
