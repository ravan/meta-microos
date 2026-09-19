SUMMARY = "System for Computational Discrete Algebra"
DESCRIPTION = "GAP is a system for computational discrete algebra, with particular \
emphasis on Computational Group Theory. GAP provides a programming \
language, a library of thousands of functions implementing algebraic \
algorithms written in the GAP language as well as large data \
libraries of algebraic objects. GAP is used in research and teaching \
for studying groups and their representations, rings, vector spaces, \
algebras, combinatorial structures, and more."
LICENSE = "GPL-2.0-or-later"

PV = "4.16.1"

RPM_NAME = "gap-4.16.1-1.1.aarch64.rpm"
RPM_HASH = "a60efc3f53d50767047bf9e227ada9344501a955c521c712d7123757a3c3b6dacf736523d04720c96c60089790e392534b6326fddfe57a66f3a118f8eabb67c9"

RPROVIDES:${PN} += "gap \
gap-core"

RDEPENDS:${PN} += "/usr/bin/perl \
gap-gapdoc \
gap-primgrp \
gap-smallgrp \
gap-transgrp \
libc.so.6 \
libgap.so.11"

inherit rpm
