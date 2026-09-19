SUMMARY = "Very basic event publishing system"
DESCRIPTION = "This package contains documentation files for python-zope.event."
LICENSE = "ZPL-2.1"

PV = "6.2"

RPM_NAME = "python-zope.event-doc-6.2-1.2.noarch.rpm"
RPM_HASH = "edd6a94441a6a2972a26cb9846799245055c4fdb63c3d2e16db3c8649cc7557a585e656b8877d314b633a5e31921608cb5464cb203004d71a6ad34fd7f8211f9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python-zope.event-doc"

RDEPENDS:${PN} += ""

inherit rpm
