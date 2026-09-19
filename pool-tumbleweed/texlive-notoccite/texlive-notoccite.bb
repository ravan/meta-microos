SUMMARY = "Prevent trouble from citations in table of contents, etcetera"
DESCRIPTION = "If you have \\cite commands in \\section-like commands, or in \
\\caption, the citation will also appear in the table of \
contents, or list of whatever. If you are also using an \
unsrt-like bibliography style, these citations will come at the \
very start of the bibliography, which is confusing. This \
package suppresses the effect."
LICENSE = "SUSE-Public-Domain"

PV = "2026.226.svn77682"

RPM_NAME = "texlive-notoccite-2026.226.svn77682-61.2.noarch.rpm"
RPM_HASH = "4186f7d96880ea255e788b6ef26ee839cecac976576bf268ad85b6b59226db455ce6ab8ae9fb454b49d21b118ff969c62cb153d49c9062274e767b17346d07cd"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-notoccite.sty \
texlive-notoccite"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
