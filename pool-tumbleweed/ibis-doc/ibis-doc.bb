SUMMARY = "Documentation for ibis"
DESCRIPTION = "Documentation for ibis."
LICENSE = "GPL-2.0-or-later"

PV = "0.16.0"

RPM_NAME = "ibis-doc-0.16.0-1.3.noarch.rpm"
RPM_HASH = "b49e6004f4ebee1805a77cab7da8d0c9a2e82877ae49bf9fe7b5e570409486d737da6b0cd23ab4490fb665697ae6ad3bbb21bedcf7e1c9561b7b2a8c08143ec3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ibis-doc"

RDEPENDS:${PN} += ""

inherit rpm
