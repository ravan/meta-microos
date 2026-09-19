SUMMARY = "Documentation for texlive-ligtype"
DESCRIPTION = "This package includes the documentation for texlive-ligtype"
LICENSE = "LPPL-1.0"

PV = "2026.226.0.0.3svn67601"

RPM_NAME = "texlive-ligtype-doc-2026.226.0.0.3svn67601-61.2.noarch.rpm"
RPM_HASH = "04a25a02a97d904b0418cdba91f4aab2173ce039804e97691138bd154949a58989acfc4a9e7c00aa469f5f1eef5a511caa62215c96c45a7dc0c320f0b5778353"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-ligtype-doc"

RDEPENDS:${PN} += ""

inherit rpm
