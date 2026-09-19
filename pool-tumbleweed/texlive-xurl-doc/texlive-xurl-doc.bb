SUMMARY = "Documentation for texlive-xurl"
DESCRIPTION = "This package includes the documentation for texlive-xurl"
LICENSE = "LPPL-1.0"

PV = "2026.226.0.0.10svn77682"

RPM_NAME = "texlive-xurl-doc-2026.226.0.0.10svn77682-59.4.noarch.rpm"
RPM_HASH = "f5b6caf05772028fb7eb8f50fad7e4960b03d38a03f5f83a20204bf9a6e38d196bbef1b845891f6a5b113007252150cf6651a756221fb005761c78a3269c8910"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-xurl-doc"

RDEPENDS:${PN} += ""

inherit rpm
