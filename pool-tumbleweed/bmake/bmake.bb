SUMMARY = "The NetBSD make(1) tool"
DESCRIPTION = "bmake, the NetBSD make(1) tool, is a program designed to simplify the \
maintenance of other programs.  The input of bmake is a list of specifications \
indicating the files upon which the targets (programs and other files) depend. \
bmake then detects which targets are out of date based on their dependencies \
and triggers the necessary commands to bring them up to date when that happens. \
 \
bmake is similar to GNU make, even though the syntax for the advanced features \
supported in Makefiles is very different."
LICENSE = "BSD-2-Clause & BSD-3-Clause & BSD-4-Clause"

PV = "20260824"

RPM_NAME = "bmake-20260824-1.1.aarch64.rpm"
RPM_HASH = "dcae42530263214accedad6705a630f2c1f99e46a084b077fdb2331140fe4ca99ff38949f826aa45c07f4c57614f281ee640ef21f331a303fb2391215fcfb799"

RPROVIDES:${PN} += "bmake"

RDEPENDS:${PN} += "/usr/bin/python3 \
/usr/bin/sh \
ld-linux-aarch64.so.1 \
libc.so.6"

inherit rpm
