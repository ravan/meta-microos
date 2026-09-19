SUMMARY = "A Computer algebra package for Lie group computations"
DESCRIPTION = "LiE is a computer algebra system that is specialised in computations \
involving (reductive) Lie groups and their representations."
LICENSE = "LGPL-3.0-or-later"

PV = "2.2.2"

RPM_NAME = "LiE-2.2.2-8.9.aarch64.rpm"
RPM_HASH = "f0225eed9d33b747522180226b57d683cded9b54a4d85e42310dbe43ece43a33714a6e4262234d86eb977cf7046217ebbcdcd63dca5b3e7ee6539bb4a8243b13"

RPROVIDES:${PN} += "LiE"

RDEPENDS:${PN} += "/usr/bin/bash \
libc.so.6 \
libreadline.so.8"

inherit rpm
