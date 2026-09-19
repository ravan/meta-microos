SUMMARY = "A library for text mode user interfaces"
DESCRIPTION = "Newt is a programming library for color text-mode, widget-based user \
interfaces.  Newt can be used to add stacked windows, entry widgets, \
checkboxes, radio buttons, labels, plain text fields, scrollbars, etc., \
to text mode user interfaces. \
 \
This package also contains a Dialog replacement called whiptail. Newt \
is based on the slang library."
LICENSE = "LGPL-2.1-or-later"

PV = "0.52.25"

RPM_NAME = "newt-0.52.25-2.1.aarch64.rpm"
RPM_HASH = "763ea710871cc1441eb55a36bff52c256c5346ba8872901ae0cc03b8e98766186ffdc5d08b1b859124bc47ed96d9939f61539a1a569c0e1988cf9f28c6329db6"

RPROVIDES:${PN} += "newt"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libnewt.so.0.52 \
libpopt.so.0 \
libslang.so.2"

inherit rpm
