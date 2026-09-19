SUMMARY = "SANE backends for HP scanners and all-in-one devices"
DESCRIPTION = "The Hewlett-Packard Linux Imaging and Printing project (HPLIP) provides \
support for HP printers, scanners, and all-in-one devices. \
 \
This package provides scanning support for HP scanners and all-in-one \
devices. Some devices need the proprietary hplip plugin. Use the hp-plugin \
tool from the hplip-base package to install the plugin."
LICENSE = "BSD-3-Clause & GPL-2.0-or-later & MIT"

PV = "3.26.4"

RPM_NAME = "hplip-sane-3.26.4-2.2.aarch64.rpm"
RPM_HASH = "585746477799cfb79df25d6814bd3a7edd9ec51f5df2ab07e96e926b6cee381717e4d18e1bc103b2d7fc126a94d2b635455c3d7b2f4c7b8c550d0f8e357c23b0"

RPROVIDES:${PN} += "config-hplip-sane \
hplip-sane \
libsane-hpaio.so.1"

RDEPENDS:${PN} += "/usr/bin/sh \
hplip-common \
ld-linux-aarch64.so.1 \
libc.so.6 \
libcups.so.2 \
libdbus-1.so.3 \
libhpdiscovery.so.0 \
libhpip.so.0 \
libhplip0 \
libhpmud.so.0"

inherit rpm
