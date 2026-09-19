SUMMARY = "Documentation for texlive-codebox"
DESCRIPTION = "This package includes the documentation for texlive-codebox"
LICENSE = "LPPL-1.0"

PV = "2026.226.1.0.4svn76924"

RPM_NAME = "texlive-codebox-doc-2026.226.1.0.4svn76924-60.2.noarch.rpm"
RPM_HASH = "06a19214a512538a0a3e60c1828e3b4bd469fa553049ccc65580c119af2cf750645a8a2f86fec4a5781ababfd3833f03c8eef3a068f6d47ed9ffa13d45de077b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-texlive-codebox-doc-zh \
texlive-codebox-doc"

RDEPENDS:${PN} += "/usr/bin/bash \
/usr/bin/python3.13"

inherit rpm
