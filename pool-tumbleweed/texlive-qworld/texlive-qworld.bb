SUMMARY = "Drawing string diagrams for monoidal categories and quantum theory in TeX"
DESCRIPTION = "This LaTeX package has been designed for the typesetting of \
graphical languages grounded in monoidal category theory and \
its extensions. It provides a declarative, LaTeX-native \
interface for rendering string diagrams, eliminating the need \
for any external graphics software or manual image management. \
The package supports a wide spectrum of categorical structures \
frequently encountered in categorical quantum mechanics, \
algebraic structures, and diagrammatic reasoning, including but \
not limited to: Monoidal and symmetric monoidal categories Dual \
objects and pivotal / rigid categories Dagger categories \
Frobenius algebras and Hopf algebras Braided, balanced, and \
ribbon categories Internally, QWorld builds upon the TikZ \
graphics framework, but introduces a domain-specific layer of \
abstraction that aligns diagram syntax closely with categorical \
semantics. This design facilitates accurate and transparent \
visual representations of morphisms, tensor products, and \
composition, thereby supporting both formal exposition and \
pedagogical use. QWorld is intended for researchers and \
educators working in categorical logic, quantum foundations, \
topological quantum field theory (TQFT), and related domains \
where graphical calculi constitute an essential mode of \
reasoning."
LICENSE = "LPPL-1.0"

PV = "2026.226.1.1.2svn75910"

RPM_NAME = "texlive-qworld-2026.226.1.1.2svn75910-60.4.noarch.rpm"
RPM_HASH = "94db1db7e401a9683396c2146e37bda0f80297dc58a9086d3caf4ae0efd977aca1cd8a18e84d2ee35b8b2a9df77d78f8705e437e1ab2e94a3f01e53c34023099"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-qworld.sty \
texlive-qworld"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-ifthen.sty \
tex-pgffor.sty \
tex-tikz.sty \
tex-xfp.sty \
tex-xparse.sty \
tex-xstring.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
