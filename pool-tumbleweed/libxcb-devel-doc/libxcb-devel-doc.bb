SUMMARY = "Documentation for libxcb"
DESCRIPTION = "The X protocol C-language Binding (XCB) is a replacement for Xlib \
featuring a small footprint, latency hiding, direct access to the \
protocol, improved threading support, and extensibility. \
 \
This subpackage contains the manual pages and documentation for \
libxcb."
LICENSE = "MIT"

PV = "1.17.0"

RPM_NAME = "libxcb-devel-doc-1.17.0-2.7.noarch.rpm"
RPM_HASH = "1ae4b325df0920e14904a519b538dbd77c46967934d03cb2827513f6bda5241fdc0f0b74852ddacf940b5667c5b6ef30da3c8f20af70661f694ddf1dc24f7d55"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "libxcb-devel-doc"

RDEPENDS:${PN} += ""

inherit rpm
