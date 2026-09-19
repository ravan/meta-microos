SUMMARY = "Extract solutions from exercises and quizzes"
DESCRIPTION = "This package is designed to mark a solution environment of an \
exercise or quiz and insert it into the same or a different \
document. Solutions are ones created by either the exerquiz or \
eqexam package. All PDF creators are supported."
LICENSE = "LPPL-1.0"

PV = "2026.226.0.0.6svn49651"

RPM_NAME = "texlive-mi-solns-2026.226.0.0.6svn49651-61.2.noarch.rpm"
RPM_HASH = "928adb5920ecf86af3bc823e693ba94baec18bb557964e42b1fd0ccc454fa7f01d0815c6e6b754e4f23a402f38116751dbc45f27902c11116dd325869a4472fb"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-mi-solns.sty \
texlive-mi-solns"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-shellesc.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
