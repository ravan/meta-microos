SUMMARY = "Documentation for texlive-adjustbox"
DESCRIPTION = "This package includes the documentation for texlive-adjustbox"
LICENSE = "LPPL-1.0"

PV = "2026.226.1.3csvn78101"

RPM_NAME = "texlive-adjustbox-doc-2026.226.1.3csvn78101-61.2.noarch.rpm"
RPM_HASH = "c5ae4764f9669a80620be18d881c38a55807b79b9031023d88e0ccae9efe00b4b013164f0733514dbb07333bce25a02f2ecaeb05fbfce0422766157e07e06181"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-adjustbox-doc"

RDEPENDS:${PN} += ""

inherit rpm
