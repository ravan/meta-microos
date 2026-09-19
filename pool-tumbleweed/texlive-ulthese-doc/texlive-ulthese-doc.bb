SUMMARY = "Documentation for texlive-ulthese"
DESCRIPTION = "This package includes the documentation for texlive-ulthese"
LICENSE = "LPPL-1.0"

PV = "2026.226.7.0svn77089"

RPM_NAME = "texlive-ulthese-doc-2026.226.7.0svn77089-60.2.noarch.rpm"
RPM_HASH = "cfe72e2ef2763cb421532a7e1f2ac72e40f840316d71c435650d50cb8266daa3cc27380d91fc11240270f5d3b4fc1df5524a289479ff38e0b36a66b3fc92088a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-texlive-ulthese-doc-fr \
texlive-ulthese-doc"

RDEPENDS:${PN} += ""

inherit rpm
