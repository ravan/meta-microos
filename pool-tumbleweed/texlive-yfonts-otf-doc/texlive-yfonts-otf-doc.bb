SUMMARY = "Documentation for texlive-yfonts-otf"
DESCRIPTION = "This package includes the documentation for texlive-yfonts-otf"
LICENSE = "OFL-1.1"

PV = "2026.226.0.0.61svn77682"

RPM_NAME = "texlive-yfonts-otf-doc-2026.226.0.0.61svn77682-59.4.noarch.rpm"
RPM_HASH = "a48a17918efb6693b2ced65924c609adaebf769cf67e943f8cfdcda696e5cffb3e1abe0fe34494bc92d133e2a2eb1913aef086aeac95b382fd14507d9f8a32d4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-yfonts-otf-doc"

RDEPENDS:${PN} += ""

inherit rpm
