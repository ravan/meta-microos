SUMMARY = "Documentation for texlive-sansmathaccent"
DESCRIPTION = "This package includes the documentation for texlive-sansmathaccent"
LICENSE = "LPPL-1.0"

PV = "2026.226.svn77682"

RPM_NAME = "texlive-sansmathaccent-doc-2026.226.svn77682-60.2.noarch.rpm"
RPM_HASH = "2f380abdf98f3034c0de47e81834ece1d0f2b3e2726cb2cd6c925282b20f7b64d27c6c4b843e2849d87adce3efbbeeada347e1ebeef7dff1b3a22a3453a41413"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-sansmathaccent-doc"

RDEPENDS:${PN} += ""

inherit rpm
