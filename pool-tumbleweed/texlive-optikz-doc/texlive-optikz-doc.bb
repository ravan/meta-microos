SUMMARY = "Documentation for texlive-optikz"
DESCRIPTION = "This package includes the documentation for texlive-optikz"
LICENSE = "LPPL-1.0"

PV = "2026.226.1.1.0svn77916"

RPM_NAME = "texlive-optikz-doc-2026.226.1.1.0svn77916-61.2.noarch.rpm"
RPM_HASH = "f251467bad42e30216c079538da3c244296e4bea075223c944242d11adfba068aaa6bef8529d60ca27fce6ec74cb722031e9de21989a6b215b4532cec5e1679d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-optikz-doc"

RDEPENDS:${PN} += ""

inherit rpm
