SUMMARY = "Documentation for texlive-tikz-bbox"
DESCRIPTION = "This package includes the documentation for texlive-tikz-bbox"
LICENSE = "LPPL-1.0"

PV = "2026.227.0.0.1svn57444"

RPM_NAME = "texlive-tikz-bbox-doc-2026.227.0.0.1svn57444-62.2.noarch.rpm"
RPM_HASH = "bb2b0d56038ae9c7cb8ad118f2fd21e8dc2c7e7f6af1fe4c1b58835095aec8f5271d8019c1755ea9771739585f0399a65cfe2f712e48b6a2cfa205e43301857b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-tikz-bbox-doc"

RDEPENDS:${PN} += ""

inherit rpm
