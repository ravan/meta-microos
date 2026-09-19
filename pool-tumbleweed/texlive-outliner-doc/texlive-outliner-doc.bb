SUMMARY = "Documentation for texlive-outliner"
DESCRIPTION = "This package includes the documentation for texlive-outliner"
LICENSE = "GPL-2.0-or-later"

PV = "2026.226.0.0.94svn21095"

RPM_NAME = "texlive-outliner-doc-2026.226.0.0.94svn21095-61.2.noarch.rpm"
RPM_HASH = "d0a978a72a7ee37644518ca6bcc23520dc0b707eef1d5c26c4f20f9a13208060266ad6683249e02a76587d08abb7f90645852d75d585d80c1373276fada52402"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-outliner-doc"

RDEPENDS:${PN} += ""

inherit rpm
