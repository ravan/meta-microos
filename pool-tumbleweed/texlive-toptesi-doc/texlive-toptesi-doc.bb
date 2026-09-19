SUMMARY = "Documentation for texlive-toptesi"
DESCRIPTION = "This package includes the documentation for texlive-toptesi"
LICENSE = "LPPL-1.0"

PV = "2026.226.6.4.07svn73464"

RPM_NAME = "texlive-toptesi-doc-2026.226.6.4.07svn73464-59.2.noarch.rpm"
RPM_HASH = "1bb23e382a1f1b296eb0c997cee0b8eb0423fa32a96e35a60813c75574fcca5360ba06ab73d72e79f91ba9f13ce71079ea7e784d342554ba088e43c58715e392"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-texlive-toptesi-doc-en;it \
texlive-toptesi-doc"

RDEPENDS:${PN} += ""

inherit rpm
