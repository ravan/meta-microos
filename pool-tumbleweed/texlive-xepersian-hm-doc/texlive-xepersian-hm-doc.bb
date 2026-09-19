SUMMARY = "Documentation for texlive-xepersian-hm"
DESCRIPTION = "This package includes the documentation for texlive-xepersian-hm"
LICENSE = "LPPL-1.0"

PV = "2026.226.1.1asvn77682"

RPM_NAME = "texlive-xepersian-hm-doc-2026.226.1.1asvn77682-59.4.noarch.rpm"
RPM_HASH = "ffbc211464e790dd5961d803c9f29f508e14f59c0352d4b15fcc5957350a628932ffb86a491e47a33105d9be24a5fad55b339799f93279a9da1eefec30e5b169"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-texlive-xepersian-hm-doc-fa \
texlive-xepersian-hm-doc"

RDEPENDS:${PN} += ""

inherit rpm
