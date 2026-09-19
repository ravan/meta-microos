SUMMARY = "Documentation for texlive-ctanupload"
DESCRIPTION = "This package includes the documentation for texlive-ctanupload"
LICENSE = "GPL-2.0-or-later"

PV = "2026.226.1.2csvn26313"

RPM_NAME = "texlive-ctanupload-doc-2026.226.1.2csvn26313-61.2.noarch.rpm"
RPM_HASH = "74dac57c6882231f12b2a7f110c1198e7804d953621c0edf7a4197af95400a1105187b77abe27dd3423ccaf9d5b3db32200feb4128e44db02712c0209f1359c0"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-ctanupload-doc"

RDEPENDS:${PN} += ""

inherit rpm
