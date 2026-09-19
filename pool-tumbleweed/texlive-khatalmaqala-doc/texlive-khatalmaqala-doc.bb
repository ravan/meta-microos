SUMMARY = "Documentation for texlive-khatalmaqala"
DESCRIPTION = "This package includes the documentation for texlive-khatalmaqala"
LICENSE = "OFL-1.1"

PV = "2026.226.1.0.2svn68280"

RPM_NAME = "texlive-khatalmaqala-doc-2026.226.1.0.2svn68280-63.2.noarch.rpm"
RPM_HASH = "2bc9a3175b6aef9ac6627679c7db3b2700bb697738f5dbfb93d6106ac7df956b3f4006bda6352c5101a86a966abe4b09819229886e96685c2576d16c85995d44"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-khatalmaqala-doc"

RDEPENDS:${PN} += ""

inherit rpm
