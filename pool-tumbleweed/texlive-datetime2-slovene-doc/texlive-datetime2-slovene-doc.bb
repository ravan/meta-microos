SUMMARY = "Documentation for texlive-datetime2-slovene"
DESCRIPTION = "This package includes the documentation for texlive-datetime2-slovene"
LICENSE = "LPPL-1.0"

PV = "2026.226.1.1svn52282"

RPM_NAME = "texlive-datetime2-slovene-doc-2026.226.1.1svn52282-59.2.noarch.rpm"
RPM_HASH = "8a120593c7591087dd54ee5a69e458a783553340d5a4eb6166b40190192d7f7fd6efdb74e76da52849a091cb29e8246061f5614ba9f5db69924b17ac7deead87"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-datetime2-slovene-doc"

RDEPENDS:${PN} += ""

inherit rpm
