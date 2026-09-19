SUMMARY = "Documentation for texlive-luakeys"
DESCRIPTION = "This package includes the documentation for texlive-luakeys"
LICENSE = "LPPL-1.0"

PV = "2026.226.0.0.17.0svn78101"

RPM_NAME = "texlive-luakeys-doc-2026.226.0.0.17.0svn78101-59.2.noarch.rpm"
RPM_HASH = "9a8fa6eea0d39d493f1b94176d16cd592bb8ec2218cb8a237ebb8ae909edbbff77be54ad05990dc9dfae0b5f0494a9f9fd78042cd0408e30e32128c25686deab"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-luakeys-doc"

RDEPENDS:${PN} += ""

inherit rpm
