SUMMARY = "Documentation for texlive-encxvlna"
DESCRIPTION = "This package includes the documentation for texlive-encxvlna"
LICENSE = "LPPL-1.0"

PV = "2026.226.1.1svn34087"

RPM_NAME = "texlive-encxvlna-doc-2026.226.1.1svn34087-61.4.noarch.rpm"
RPM_HASH = "02a0d14c112835e70a19733120de3c92965e0cdf388db5479258d2de32a5ee5c37e1529c4b1260dab8d06bffa450bd55bfb8e15bdac19c4a7070d9caf536652b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-encxvlna-doc"

RDEPENDS:${PN} += ""

inherit rpm
