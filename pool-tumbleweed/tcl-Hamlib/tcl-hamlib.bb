SUMMARY = "Tcl bindings for Hamlib"
DESCRIPTION = "Hamlib provide a programming interface for controlling radios and \
other shack hardware."
LICENSE = "LGPL-2.1-only"

PV = "4.7.2"

RPM_NAME = "tcl-Hamlib-4.7.2-1.3.aarch64.rpm"
RPM_HASH = "07367ff8be98a4f90c7858b9bab9ae9bfcf48171eef51081eba770f8c99b7facc0fc0bd659b13b20db34c2b3ab35b4ba2b2c50d3eef62ce993dfbae9bfbd9d1f"

RPROVIDES:${PN} += "tcl-Hamlib"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libhamlib.so.4 \
libtcl8.6.so \
tcl"

inherit rpm
