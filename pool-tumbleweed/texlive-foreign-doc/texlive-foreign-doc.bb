SUMMARY = "Documentation for texlive-foreign"
DESCRIPTION = "This package includes the documentation for texlive-foreign"
LICENSE = "LPPL-1.0"

PV = "2026.226.2.7svn78101"

RPM_NAME = "texlive-foreign-doc-2026.226.2.7svn78101-60.2.noarch.rpm"
RPM_HASH = "b2aea125acf8a149af971b8ad135ca63b92b59283cc5644a3ad526a901d58baf424c394854dd71a1c7a6dac36fbc86286f5b580ee4409a8dd6d004e06d313f12"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-foreign-doc"

RDEPENDS:${PN} += ""

inherit rpm
