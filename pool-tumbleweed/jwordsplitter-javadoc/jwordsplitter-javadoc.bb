SUMMARY = "Javadoc for jwordsplitter"
DESCRIPTION = "This package contains javadoc for jwordsplitter."
LICENSE = "Apache-2.0"

PV = "4.4"

RPM_NAME = "jwordsplitter-javadoc-4.4-4.6.noarch.rpm"
RPM_HASH = "a062f03179bb5034f1ad2614b2fb5a540e31f0f0aa1b5a5537fbaef390faf1c18875c48a17e9379e5408eefa0d85dda3f0174d02485322dd6b96cf13d57a0ad0"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "jwordsplitter-javadoc"

RDEPENDS:${PN} += "javapackages-filesystem"

inherit rpm
