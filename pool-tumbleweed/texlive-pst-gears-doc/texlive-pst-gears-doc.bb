SUMMARY = "Documentation for texlive-pst-gears"
DESCRIPTION = "This package includes the documentation for texlive-pst-gears"
LICENSE = "LPPL-1.0"

PV = "2026.226.0.0.61svn77113"

RPM_NAME = "texlive-pst-gears-doc-2026.226.0.0.61svn77113-59.2.noarch.rpm"
RPM_HASH = "f9149b9a3864db85e95e269f403eda7375e55b90c765d0b0547a59e626f735521be842aadc8e69023abdd1af7787f3bfc74a2c42b70b09bbd5194045c26bac3b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-pst-gears-doc"

RDEPENDS:${PN} += ""

inherit rpm
