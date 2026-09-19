SUMMARY = "Documentation for texlive-context-calendar-examples"
DESCRIPTION = "This package includes the documentation for texlive-context-calendar-examples"
LICENSE = "SUSE-Public-Domain"

PV = "2026.226.svn66947"

RPM_NAME = "texlive-context-calendar-examples-doc-2026.226.svn66947-61.2.noarch.rpm"
RPM_HASH = "07ece6516c9440d83a8abac957fbdd8a7eb15cdc680132ac545715578d250903f9a27393277bc531a21b73417c45dceb2f37b4093569ec327061c9269a632006"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-context-calendar-examples-doc"

RDEPENDS:${PN} += ""

inherit rpm
