SUMMARY = "Randomized exams with multiple versions"
DESCRIPTION = "The 'examz' document class builds on the 'exam' document class \
that was developed by Philip S. Hirschhorn. An author may use \
the class exactly as the 'exam' class, but there are also \
additional features. The document class facilitates the writing \
of questions with random elements, the creation of multiple \
versions of an exam, and the use of separate files as question \
banks."
LICENSE = "LPPL-1.0"

PV = "2026.226.1.0.0svn67303"

RPM_NAME = "texlive-examz-2026.226.1.0.0svn67303-59.2.noarch.rpm"
RPM_HASH = "14ea6194f64c13439513c2467f539a3794b9dcf968536e1db30cf044560eb16cd8c9e550c778d5b6c3e200197a50b11d78c62d0bb59a2815a12da5e3239667c1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-examz.cls \
texlive-examz"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-counterz.sty \
tex-environ.sty \
tex-exam.cls \
tex-xpatch.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
