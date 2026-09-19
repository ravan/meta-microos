SUMMARY = "Documentation and examples for the Qore openldap module"
DESCRIPTION = "This package contains the HTML documentation and example programs for the Qore \
openldap module."
LICENSE = "GPL-2.0-or-later | LGPL-2.1-or-later"

PV = "1.2.3"

RPM_NAME = "qore-openldap-module-doc-1.2.3-5.6.aarch64.rpm"
RPM_HASH = "0b8582e518a15c75a7130362b1a759870fa7334aa8e23395b4317a9328cbf82229df688606bc89d7c3990b7ff893ac6a8e9924ef089c2e893594cdddda123753"

RPROVIDES:${PN} += "qore-openldap-module-doc"

RDEPENDS:${PN} += ""

inherit rpm
