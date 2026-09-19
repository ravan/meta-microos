SUMMARY = "Documentation for texlive-ly1"
DESCRIPTION = "This package includes the documentation for texlive-ly1"
LICENSE = "LPPL-1.0"

PV = "2026.226.svn63565"

RPM_NAME = "texlive-ly1-doc-2026.226.svn63565-59.2.noarch.rpm"
RPM_HASH = "08aa40f9473beabc3937ed83026da401e2ee5464427bbbe76e28520995afe2064f1f161bfba63f1ae1ad689c90566e76a133433d076a5bd71e121f78fc2d75c7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-ly1-doc"

RDEPENDS:${PN} += ""

inherit rpm
