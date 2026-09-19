SUMMARY = "API documentation, programming language reference, and Qore example programs"
DESCRIPTION = "Qore is a scripting language supporting threading and embedded logic, designed \
for applying a flexible scripting-based approach to enterprise interface \
development but is also useful as a general purpose language. \
 \
This package provides the HTML documentation for the Qore programming language \
and also for user modules delivered with Qore and also example programs."
LICENSE = "GPL-2.0-or-later | LGPL-2.1-or-later | MIT"

PV = "2.2.1"

RPM_NAME = "qore-doc-2.2.1-1.1.noarch.rpm"
RPM_HASH = "b92f5eb55e1aa549b917081777bc984103054588ae50832dda83761b6769f6806195a01d6310b7143d2398bee43e37857c54d8d343145bef153f24ffb11b8278"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "qore-doc"

RDEPENDS:${PN} += ""

inherit rpm
