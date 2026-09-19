SUMMARY = "YaST User Interfaces"
DESCRIPTION = "Graphical YaST user interfaces for minimal X desktop."
LICENSE = "MIT"

PV = "20260219"

RPM_NAME = "patterns-yast-x11_yast-20260219-1.2.aarch64.rpm"
RPM_HASH = "2b93df6b5b143be44615eabca6cfa44330e695db4f43008f89e979a4ef5a92517d30ed0d033aa1a61f0fe63b1cbbe2ce7d9ceea07b5337c339886bef28709b19"

RPROVIDES:${PN} += "pattern- \
pattern-category- \
pattern-extends- \
pattern-icon- \
pattern-order- \
pattern-visible- \
patterns-yast-x11-yast"

RDEPENDS:${PN} += ""

inherit rpm
