SUMMARY = "Documentation for texlive-nstc-proposal"
DESCRIPTION = "This package includes the documentation for texlive-nstc-proposal"
LICENSE = "LPPL-1.0"

PV = "2026.226.1.0svn72795"

RPM_NAME = "texlive-nstc-proposal-doc-2026.226.1.0svn72795-61.2.noarch.rpm"
RPM_HASH = "eb184e4e77f225b611b13a80d904e9dcd66648a23136d6816efeba0aa3f39bc837fe58d4c839721defe99c304f483b8b43131f38a5bae3b74a96740287fe2db2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-texlive-nstc-proposal-doc-zh-tw \
texlive-nstc-proposal-doc"

RDEPENDS:${PN} += ""

inherit rpm
