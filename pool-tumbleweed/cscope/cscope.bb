SUMMARY = "Interactive Tool for Browsing C Source Code"
DESCRIPTION = "Cscope is an interactive, screen-oriented tool that allows the user to \
browse through C source code files for specified elements of code."
LICENSE = "BSD-3-Clause"

PV = "15.9"

RPM_NAME = "cscope-15.9-2.9.aarch64.rpm"
RPM_HASH = "dc271cdbc7c308325692ec66935eb5ca48a00e41762f49e785257800ab95617cc982f77a383ea2786da5a7745835d0976d3b4f5c19a214665defda7e8dc42263"

RPROVIDES:${PN} += "cscope"

RDEPENDS:${PN} += "/usr/bin/sh \
ld-linux-aarch64.so.1 \
libc.so.6 \
libncurses.so.6 \
libtinfo.so.6"

inherit rpm
