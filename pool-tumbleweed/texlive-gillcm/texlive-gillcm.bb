SUMMARY = "Alternative unslanted italic Computer Modern fonts"
DESCRIPTION = "This is a demonstration of the use of virtual fonts for unusual \
effects: the package implements an old idea of Eric Gill. The \
package was written for the author's talk at TUG 2010."
LICENSE = "BSD-3-Clause"

PV = "2026.226.1.1svn19878"

RPM_NAME = "texlive-gillcm-2026.226.1.1svn19878-60.2.noarch.rpm"
RPM_HASH = "d2875dc05cc8f0750367a9c6d37f63bf108e67f75ef7b57fe12080629def40c95156c92cfaaaca706261338de4831481f427b7e4f384050d93e0e4338584263b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-cmg.map \
tex-cmgb8r.tfm \
tex-cmgbi7t.tfm \
tex-cmgbi7t.vf \
tex-cmgbi8c.tfm \
tex-cmgbi8c.vf \
tex-cmgbi8r.tfm \
tex-cmgbi8t.tfm \
tex-cmgbi8t.vf \
tex-cmgbiu7t.tfm \
tex-cmgbiu7t.vf \
tex-cmgbiu8c.tfm \
tex-cmgbiu8c.vf \
tex-cmgbiu8r.tfm \
tex-cmgbiu8t.tfm \
tex-cmgbiu8t.vf \
tex-cmgm8r.tfm \
tex-cmgmi7t.tfm \
tex-cmgmi7t.vf \
tex-cmgmi8c.tfm \
tex-cmgmi8c.vf \
tex-cmgmi8r.tfm \
tex-cmgmi8t.tfm \
tex-cmgmi8t.vf \
tex-cmgmiu7t.tfm \
tex-cmgmiu7t.vf \
tex-cmgmiu8c.tfm \
tex-cmgmiu8c.vf \
tex-cmgmiu8r.tfm \
tex-cmgmiu8t.tfm \
tex-cmgmiu8t.vf \
tex-gillcm.sty \
tex-ot1cmg.fd \
tex-t1cmg.fd \
tex-ts1cmg.fd \
texlive-gillcm"

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
