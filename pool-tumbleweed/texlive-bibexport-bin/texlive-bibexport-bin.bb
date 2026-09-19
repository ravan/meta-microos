SUMMARY = "Binary files of bibexport"
DESCRIPTION = "Binary files of bibexport"
LICENSE = "LPPL-1.0"

PV = "2026.20260301.svn16219"

RPM_NAME = "texlive-bibexport-bin-2026.20260301.svn16219-120.4.aarch64.rpm"
RPM_HASH = "2d62f5f8d6ae24e841731244b13f3cd77eb98a37c480bdc14f01a4f236246540ff9c37d70f966068ca24468885afe2d998272b08cc0e0e6e6626336e4f1c9b12"

RPROVIDES:${PN} += "texlive-bibexport-bin"

RDEPENDS:${PN} += "texlive-bibexport"

inherit rpm
