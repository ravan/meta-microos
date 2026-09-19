SUMMARY = "Documentation for texlive-grfpaste"
DESCRIPTION = "This package includes the documentation for texlive-grfpaste"
LICENSE = "LPPL-1.0"

PV = "2026.226.0.0.2svn17354"

RPM_NAME = "texlive-grfpaste-doc-2026.226.0.0.2svn17354-60.4.noarch.rpm"
RPM_HASH = "094e90ab9bd254388591c21cd04063db33b1650730d345d8b4f883066c82828d646a44ec82bb3ec48820e4209c219d4f0bba8f70d1b07d14d2fd6938b7472a66"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-grfpaste-doc"

RDEPENDS:${PN} += ""

inherit rpm
