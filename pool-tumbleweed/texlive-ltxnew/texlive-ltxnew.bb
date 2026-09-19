SUMMARY = "A simple means of creating commands"
DESCRIPTION = "The package ltxnew provides \\new, \\renew and \\provide prefixes \
for checking definitions. It is designed to work with e-TeX \
distributions of LaTeX and relies on the LaTeX internal macro \
\\@ifdefinable. Local allocation of counters, dimensions, skips, \
muskips, boxes, tokens and marks are provided by the etex \
package. \\new and \\renew as well as \\provide may be used for \
all kind of control sequences. Please refer to the section \
'Using \\new' of the PDF documentation."
LICENSE = "LPPL-1.0"

PV = "2026.226.1.3svn21586"

RPM_NAME = "texlive-ltxnew-2026.226.1.3svn21586-59.2.noarch.rpm"
RPM_HASH = "7ebe30603167aeebdcc940b4b3a00bd7f25f4bd5c5c1804a854e7f2324a74b7aadf182750f47857bc5e9f2373eff62399ee7dce8eb0b59e6f10645373c9eb341"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-ltxnew.sty \
texlive-ltxnew"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-etex.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
