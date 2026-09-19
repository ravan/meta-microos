SUMMARY = "Donald Knuth's punk font"
DESCRIPTION = "A response to the assertion in a lecture that 'typography tends \
to lag behind other stylistic changes by about 10 years'. Knuth \
felt it was (in 1988) time to design a replacement for his \
designs of the 1970s, and came up with this font! The fonts are \
distributed as Metafont source. The package offers LaTeX \
support by Rohit Grover, from an original by Sebastian Rahtz, \
which is slightly odd in claiming that the fonts are \
T1-encoded. A (possibly) more rational support package is to be \
found in punk-latex"
LICENSE = "SUSE-TeX"

PV = "2026.226.svn27388"

RPM_NAME = "texlive-punk-2026.226.svn27388-60.4.noarch.rpm"
RPM_HASH = "4c78f9d2575ac65af27a9fe49bf9af358caaab89c09c90d6eca5b5a5cce07d27249669a91ab96df7eb18b6661f84d36903a2558103c737cd43a5be956b660e2c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-punk10.tfm \
tex-punk12.tfm \
tex-punk20.tfm \
tex-punkbx20.tfm \
tex-punksl20.tfm \
texlive-punk"

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
