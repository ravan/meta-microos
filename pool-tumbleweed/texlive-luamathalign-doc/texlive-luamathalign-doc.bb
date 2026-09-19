SUMMARY = "Documentation for texlive-luamathalign"
DESCRIPTION = "This package includes the documentation for texlive-luamathalign"
LICENSE = "LPPL-1.0"

PV = "2026.226.0.0.3svn77682"

RPM_NAME = "texlive-luamathalign-doc-2026.226.0.0.3svn77682-59.2.noarch.rpm"
RPM_HASH = "dcee353859bfca1f45b63d84eae74ef1101a594c053fa516ac952f6b0b82e231df35aa9ecbb1f65f9f3901870f3dafe66cfcd6acf7528cd268d58bcec6aa2116"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-luamathalign-doc"

RDEPENDS:${PN} += ""

inherit rpm
