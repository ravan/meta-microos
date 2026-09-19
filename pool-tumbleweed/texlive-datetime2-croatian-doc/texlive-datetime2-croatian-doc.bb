SUMMARY = "Documentation for texlive-datetime2-croatian"
DESCRIPTION = "This package includes the documentation for texlive-datetime2-croatian"
LICENSE = "LPPL-1.0"

PV = "2026.226.1.0svn36682"

RPM_NAME = "texlive-datetime2-croatian-doc-2026.226.1.0svn36682-59.2.noarch.rpm"
RPM_HASH = "f179b184eb2f0e295f3773b90c14a6941f10ff5d2c1e8d58cc119f77b21e149583a4bad20143f8ccfbb85c6ee524a175df83ef86baad7c4c1e3fd66f8653cb7d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-datetime2-croatian-doc"

RDEPENDS:${PN} += ""

inherit rpm
