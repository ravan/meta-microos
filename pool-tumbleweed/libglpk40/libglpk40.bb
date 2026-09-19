SUMMARY = "GNU Linear Programming Kit"
DESCRIPTION = "The GLPK package is intended for solving large-scale linear \
programming, mixed integer programming, and other related problems. It \
is a set of routines written in ANSI C and organized in the form of a \
callable library."
LICENSE = "GPL-3.0-only"

PV = "5.0"

RPM_NAME = "libglpk40-5.0-5.3.aarch64.rpm"
RPM_HASH = "098b7ed44e9a235c1947af3f884bf8554ec24ef1bd188f584ae5bcfe013c33d880ea29cb1bf616d4358cc7f19a4b9d8e6cbf90252364cf8cc293f069b3a579d2"

RPROVIDES:${PN} += "libglpk.so.40 \
libglpk40"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgmp.so.10 \
libltdl.so.7 \
libm.so.6"

inherit rpm
