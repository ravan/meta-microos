SUMMARY = "OpenIB Mellanox InfiniBand Diagnostic Tools"
DESCRIPTION = " \
 \
 \
 \
 \
 \
 \
 \
 \
 \
 \
 \
 \
 \
 \
 \
 \
 \
 \
 \
The ibutils-ui package provides a set of graphical UI tools that check the health \
of an InfiniBand fabric. \
 \
Package components: \
ibdiag:   This package provides one tool which provide the user interface \
          to activate the above functionality: \
            - ibdiagui:   A GUI wrapper for ibdiagnet and ibdiagpath."
LICENSE = "BSD-3-Clause | GPL-2.0-or-later"

PV = "1.5.7.0.2"

RPM_NAME = "ibutils-ui-1.5.7.0.2-12.7.aarch64.rpm"
RPM_HASH = "0aaa6f9ceca19236b4fc2337f5d690813660bb1fb007d7a367bfacfa8bd64e0ef5a2b448522e09672b2072dcd9eefb759dc082768509b379d01949aab27d0b55"

RPROVIDES:${PN} += "ibutils-ui"

RDEPENDS:${PN} += "/usr/bin/sh \
graphviz-tcl \
ibutils"

inherit rpm
