SUMMARY = "Documentation for texlive-cochineal"
DESCRIPTION = "This package includes the documentation for texlive-cochineal"
LICENSE = "OFL-1.1"

PV = "2026.226.1.085svn77682"

RPM_NAME = "texlive-cochineal-doc-2026.226.1.085svn77682-60.2.noarch.rpm"
RPM_HASH = "5cef9c812a9a7530a50291225fa0f221fe5220da730f881615e344a2a1003a28ccf394f8091cd842214cfaf685bf01dbacfb984bc93dc6ad0cffdbc7631aab2d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-cochineal-doc"

RDEPENDS:${PN} += ""

inherit rpm
