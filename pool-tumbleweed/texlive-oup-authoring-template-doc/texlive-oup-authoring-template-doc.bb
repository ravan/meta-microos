SUMMARY = "Documentation for texlive-oup-authoring-template"
DESCRIPTION = "This package includes the documentation for texlive-oup-authoring-template"
LICENSE = "LPPL-1.0"

PV = "2026.226.1.2svn78219"

RPM_NAME = "texlive-oup-authoring-template-doc-2026.226.1.2svn78219-61.2.noarch.rpm"
RPM_HASH = "3481ce441f4728b4083cfed54c01345b2705471680b7867bf3c61d9fa265efc2c5f3a2e34c0171bd99f233dd251d104a66f1fce00896fefa58a7ec9918e19b8c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-oup-authoring-template-doc"

RDEPENDS:${PN} += ""

inherit rpm
