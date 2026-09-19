SUMMARY = "Tcl/Tk Development"
DESCRIPTION = "Tools and libraries for development using Tcl and Tk."
LICENSE = "MIT"

PV = "20170319"

RPM_NAME = "patterns-devel-tcl-devel_tcl-20170319-2.19.aarch64.rpm"
RPM_HASH = "04e04781e26c5b49564d0265646ae646ece20187918d44ec35c8024f6f58f6a361de058e3dcd46e7b39d3c2a6a660ea7f9c159659b407bf252e746b3a61ffe37"

RPROVIDES:${PN} += "pattern- \
pattern-category- \
pattern-icon- \
pattern-order- \
pattern-visible- \
patterns-devel-tcl-devel-tcl"

RDEPENDS:${PN} += ""

inherit rpm
