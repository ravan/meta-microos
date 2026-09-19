SUMMARY = "Repeating text field substitution"
DESCRIPTION = "The package mailmerge provides an interface to produce text \
from a template, where fields are replaced by actual data, as \
in a database. The package may be used to produce several \
letters from a template, certificates or other such documents. \
It allows access to the entry number, number of entries and so \
on."
LICENSE = "LPPL-1.0"

PV = "2026.226.1.0svn15878"

RPM_NAME = "texlive-mailmerge-2026.226.1.0svn15878-59.2.noarch.rpm"
RPM_HASH = "db18b8b9989eb6ac86e61cb6eadca72e833c4b4ebbeaca4a9f97785cd36d12f1b6db588bb81c47e684bcf859eda920d3a5ee695e4d3c3749edc67c053c0a2e38"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-mailmerge.sty \
texlive-mailmerge"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-ifthen.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
