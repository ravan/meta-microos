SUMMARY = "Commandline parser generator"
DESCRIPTION = "Gengetopt is a tool to generate C code to parse getopt styled command line \
arguments. \
It's similar or even more powerful than the well known libpopt but does not \
add any run or compile time dependencies to your projects. Moreover \
reading/writing the options from/to config files is also supported."
LICENSE = "GPL-3.0-or-later"

PV = "2.23"

RPM_NAME = "gengetopt-2.23-1.25.aarch64.rpm"
RPM_HASH = "4825d702359b77de54e93bf49ab1b2bd8a37e8d8248470c29e7ac3d682f2aa959f43b0dc6bc1ebb7c1afe18af4dd18b5e93681b697b4ec2a50c2f5c0b47b25f3"

RPROVIDES:${PN} += "gengetopt"

RDEPENDS:${PN} += "/usr/bin/sh \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libstdc++.so.6"

inherit rpm
