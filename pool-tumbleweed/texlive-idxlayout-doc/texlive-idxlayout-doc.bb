SUMMARY = "Documentation for texlive-idxlayout"
DESCRIPTION = "This package includes the documentation for texlive-idxlayout"
LICENSE = "LPPL-1.0"

PV = "2026.226.0.0.4dsvn25821"

RPM_NAME = "texlive-idxlayout-doc-2026.226.0.0.4dsvn25821-60.2.noarch.rpm"
RPM_HASH = "21faeca0d5a5fd2e260f2134adaaaf4ad225a32af577a92220f63e5207194bfcacd9d310fba422bdbf7e6f8a30e2acf0c5ec2e5b20bb1d488dc0e62a2085c381"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-texlive-idxlayout-doc-en \
texlive-idxlayout-doc"

RDEPENDS:${PN} += ""

inherit rpm
