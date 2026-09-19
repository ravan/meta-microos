SUMMARY = "Documentation for the universal TLS Tunnel"
DESCRIPTION = "This package contains additional documentation for the stunnel program."
LICENSE = "GPL-2.0-or-later"

PV = "5.80"

RPM_NAME = "stunnel-doc-5.80-1.1.noarch.rpm"
RPM_HASH = "f9e6fa85296b68b8b97b2fed5319b853a1131de44fab9ef78cff80fe0503f04cfe4022864e3b4b820286a918d9b2796925bb40defd0621c2a08718943f6ce146"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "stunnel-doc"

RDEPENDS:${PN} += "stunnel"

inherit rpm
