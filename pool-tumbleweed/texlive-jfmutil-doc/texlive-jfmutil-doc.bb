SUMMARY = "Documentation for texlive-jfmutil"
DESCRIPTION = "This package includes the documentation for texlive-jfmutil"
LICENSE = "LPPL-1.0"

PV = "2026.226.1.3.3svn60987"

RPM_NAME = "texlive-jfmutil-doc-2026.226.1.3.3svn60987-63.2.noarch.rpm"
RPM_HASH = "9150f5a0e88b9936483b40f26fe8e19e4ae37361e60331f2036176f33279f0016db676380e684e49dd2da60668d0a7df3f7175e24b292bf861793d786be87eb7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-texlive-jfmutil-doc-ja \
texlive-jfmutil-doc"

RDEPENDS:${PN} += ""

inherit rpm
