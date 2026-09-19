SUMMARY = "Opensm runtime library"
DESCRIPTION = "This package contains one of the opensm runtime libraries."
LICENSE = "BSD-2-Clause | GPL-2.0-only"

PV = "3.3.24"

RPM_NAME = "libosmcomp5-3.3.24-5.4.aarch64.rpm"
RPM_HASH = "beed3c420e17db3512bcec4ebac352150d48419bc4dc3a189345c43c821c9044568a885ea8e5007f664d8887aee3b918cfe7bfa68684247c8227670e20c9070a"

RPROVIDES:${PN} += "libosmcomp.so.5 \
libosmcomp5"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6"

inherit rpm
