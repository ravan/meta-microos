SUMMARY = "Documentation for texlive-context-transliterator"
DESCRIPTION = "This package includes the documentation for texlive-context-transliterator"
LICENSE = "BSD-3-Clause"

PV = "2026.226.svn61127"

RPM_NAME = "texlive-context-transliterator-doc-2026.226.svn61127-61.2.noarch.rpm"
RPM_HASH = "f63b401e4b374bebba95b02e7f37b971812ef1e7bdb06506ee3efc34175e6103a60034929e310a1cd928e463ce4cd7872ca5ee0bb50d3de4583c15bbb53b9350"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-context-transliterator-doc"

RDEPENDS:${PN} += ""

inherit rpm
