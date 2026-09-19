SUMMARY = "Compare Files Side by Side"
DESCRIPTION = "Mgdiff is a graphical front-end to the Unix diff command based on X11 \
and the Motif widget set. It allows the user to select two files for \
comparison, runs the diff command, parses the output and presents the \
results graphically. \
 \
 \
 \
Authors: \
-------- \
    Daniel Williams <dan@sass.com>"
LICENSE = "MIT"

PV = "1.0.1"

RPM_NAME = "mgdiff-1.0.1-10.6.aarch64.rpm"
RPM_HASH = "fe0867f44430edf1ce9b9426caf8c94bf58f0bf746db5c6319a9120b2ce2ca2f76148a428a44c382c4b86eba2aac78bc8a6830b34c36290368b757c726ab7085"

RPROVIDES:${PN} += "mgdiff"

RDEPENDS:${PN} += "/usr/bin/bash \
/usr/bin/sh \
ld-linux-aarch64.so.1 \
libX11.so.6 \
libXm.so.4 \
libXt.so.6 \
libc.so.6"

inherit rpm
