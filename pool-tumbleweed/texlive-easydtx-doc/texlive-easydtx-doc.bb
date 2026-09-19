SUMMARY = "Documentation for texlive-easydtx"
DESCRIPTION = "This package includes the documentation for texlive-easydtx"
LICENSE = "GPL-2.0-or-later"

PV = "2026.226.0.0.2.0svn72952"

RPM_NAME = "texlive-easydtx-doc-2026.226.0.0.2.0svn72952-61.4.noarch.rpm"
RPM_HASH = "600a24518ff094a841b89ba957e80b0d886572d79e9be93ae9ad359eeabf4a442b9feaf68c11ae4352d9ba43dafa4ecc20546e9f2e623b004a2b2b3f66a6efe8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "man-edtx2dtx.1 \
texlive-easydtx-doc"

RDEPENDS:${PN} += ""

inherit rpm
