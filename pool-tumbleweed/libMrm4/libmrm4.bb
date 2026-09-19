SUMMARY = "Motif Resource Manager library"
DESCRIPTION = "The Motif resource manager (MRM) is responsible for creating widgets \
based on definitions contained in user interface definition (UID) \
files created by the UIL compiler. MRM interprets the output of the \
UIL compiler and generates the appropriate argument lists for widget \
creation functions."
LICENSE = "LGPL-2.1-or-later"

PV = "2.3.8"

RPM_NAME = "libMrm4-2.3.8-4.7.aarch64.rpm"
RPM_HASH = "4c643ce72c6abb4a459c263ead6b95d71957a76fd5c44d4de8f97794abe70d79ee9f14e37d80fc2d27133d3fde862d83ba11d76f4e1567c1d1c96e47e3f56d1f"

RPROVIDES:${PN} += "libMrm.so.4 \
libMrm4"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libX11.so.6 \
libXm.so.4 \
libXt.so.6 \
libc.so.6"

inherit rpm
