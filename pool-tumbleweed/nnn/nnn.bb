SUMMARY = "Terminal based file browser"
DESCRIPTION = "nnn is a fork of noice, a terminal file browser with keyboard \
shortcuts for navigation, opening files and running tasks. There is \
no config file and MIME associations are hard-coded."
LICENSE = "BSD-2-Clause"

PV = "5.2"

RPM_NAME = "nnn-5.2-1.3.aarch64.rpm"
RPM_HASH = "2d3fe7d45d3c9fd04cea92b2889b98b6eb1593eb706066b16743c9d7389c7e6614fc3ec2f84be124b120d9d45b82e65c70fa61ff5785e5c5b7d556ca1849a472"

RPROVIDES:${PN} += "nnn"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libncursesw.so.6 \
libpcre2-8.so.0 \
libreadline.so.8 \
libtinfo.so.6"

inherit rpm
