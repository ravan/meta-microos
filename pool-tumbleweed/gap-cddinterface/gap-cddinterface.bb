SUMMARY = "GAP: Interface to cddlib"
DESCRIPTION = "CddInterface is a GAP interface with the C package 'cddlib' which, \
among other things, can translate between H,V-representations of a \
polyhedron P and solve linear programming problems over P, i.e. a \
problem of maximizing and minimizing a linear function over P."
LICENSE = "GPL-2.0-or-later"

PV = "2026.03.02"

RPM_NAME = "gap-cddinterface-2026.03.02-1.3.aarch64.rpm"
RPM_HASH = "f1c7f5691d533ddf620786b0d079cf6d1f69a5c92a75906ca4bda01068ce565d77183e1178b680537e43c9c94df44e1f53259000814645f2f897b96c63219559"

RPROVIDES:${PN} += "gap-cddinterface"

RDEPENDS:${PN} += "/usr/bin/bash \
/usr/bin/sh \
gap-core \
gap-gapdoc \
ld-linux-aarch64.so.1 \
libc.so.6 \
libcddgmp.so.0 \
libgmp.so.10"

inherit rpm
