SUMMARY = "Documentation for texlive-luatbls"
DESCRIPTION = "This package includes the documentation for texlive-luatbls"
LICENSE = "LPPL-1.0"

PV = "2026.226.svn73999"

RPM_NAME = "texlive-luatbls-doc-2026.226.svn73999-59.2.noarch.rpm"
RPM_HASH = "45571dcbafe861d40f88c91f3e0cf5b459b8654c78d90c93e56b19c8241668acdc3c5f31f14017605ec3fad81e6687781dfc8048f80ba38a1bc456bf5c911b88"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-luatbls-doc"

RDEPENDS:${PN} += ""

inherit rpm
