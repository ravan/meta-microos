SUMMARY = "Context sensitive quotation facilities"
DESCRIPTION = "This package provides advanced facilities for inline and \
display quotations. It is designed for a wide range of tasks \
ranging from the most simple applications to the more complex \
demands of formal quotations. The facilities include commands, \
environments, and user-definable 'smart quotes' which \
dynamically adjust to their context. Quotation marks are \
switched automatically if quotations are nested and they can be \
adjusted to the current language if the babel package is \
available. There are additional facilities designed to cope \
with the more specific demands of academic writing, especially \
in the humanities and the social sciences. All quote styles as \
well as the optional active quotes are freely configurable. The \
package is dependent on e-TeX, and requires the author's \
etoolbox package."
LICENSE = "LPPL-1.0"

PV = "2026.226.5.2osvn77682"

RPM_NAME = "texlive-csquotes-2026.226.5.2osvn77682-61.2.noarch.rpm"
RPM_HASH = "b5c3d679358c3f371ace72d1d72960955e20f5c95d94e06ffa2b4ce3f9fe6646c5ee1eb42a895b329f86d3e42d98b75a16feb715ac48f859bdb576f769d77800"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-csq-compat.def \
tex-csquotes.cfg \
tex-csquotes.def \
tex-csquotes.sty \
texlive-csquotes"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-etoolbox.sty \
tex-inputenc.sty \
tex-keyval.sty \
texlive \
texlive-etoolbox \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
