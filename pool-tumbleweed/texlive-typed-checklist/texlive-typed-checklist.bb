SUMMARY = "Typesetting tasks, goals, milestones, artifacts, and more in LaTeX"
DESCRIPTION = "The main goal of this package is to provide means for \
typesetting checklists in a way that stipulates users to \
explicitly distinguish checklists for goals, for tasks, for \
artifacts, and for milestones -- i.e., the type of checklist \
entries. The intention behind this is that a user of the \
package is coerced to think about what kind of entries he/she \
adds to the checklist. This shall yield a clearer result and, \
in the long run, help with training to distinguish entries of \
different types."
LICENSE = "LPPL-1.0"

PV = "2026.226.2.1svn77682"

RPM_NAME = "texlive-typed-checklist-2026.226.2.1svn77682-59.2.noarch.rpm"
RPM_HASH = "2a5727381b162766e549486d37973f3ac2a805491771ecb03f2a51caa57e15de43eb9b7bb8abf5052dfa7c25c6545d273a20cfb5e56c7e767dda0014a37705b7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-typed-checklist.sty \
texlive-typed-checklist"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-array.sty \
tex-asciilist.sty \
tex-bbding.sty \
tex-etoolbox.sty \
tex-marginnote.sty \
tex-tabularx.sty \
tex-xcolor.sty \
tex-xkeyval.sty \
tex-xltabular.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
