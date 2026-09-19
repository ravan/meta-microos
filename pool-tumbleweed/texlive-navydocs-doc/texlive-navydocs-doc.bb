SUMMARY = "Documentation for texlive-navydocs"
DESCRIPTION = "This package includes the documentation for texlive-navydocs"
LICENSE = "LPPL-1.0"

PV = "2026.226.1.1svn76924"

RPM_NAME = "texlive-navydocs-doc-2026.226.1.1svn76924-61.2.noarch.rpm"
RPM_HASH = "adb21716f363d8ec87151cf0607d9d4d20bc72fd7bace5303f307facc460ad8de6c1631b1fdbd58ebdf99cd2342b9829a79948bb9eaa534aeaa0bc9fe0d059b9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-navydocs-doc"

RDEPENDS:${PN} += ""

inherit rpm
