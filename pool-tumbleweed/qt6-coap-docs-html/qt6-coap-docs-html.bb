SUMMARY = "Documentation for qt6-coap in HTML format"
DESCRIPTION = "This package contains documentation for qt6-coap in HTML format."
LICENSE = "GFDL-1.3-or-later"

PV = "6.11.2"

RPM_NAME = "qt6-coap-docs-html-6.11.2-1.1.aarch64.rpm"
RPM_HASH = "10334bd4f0e167123a3fe64179948852beb65a88234928e264efe26d350a2973a6cded3e7e91550dcfc001269ecb6ac8ce269f52a7799a76a416d7913f139959"

RPROVIDES:${PN} += "qt6-coap-docs-html"

RDEPENDS:${PN} += ""

inherit rpm
