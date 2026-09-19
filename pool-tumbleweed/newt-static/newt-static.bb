SUMMARY = "Static libraries of Nifty Erik's Windowing Toolkit"
DESCRIPTION = "This package contains the static libraries needed to compile programs \
based on newt which don't need the shared libraries. Install it if you \
need to link statically with libnewt. \
 \
Newt is a programming library for color text-mode widget-based user \
interfaces.  Newt can be used to add stacked windows, entry widgets, \
check boxes, radio buttons, labels, plain text fields, scrollbars, \
etc., to text mode user interfaces."
LICENSE = "LGPL-2.1-or-later"

PV = "0.52.25"

RPM_NAME = "newt-static-0.52.25-2.1.aarch64.rpm"
RPM_HASH = "61f50868afaedbcaa1eed7c0238250da3478be0a21118c645ad26e95c5469debdb750a9fb9412bf7dd1abeea0c389f14505831b17f31ff154a8439337ad36e4b"

RPROVIDES:${PN} += "newt-static"

RDEPENDS:${PN} += "newt-devel"

inherit rpm
