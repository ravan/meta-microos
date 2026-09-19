SUMMARY = "Documentation for texlive-adforn"
DESCRIPTION = "This package includes the documentation for texlive-adforn"
LICENSE = "LPPL-1.0"

PV = "2026.226.1.4svn78142"

RPM_NAME = "texlive-adforn-doc-2026.226.1.4svn78142-61.2.noarch.rpm"
RPM_HASH = "29a492e3ac88f5f5504edf02bc9b6560428aca2e035fa23911d3be41df1807c1b8a0fc1b262e089027e09043eca27b2cf6afd4b77f3a81d2bd09215ab8ac83ba"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-adforn-doc"

RDEPENDS:${PN} += ""

inherit rpm
