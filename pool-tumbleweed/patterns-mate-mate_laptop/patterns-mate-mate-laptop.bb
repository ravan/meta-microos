SUMMARY = "MATE Laptop"
DESCRIPTION = "MATE Tools designed specifically for use with laptop computers."
LICENSE = "MIT"

PV = "20170319"

RPM_NAME = "patterns-mate-mate_laptop-20170319-6.3.aarch64.rpm"
RPM_HASH = "be1bbb0fa6112c3659cad512547f3bfd7f542905522b5d3f741faa5ad72c9916a14f6bc20a2f232061e089fa14ad3de3aeff93d7f9954ba0412200cb1b7e8c99"

RPROVIDES:${PN} += "pattern- \
pattern-category- \
pattern-extends- \
pattern-icon- \
pattern-order- \
patterns-mate-mate-laptop"

RDEPENDS:${PN} += "pattern-"

inherit rpm
