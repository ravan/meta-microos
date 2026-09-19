SUMMARY = "Documentation for texlive-dinbrief"
DESCRIPTION = "This package includes the documentation for texlive-dinbrief"
LICENSE = "LPPL-1.0"

PV = "2026.226.svn15878"

RPM_NAME = "texlive-dinbrief-doc-2026.226.svn15878-59.2.noarch.rpm"
RPM_HASH = "936909d099bd8739909d515ed3700be542843a6f53b374c21ddf9bcb5a4c4236e9f1f134b1cc7d02c2978098801033c219a62e8fa20bee2584a9a965215c3b9f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-texlive-dinbrief-doc-de;en \
texlive-dinbrief-doc"

RDEPENDS:${PN} += ""

inherit rpm
