SUMMARY = "Documentation for the GNU Scientific Library"
DESCRIPTION = "This package contains documentation for GSL \
 \
The GNU Scientific Library (GSL) is a collection of routines for \
numerical computing. The routines are written from scratch by the GSL \
team in ANSI C, and present an Applications Programming Interface \
(API) for C programmers, while allowing wrappers to be written for very \
high level languages."
LICENSE = "GPL-3.0-or-later"

PV = "2.8"

RPM_NAME = "gsl-doc-2.8-5.3.noarch.rpm"
RPM_HASH = "78a97fa915f43d87ba8a33a040b1cc8be0a42bdca1341989b378f165a1456894632a8434e55a452a864c3158151d26c573c71c0e54b303bfb9532e31d420b113"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "gsl-doc"

RDEPENDS:${PN} += "/usr/bin/sh"

inherit rpm
