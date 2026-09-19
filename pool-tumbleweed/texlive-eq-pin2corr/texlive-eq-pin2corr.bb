SUMMARY = "Add PIN security to the 'Correct' button of a quiz created by exerquiz"
DESCRIPTION = "This package is an add-on to the quiz environment of the \
exerquiz package (part of the acrotex bundle). It adds PIN \
security to a quiz created by the quiz environment. To correct \
a quiz, the document consumer must press the 'Correct' button \
of the quiz and successfully enter the correct PIN number. The \
PIN security is designed for the instructor to mark and record \
the student's effort on that quiz. The package works for the \
usual workflows."
LICENSE = "LPPL-1.0"

PV = "2026.226.svn59477"

RPM_NAME = "texlive-eq-pin2corr-2026.226.svn59477-61.4.noarch.rpm"
RPM_HASH = "cb78c21a993794a2b2fef746c48661a3ef188dc3e6866284a101adcba32097b7bb9a80f19b041b60616863b3903504ff154140f2af1618ff82b12c2d4fa6e805"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-eq-pin2corr.sty \
texlive-eq-pin2corr"

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
