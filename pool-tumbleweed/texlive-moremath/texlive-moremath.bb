SUMMARY = "Additional commands for typesetting maths"
DESCRIPTION = "This package provides several document level commands to ease \
typesetting of maths with LaTeX. This package provides \
complementary commands to all operators defined by amsmath \
which typeset the operators together with delimiters (which can \
be scaled manually, automatically or not at all). These \
commands also accept optional sub- and superscripts. \
Additionally, this package provides several commands to typeset \
gradient, divergence, curl, Laplace, and d'Alembert operators. \
Those commands also accept an optional subscript and their \
appearance can be modified using key-value options. Furthermore \
several commands for producing row and column vectors, as well \
as (anti-)diagonal matrices and identity matrices, utilizing \
mathtools' matrix* family of environments, are provided. Most \
of the document level commands defined by this package can also \
be disabled using a package load-time option to avoid clashes \
with commands defined by other packages. The package depends on \
mathtools, bm (optional), and amssymb."
LICENSE = "LPPL-1.0"

PV = "2026.226.0.0.5.0svn76924"

RPM_NAME = "texlive-moremath-2026.226.0.0.5.0svn76924-61.2.noarch.rpm"
RPM_HASH = "ee916b3a3edd30f9e6d8638f22b73106e77c896d62d696da67c251f797a11d835e45e03fe7dabb0a3a1af80be27d192cd0c5f52cc9c86753e699324e1dd72e99"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-moremath.sty \
texlive-moremath"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-amssymb.sty \
tex-bm.sty \
tex-mathtools.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
