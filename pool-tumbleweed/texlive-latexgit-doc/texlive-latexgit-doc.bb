SUMMARY = "Documentation for texlive-latexgit"
DESCRIPTION = "This package includes the documentation for texlive-latexgit"
LICENSE = "GPL-2.0-or-later"

PV = "2026.226.svn54811"

RPM_NAME = "texlive-latexgit-doc-2026.226.svn54811-61.2.noarch.rpm"
RPM_HASH = "1b52872c30e4e0c461933a75122d673cc77fa825c96e487238662737af0772a533055da2614c1053d58252055a8b84353691a2f79881aaa65ac511565a595b39"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-latexgit-doc"

RDEPENDS:${PN} += ""

inherit rpm
