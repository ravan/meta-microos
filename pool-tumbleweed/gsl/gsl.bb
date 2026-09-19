SUMMARY = "GNU Scientific Library"
DESCRIPTION = "The GNU Scientific Library (GSL) is a collection of routines for \
numerical computing. The routines are written from scratch by the GSL \
team in ANSI C and present an Applications Programming Interface \
(API) for C programmers, while allowing wrappers to be written for very \
high level languages."
LICENSE = "GPL-3.0-or-later"

PV = "2.8"

RPM_NAME = "gsl-2.8-5.3.aarch64.rpm"
RPM_HASH = "fec83a50f0dbe22c976d5b1fd95e3565393d6ef30a91394417ac1788699eea6ee126cd8d64c4d236d2a21cfe266564e65fc5b30e37f1a24ef171c7327911c551"

RPROVIDES:${PN} += "gsl"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libgsl.so.28 \
libgslcblas.so.0 \
update-alternatives"

inherit rpm
