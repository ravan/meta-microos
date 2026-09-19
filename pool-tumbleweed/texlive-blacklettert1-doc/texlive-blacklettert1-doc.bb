SUMMARY = "Documentation for texlive-blacklettert1"
DESCRIPTION = "This package includes the documentation for texlive-blacklettert1"
LICENSE = "LPPL-1.0"

PV = "2026.226.svn15878"

RPM_NAME = "texlive-blacklettert1-doc-2026.226.svn15878-59.2.noarch.rpm"
RPM_HASH = "e8fb2c654733a70adddcb4e759bd7b0877034354f6a259d95ebf787db729857ee9ec9a631f99d7fe2978423503da2590c906a9738f6c3c3d951d8cf6378b1314"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-blacklettert1-doc"

RDEPENDS:${PN} += ""

inherit rpm
