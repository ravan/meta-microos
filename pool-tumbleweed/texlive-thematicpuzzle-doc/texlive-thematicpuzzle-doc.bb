SUMMARY = "Documentation for texlive-thematicpuzzle"
DESCRIPTION = "This package includes the documentation for texlive-thematicpuzzle"
LICENSE = "LPPL-1.0"

PV = "2026.227.0.0.1.3svn75984"

RPM_NAME = "texlive-thematicpuzzle-doc-2026.227.0.0.1.3svn75984-62.2.noarch.rpm"
RPM_HASH = "23c47e506128e542d454624e56747fae9213acba340d7e49a2264b30c7e7dac57bb73648957e491ae57bb17997720f65ee32080da152a441f465aedff7e1d483"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-texlive-thematicpuzzle-doc-en;fr \
texlive-thematicpuzzle-doc"

RDEPENDS:${PN} += ""

inherit rpm
