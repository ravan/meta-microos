SUMMARY = "Documentation for texlive-exceltex"
DESCRIPTION = "This package includes the documentation for texlive-exceltex"
LICENSE = "GPL-2.0-or-later"

PV = "2026.226.0.0.5.1svn76924"

RPM_NAME = "texlive-exceltex-doc-2026.226.0.0.5.1svn76924-59.2.noarch.rpm"
RPM_HASH = "b21d9651b857057c91a6f400d031e5221fd5045d2b79ac117506adb144b5a2646b8a2c31fdc4a5d0553ed82bd24a78da907df5a72399e3c1a18c9dd6c01daf71"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-exceltex-doc"

RDEPENDS:${PN} += ""

inherit rpm
