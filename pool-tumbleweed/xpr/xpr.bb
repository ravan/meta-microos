SUMMARY = "Utility to print an X window dump"
DESCRIPTION = "xpr takes as input a window dump file produced by xwd \
and formats it for output on various types of printers."
LICENSE = "MIT"

PV = "1.2.1"

RPM_NAME = "xpr-1.2.1-1.1.aarch64.rpm"
RPM_HASH = "ee22a97f01c0732db322e5aff3dac64af338fafaa9f9badd66e088ed31115752dc6cc4f3afd2e75a482ead5f3d1dc7a3299d69949a9673d15a7e560c564e3e1e"

RPROVIDES:${PN} += "xpr"

RDEPENDS:${PN} += "/usr/bin/sh \
ld-linux-aarch64.so.1 \
libX11.so.6 \
libXmuu.so.1 \
libc.so.6"

inherit rpm
