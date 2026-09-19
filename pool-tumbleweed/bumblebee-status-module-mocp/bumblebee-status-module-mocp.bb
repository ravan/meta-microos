SUMMARY = "Widget to display information about the current song in moc"
DESCRIPTION = "Displays information about the current song in moc, via mocp. \
 \
Takes one parameter (mocp.format) that formats song information. Tag values can \
be put in curly brackets (i.e. {artist})"
LICENSE = "MIT"

PV = "2.1.5"

RPM_NAME = "bumblebee-status-module-mocp-2.1.5-4.7.noarch.rpm"
RPM_HASH = "b5951d4a07918c141283cdd485583a269aaf87c29afa6f3fdb399005761556ee18a3c13514eeaab10e9dd5cb7a5a9930e2fad7c0d29c3154320834fd3916159e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "bumblebee-status-module-mocp"

RDEPENDS:${PN} += "bumblebee-status \
moc"

inherit rpm
