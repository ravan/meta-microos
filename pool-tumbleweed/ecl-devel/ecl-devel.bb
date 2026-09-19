SUMMARY = "Embeddable Common-Lisp -- development files"
DESCRIPTION = "ECL (Embeddable Common-Lisp) is an interpreter of the Common-Lisp language as \
described in the X3J13 Ansi specification, featuring CLOS (Common-Lisp Object \
System), conditions, loops, etc, plus a translator to C, which can produce \
standalone executables. \
 \
ECL supports the operating systems Linux, FreeBSD, NetBSD, OpenBSD, OS X, \
Solaris and Windows, running on top of the Intel, Sparc, Alpha, PowerPC and ARM \
processors. \
 \
This package contains development files for ECL."
LICENSE = "LGPL-2.1-or-later"

PV = "26.3.27"

RPM_NAME = "ecl-devel-26.3.27-1.6.aarch64.rpm"
RPM_HASH = "b48c95a22f047d1fb8177f8ed203e5d6c42abc423af017816274a6064307dccc4237eb29b4921954fa83beca2a0f9b2518f769f4406105ba3b70e3170ac50da8"

RPROVIDES:${PN} += "ecl-devel"

RDEPENDS:${PN} += "/usr/bin/sh \
libecl26-3"

inherit rpm
