SUMMARY = "Documentation for texlive-lastpage"
DESCRIPTION = "This package includes the documentation for texlive-lastpage"
LICENSE = "LPPL-1.0"

PV = "2026.226.2.1hsvn77682"

RPM_NAME = "texlive-lastpage-doc-2026.226.2.1hsvn77682-63.2.noarch.rpm"
RPM_HASH = "2b96a6985c5a429c5f28a05bd63ed490a16242c7826a718bf2f8a55ca29754649863d28bc9e165b9efcfb2867f36d94a7b76fef78621f570de5bb8ba72121502"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-lastpage-doc"

RDEPENDS:${PN} += ""

inherit rpm
