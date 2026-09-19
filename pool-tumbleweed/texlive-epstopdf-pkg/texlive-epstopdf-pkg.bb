SUMMARY = "Call epstopdf 'on the fly'"
DESCRIPTION = "The package adds support for EPS files in the graphicx package \
when running under pdfTeX. If an EPS graphic is detected, the \
package spawns a process to convert the EPS to PDF, using the \
script epstopdf. This of course requires that shell escape is \
enabled for the pdfTeX run."
LICENSE = "LPPL-1.0"

PV = "2026.226.2.11svn77682"

RPM_NAME = "texlive-epstopdf-pkg-2026.226.2.11svn77682-61.4.noarch.rpm"
RPM_HASH = "5b302e72ce41ce4507ec63a4cdfa2b61e23a9c37c3b2c4c3651f3051cebe0a63181736d423b19b398ee6fb6860b9b0b156fc784cdc24f3aadb599a9b8d47d828"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-epstopdf-base.sty \
tex-epstopdf.sty \
texlive-epstopdf-pkg"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-grfext.sty \
tex-infwarerr.sty \
tex-kvoptions.sty \
tex-pdftexcmds.sty \
texlive \
texlive-epstopdf \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
