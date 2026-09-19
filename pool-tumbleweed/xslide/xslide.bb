SUMMARY = "XSL Integrated Development Environment"
DESCRIPTION = "An Emacs mode to edit XSL files."
LICENSE = "GPL-2.0-or-later"

PV = "0.2.2"

RPM_NAME = "xslide-0.2.2-265.7.noarch.rpm"
RPM_HASH = "d893563c082ca3a4833c7c03fb025e2609d12afc12fa23a42a6c3eab728d051a37af590c59f01833472f42886b9c25f7bfb5be9fdd1d3c0dca44de7b525cfa24"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "xslide"

RDEPENDS:${PN} += "emacs-program \
psgml"

inherit rpm
