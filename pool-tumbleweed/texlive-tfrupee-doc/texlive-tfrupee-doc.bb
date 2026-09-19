SUMMARY = "Documentation for texlive-tfrupee"
DESCRIPTION = "This package includes the documentation for texlive-tfrupee"
LICENSE = "GPL-2.0-or-later"

PV = "2026.227.1.02svn20770"

RPM_NAME = "texlive-tfrupee-doc-2026.227.1.02svn20770-62.2.noarch.rpm"
RPM_HASH = "15985aac5842c75acbdb314fd80adcb098a70477dc1243a3f4723db86b7f8c852e639571f4552fc4713fb9e438aaaa0563dc5c430f53bf0c4d225cced731db36"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-tfrupee-doc"

RDEPENDS:${PN} += ""

inherit rpm
