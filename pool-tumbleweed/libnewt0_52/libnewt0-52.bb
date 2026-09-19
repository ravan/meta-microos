SUMMARY = "Shared libraries for Nifty Erik's Windowing Toolkit"
DESCRIPTION = "This package contains the shared libraries needed by programs built \
with newt. \
 \
Newt is a programming library for color text-mode widget-based user \
interfaces.  Newt can be used to add stacked windows, entry widgets, \
check boxes, radio buttons, labels, plain text fields, scrollbars, \
etc., to text mode user interfaces."
LICENSE = "LGPL-2.1-or-later"

PV = "0.52.25"

RPM_NAME = "libnewt0_52-0.52.25-2.1.aarch64.rpm"
RPM_HASH = "baa2ea0212b2bead5c1cd3bb4a09e067aeeebe6893bec61a5a9eef4d331a1fcaea6f1223a6b6a78bcbe09bb36fa9d7c678770c4ea3d372f244aedd1c9b6330ad"

RPROVIDES:${PN} += "libnewt.so.0.52 \
libnewt0-52"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libslang.so.2"

inherit rpm
