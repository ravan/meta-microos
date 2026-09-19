SUMMARY = "Typeset anonymous versions for ACM articles"
DESCRIPTION = "Academics often need to submit anonymous versions of their \
papers for peer-review. This often requires anonymization which \
at some future date needs to be reversed. However \
de-anonymizing an anonymized paper can be laborious and \
error-prone. This LaTeX package allows anonymization options to \
be specified at the time of writing for authors using \
acmart.cls, the official Association of Computing Machinery \
(ACM) master article template. Anonymization or deanonymization \
is carried out by simply changing one option and recompiling."
LICENSE = "LPPL-1.0"

PV = "2026.226.1.0svn55121"

RPM_NAME = "texlive-anonymous-acm-2026.226.1.0svn55121-61.2.noarch.rpm"
RPM_HASH = "3fa629c6b693c8bc6bb1005d695e0955724b58eb9c1c3c9ad848ff83d87fc1cd1eb0975657b81d6eacb0d896a2c2234960945ae483ecb7514966a70f483daa32"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-anonymous-acm.sty \
texlive-anonymous-acm"

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
