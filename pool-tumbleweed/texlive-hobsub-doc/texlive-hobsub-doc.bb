SUMMARY = "Documentation for texlive-hobsub"
DESCRIPTION = "This package includes the documentation for texlive-hobsub"
LICENSE = "LPPL-1.0"

PV = "2026.226.svn52810"

RPM_NAME = "texlive-hobsub-doc-2026.226.svn52810-60.4.noarch.rpm"
RPM_HASH = "88343da52d096d08f8defec6c5426b9324c79947f41a41f93d565c7a101260910677bbd9b1e7bab06422748173750cbb99e3955ec631a6da79b543080df6947e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-hobsub-doc"

RDEPENDS:${PN} += ""

inherit rpm
