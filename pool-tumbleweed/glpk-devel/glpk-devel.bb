SUMMARY = "GNU Linear Programming Kit"
DESCRIPTION = "The GLPK package is intended for solving large-scale linear \
programming, mixed integer programming, and other related problems. It \
is a set of routines written in ANSI C and organized in the form of a \
callable library."
LICENSE = "GPL-3.0-only"

PV = "5.0"

RPM_NAME = "glpk-devel-5.0-5.3.aarch64.rpm"
RPM_HASH = "bb41d2d204334bc378b7fcc173a095e43584e39e6eef330a99d13b1a4686f0abad3da8d420d9cbe56e79f45c6c51ba00077f7bcb779b673dbae3c76018383dda"

RPROVIDES:${PN} += "glpk-devel \
pkgconfig-glpk"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libglpk40"

inherit rpm
