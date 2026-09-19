SUMMARY = "Header files for the REXX interpreter"
DESCRIPTION = "This package contains all necessary include files and libraries needed \
to develop applications that require Regina-REXX."
LICENSE = "GFDL-1.1-only & LGPL-2.1-or-later"

PV = "3.9.7"

RPM_NAME = "Regina-REXX-devel-3.9.7-1.1.aarch64.rpm"
RPM_HASH = "7ce24e3cd0d69bd81f3edfed20ad60601bce55fe2f45e3d4abb5f388f5b1b4b384a46fa6809222ee8bcb154400e635bff837b8e1cac66a3823a482c6b70d894d"

RPROVIDES:${PN} += "Regina-REXX-devel \
pkgconfig-libregina \
regina-/usr/include/rexxsaa.h \
regina-devel"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
/usr/bin/sh \
Regina-REXX \
libregina3"

inherit rpm
