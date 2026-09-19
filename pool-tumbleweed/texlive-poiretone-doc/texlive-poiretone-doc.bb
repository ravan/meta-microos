SUMMARY = "Documentation for texlive-poiretone"
DESCRIPTION = "This package includes the documentation for texlive-poiretone"
LICENSE = "OFL-1.1"

PV = "2026.226.svn64856"

RPM_NAME = "texlive-poiretone-doc-2026.226.svn64856-59.2.noarch.rpm"
RPM_HASH = "6c9e2d12dc57605024bdea102210dc35f8fdecbfbead401fad86b48502a6c3f0873dce4e57e5129be1b0a884b6e99fae5d76bb4cb8a2c9ea14c01ddc3bbd7d2a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-poiretone-doc"

RDEPENDS:${PN} += ""

inherit rpm
