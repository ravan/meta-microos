SUMMARY = "Documentation for texlive-datetime2-irish"
DESCRIPTION = "This package includes the documentation for texlive-datetime2-irish"
LICENSE = "LPPL-1.0"

PV = "2026.226.1.1svn47632"

RPM_NAME = "texlive-datetime2-irish-doc-2026.226.1.1svn47632-59.2.noarch.rpm"
RPM_HASH = "4eb69ddb74586b23e42e3857d3cb36340d8b2b41cba216a400f1ef0321d81d08564c040e34d8b82e1f717154ce717c9de9c9ed15b9a4da8186f483b5cdf1b651"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-datetime2-irish-doc"

RDEPENDS:${PN} += ""

inherit rpm
