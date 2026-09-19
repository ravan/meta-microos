SUMMARY = "Information about register use"
DESCRIPTION = "The package will report number of used registers (counter, \
dimen, skip, muskip, box, token, input, output, math families, \
languages, insertions), and will compare the number to the \
maximum available number of such registers."
LICENSE = "LPPL-1.0"

PV = "2026.226.1.1bsvn78101"

RPM_NAME = "texlive-regstats-2026.226.1.1bsvn78101-60.4.noarch.rpm"
RPM_HASH = "23587abaeffda27af667a7692182a640a1f81c2d8a3524bbb95b4ea016880e29c34fd0501c6f8e2441ee88b9da9ade5b71d68b36729e46e420e45f105ec55f83"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-regstats.sty \
texlive-regstats"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-atveryend.sty \
tex-etex.sty \
tex-ifetex.sty \
tex-ifluatex.sty \
tex-ifpdf.sty \
tex-iftex.sty \
tex-intcalc.sty \
tex-kvoptions.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
