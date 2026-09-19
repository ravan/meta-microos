SUMMARY = "Documentation for texlive-datetime2-portuges"
DESCRIPTION = "This package includes the documentation for texlive-datetime2-portuges"
LICENSE = "LPPL-1.0"

PV = "2026.226.1.1svn48457"

RPM_NAME = "texlive-datetime2-portuges-doc-2026.226.1.1svn48457-59.2.noarch.rpm"
RPM_HASH = "0156b263f5820bfc6248cb7e5ca001c4d5344e6f7e17b638cf8d859145c26078153dc4b6eec26004ebf53f2ac8a379d2bfcc6a9531bbb2768ec479bb7fd1cf70"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-datetime2-portuges-doc"

RDEPENDS:${PN} += ""

inherit rpm
