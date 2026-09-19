SUMMARY = "Documentation for texlive-dramatist"
DESCRIPTION = "This package includes the documentation for texlive-dramatist"
LICENSE = "GPL-2.0-or-later"

PV = "2026.226.1.2esvn35866"

RPM_NAME = "texlive-dramatist-doc-2026.226.1.2esvn35866-59.2.noarch.rpm"
RPM_HASH = "1078e7cb9e53d2af522267958648857ae3167abcc04d83c9e5f06cb348c5fe2e2f9a27063a196ea7366ecdae60e062c4520594534e3a47da952e7a03b583bb56"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-dramatist-doc"

RDEPENDS:${PN} += ""

inherit rpm
