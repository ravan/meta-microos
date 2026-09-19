SUMMARY = "Documentation for texlive-endnotes-hy"
DESCRIPTION = "This package includes the documentation for texlive-endnotes-hy"
LICENSE = "LPPL-1.0"

PV = "2026.226.svn54758"

RPM_NAME = "texlive-endnotes-hy-doc-2026.226.svn54758-61.4.noarch.rpm"
RPM_HASH = "e6525a577ad975ebe5e2e42b34a70248337b061b7add112a924623033edb41d0a402551e3f905d51d9693dfaae517ee159c5b43e9835ae0a8ac777509f816a66"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-endnotes-hy-doc"

RDEPENDS:${PN} += ""

inherit rpm
