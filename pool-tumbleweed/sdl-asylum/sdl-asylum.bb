SUMMARY = "Asylum like game"
DESCRIPTION = "Young Sigmund has a few problems. To help him resolve his mental instability \
you must enter the surreal world of his inner mind and shut down the \
malfunctioning brain cells. \
 \
SDL Asylum is a C port of the computer game Asylum, which was written by Andy \
Southgate in 1994 for the Acorn Archimedes and is now public domain."
LICENSE = "GPL-3.0-or-later & SUSE-Public-Domain"

PV = "0.3.2"

RPM_NAME = "sdl-asylum-0.3.2-3.32.aarch64.rpm"
RPM_HASH = "ccd42ccbd814bac932bc5f3958a696527f66debc31e459207d02a6cb3d0b5c4c9f8633f6f6ff727c52424289e23d04796532e3d3bafda7fc1af0891fb9bb0b76"

RPROVIDES:${PN} += "config-sdl-asylum \
sdl-asylum"

RDEPENDS:${PN} += "group-games \
libGL.so.1 \
libGLU.so.1 \
libSDL-1.2.so.0 \
libSDL-mixer-1.2.so.0 \
libc.so.6 \
libm.so.6"

inherit rpm
