SUMMARY = "Documentation for texlive-breqn"
DESCRIPTION = "This package includes the documentation for texlive-breqn"
LICENSE = "LPPL-1.0"

PV = "2026.226.0.0.98lsvn77682"

RPM_NAME = "texlive-breqn-doc-2026.226.0.0.98lsvn77682-59.2.noarch.rpm"
RPM_HASH = "79dd1cf0b5371a945d2d6af9faafdbf927621a5527e960e13e9a48b9991f6b38e989c83b94aa35fabe92db445a0289df005c0cced2c797fbd01011c3e41c5ed2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-breqn-doc"

RDEPENDS:${PN} += ""

inherit rpm
