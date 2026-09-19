SUMMARY = "Documentation for texlive-automata"
DESCRIPTION = "This package includes the documentation for texlive-automata"
LICENSE = "LPPL-1.0"

PV = "2026.226.0.0.3svn19717"

RPM_NAME = "texlive-automata-doc-2026.226.0.0.3svn19717-60.2.noarch.rpm"
RPM_HASH = "1b134cefc05e0c34b6ba5787dbe3d6277b8b16622ec2917212144c020e77dce1cf3e5f3160b47f07a6b61850ef51ca0f82bb439147f9f759f2fcec513e48c3a6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-automata-doc"

RDEPENDS:${PN} += ""

inherit rpm
