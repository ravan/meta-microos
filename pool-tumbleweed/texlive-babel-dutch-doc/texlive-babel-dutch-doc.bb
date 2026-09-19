SUMMARY = "Documentation for texlive-babel-dutch"
DESCRIPTION = "This package includes the documentation for texlive-babel-dutch"
LICENSE = "LPPL-1.0"

PV = "2026.226.3.8lsvn77682"

RPM_NAME = "texlive-babel-dutch-doc-2026.226.3.8lsvn77682-60.2.noarch.rpm"
RPM_HASH = "215f01ffacfb7f523caf419208084b504a9ac726bb68bc08bef7a9a4e846ba90e9a3e4f4b78165b7ef7cbcf4df93b4614038e16eb9812e59e7fb81a5fcf1a6a5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-babel-dutch-doc"

RDEPENDS:${PN} += ""

inherit rpm
