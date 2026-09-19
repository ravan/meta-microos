SUMMARY = "Documentation for texlive-blox"
DESCRIPTION = "This package includes the documentation for texlive-blox"
LICENSE = "LPPL-1.0"

PV = "2026.226.2.51svn57949"

RPM_NAME = "texlive-blox-doc-2026.226.2.51svn57949-59.2.noarch.rpm"
RPM_HASH = "00403ea17c61ff943e0cd7c7c9cd1ef3d708978cf9ef20ab9c953aa56fd6a99234dfea81aa02c420d102ddee66367f703910c74fc005beee68efec05b6dbd1e6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-blox-doc"

RDEPENDS:${PN} += ""

inherit rpm
