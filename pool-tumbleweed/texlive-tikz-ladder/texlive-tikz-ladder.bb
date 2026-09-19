SUMMARY = "Draw ladder diagrams using TikZ"
DESCRIPTION = "The tikz-ladder package contains a collection of symbols for \
typesetting ladder diagrams (PLC program) in agreement with the \
international standard IEC-61131-3/2013. It includes blocks \
(for representing functions and function blocks) besides \
contacts and coils. It extends the circuit library of TikZ and \
allows you to draw a ladder diagram in the same way as you \
would draw any other circuit."
LICENSE = "LPPL-1.0"

PV = "2026.226.1.3svn62992"

RPM_NAME = "texlive-tikz-ladder-2026.226.1.3svn62992-59.2.noarch.rpm"
RPM_HASH = "71ba38ed5d1c6a89d52f82210da255659667cb8155d22fe1ec00fc472cefdf8f8da29c2a97e50e92e67e2aa4f432d795c68e0bfbf796646898c0ee0d2edc3dd5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-tikzlibrarycircuits.plc.ladder.code.tex \
texlive-tikz-ladder"

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
