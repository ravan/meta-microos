SUMMARY = "Documentation for texlive-dimnum"
DESCRIPTION = "This package includes the documentation for texlive-dimnum"
LICENSE = "LPPL-1.0"

PV = "2026.226.1.0.1svn58774"

RPM_NAME = "texlive-dimnum-doc-2026.226.1.0.1svn58774-59.2.noarch.rpm"
RPM_HASH = "312178c97a5f61a34253b849c6d419d2553134ef04ce1f6aec88f5f8a33e060650b53ef3dc4b7675790b97a0e10e817bea24057d83ecddf249bd0e63ed688977"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-dimnum-doc"

RDEPENDS:${PN} += ""

inherit rpm
