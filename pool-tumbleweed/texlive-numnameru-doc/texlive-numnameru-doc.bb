SUMMARY = "Documentation for texlive-numnameru"
DESCRIPTION = "This package includes the documentation for texlive-numnameru"
LICENSE = "LPPL-1.0"

PV = "2026.226.svn44895"

RPM_NAME = "texlive-numnameru-doc-2026.226.svn44895-61.2.noarch.rpm"
RPM_HASH = "b440d2820e47148c42e945798bc4a1a1babbc7ceaacdb8f4402d4a836c0638401137f1c5ba5de4bb24905d14bef77354f69305b6bf3d876c572d74acac1fd979"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-numnameru-doc"

RDEPENDS:${PN} += ""

inherit rpm
