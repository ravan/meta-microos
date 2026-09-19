SUMMARY = "Documentation for texlive-sansmathfonts"
DESCRIPTION = "This package includes the documentation for texlive-sansmathfonts"
LICENSE = "LPPL-1.0"

PV = "2026.226.svn77723"

RPM_NAME = "texlive-sansmathfonts-doc-2026.226.svn77723-60.2.noarch.rpm"
RPM_HASH = "fb87ace97bbcb3458f997281926920e3575e629742419afbb54cfa373daa4982a91d52828a951a73ff558a29c0daada2bfedcf5eb44a0c103c2bfbc42ede54f3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-sansmathfonts-doc"

RDEPENDS:${PN} += ""

inherit rpm
