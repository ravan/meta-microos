SUMMARY = "Documentation for texlive-leporello"
DESCRIPTION = "This package includes the documentation for texlive-leporello"
LICENSE = "LPPL-1.0"

PV = "2026.226.1.0.3svn76924"

RPM_NAME = "texlive-leporello-doc-2026.226.1.0.3svn76924-61.2.noarch.rpm"
RPM_HASH = "c2867fc0ced245bcfb88fcd4d527a7933f70dc59058ee84da50d72e75a33cbc55d241120cfb4d92a1bfb607ea6ccc48bcc90e829e60c25ae927d583b04c2107a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-leporello-doc"

RDEPENDS:${PN} += ""

inherit rpm
