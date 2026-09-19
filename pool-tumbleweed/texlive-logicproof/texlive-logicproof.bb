SUMMARY = "Box proofs for propositional and predicate logic"
DESCRIPTION = "A common style of proof used in propositional and predicate \
logic is Fitch proofs, in which each line of the proof has a \
statement and a justification, and subproofs within a larger \
proof have boxes around them. The package provides environments \
for typesetting such proofs and boxes. It creates proofs in a \
style similar to that used in 'Logic in Computer Science' by \
Huth and Ryan."
LICENSE = "LPPL-1.0"

PV = "2026.226.svn33254"

RPM_NAME = "texlive-logicproof-2026.226.svn33254-61.2.noarch.rpm"
RPM_HASH = "6249e4230024782136a926b05f7039840a679f09b42d0692980ee0f68fae5c0feaef10a1f599f0338993402d1346e6cad1b106b8c0ea92feab94223f0d76140d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-logicproof.sty \
texlive-logicproof"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-array.sty \
tex-ifthen.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
