SUMMARY = "TCL Plugin Support for Pidgin"
DESCRIPTION = "TCL plugin loader for Pidgin. This package will allow you to write \
or use Pidgin plugins written in the TCL programming language."
LICENSE = "GPL-2.0-only"

PV = "2.14.14"

RPM_NAME = "libpurple-tcl-2.14.14-2.3.aarch64.rpm"
RPM_HASH = "b89eeed2db81acc675f4dc9a777c2b872cbafdeae84bc4bc3512a5650d0ae9873cd82d473534b7b22cb20908acc382491f945af6918e842c476b02e0c71d3434"

RPROVIDES:${PN} += "libpurple-tcl"

RDEPENDS:${PN} += "libc.so.6 \
libglib-2.0.so.0 \
libpurple \
libtcl8.6.so \
libtk8.6.so"

inherit rpm
