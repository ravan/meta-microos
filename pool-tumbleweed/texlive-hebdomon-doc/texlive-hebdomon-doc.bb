SUMMARY = "Documentation for texlive-hebdomon"
DESCRIPTION = "This package includes the documentation for texlive-hebdomon"
LICENSE = "LPPL-1.0"

PV = "2026.226.0.0.1svn72033"

RPM_NAME = "texlive-hebdomon-doc-2026.226.0.0.1svn72033-60.4.noarch.rpm"
RPM_HASH = "6dfbeb58091ee3911e4b6bf50e067184edb82fd25f7da8fa2c8a7153a1b9e8cbe972c62c3f53ee6cddb5a1f120ebdeee557ae1fd0c0fa515518c2a3fd7d6cdda"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-hebdomon-doc"

RDEPENDS:${PN} += ""

inherit rpm
