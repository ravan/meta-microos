SUMMARY = "Documentation for texlive-courierten"
DESCRIPTION = "This package includes the documentation for texlive-courierten"
LICENSE = "LPPL-1.0"

PV = "2026.226.svn77682"

RPM_NAME = "texlive-courierten-doc-2026.226.svn77682-61.2.noarch.rpm"
RPM_HASH = "cb4dff7a9a844dec113b0182063d856b670b84f728f8dcd2674479b30f6274d76521bc05ffc46d28056fd87b593aeaea6361c6f63b8e93e3bab70eb97e00d5ee"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-courierten-doc"

RDEPENDS:${PN} += ""

inherit rpm
