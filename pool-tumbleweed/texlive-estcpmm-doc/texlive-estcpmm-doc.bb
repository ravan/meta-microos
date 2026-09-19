SUMMARY = "Documentation for texlive-estcpmm"
DESCRIPTION = "This package includes the documentation for texlive-estcpmm"
LICENSE = "LPPL-1.0"

PV = "2026.226.0.0.4svn17335"

RPM_NAME = "texlive-estcpmm-doc-2026.226.0.0.4svn17335-59.2.noarch.rpm"
RPM_HASH = "5ddbb2c417f6a59c629f7d131bb2ebb0ed0310ad1fe272f3f6aac93cd39ff7d8925cf11820ba6eb73dd25c92217bc91c40cd58d909d3af4dd54790b35c1c9909"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-estcpmm-doc"

RDEPENDS:${PN} += ""

inherit rpm
