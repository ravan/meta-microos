SUMMARY = "Text File Browser and Pager Similar to more"
DESCRIPTION = "less is a text file browser and pager similar to more. It allows \
backward as well as forward movement within a file. Also, less does not \
have to read the entire input file before starting. It is possible to \
start an editor at any time from within less."
LICENSE = "BSD-2-Clause | GPL-3.0-or-later"

PV = "704"

RPM_NAME = "less-704-1.3.aarch64.rpm"
RPM_HASH = "03236ba41e286a5583e9a095e607c0b144fcfdf5029553219612c1d676af8addfb7058687ef159d3949efb3c69439ee232dfe92319a96d05e471b6b617373801"

RPROVIDES:${PN} += "less"

RDEPENDS:${PN} += "/usr/bin/bash \
/usr/bin/sh \
ld-linux-aarch64.so.1 \
libc.so.6 \
libtinfo.so.6"

inherit rpm
