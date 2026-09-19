SUMMARY = "Chinese font metrics for upTeX"
DESCRIPTION = "The package contains some Chinese font metrics (JFM, VF, etc) \
for upTeX engine, together with a simple DVIPDFMx font mapping \
of Fandol fonts for DVIPDFMx."
LICENSE = "LPPL-1.0"

PV = "2026.226.1.0svn40728"

RPM_NAME = "texlive-zhmetrics-uptex-2026.226.1.0svn40728-59.4.noarch.rpm"
RPM_HASH = "b79799748e327d2485972e9b282f62de7de2e6564090d6d02a7c35cafda8d59b3c9ffb5de5694f6e54031ef5dfbaf3fdb9bf21bb95c850e5be7d0368e938205f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-upmono-h.tfm \
tex-upmono-v.tfm \
tex-upsans-h.tfm \
tex-upsans-v.tfm \
tex-upsansb-h.tfm \
tex-upsansb-v.tfm \
tex-upserif-h.tfm \
tex-upserif-v.tfm \
tex-upserifb-h.tfm \
tex-upserifb-v.tfm \
tex-upserifit-h.tfm \
tex-upserifit-v.tfm \
tex-upzhmono-h.tfm \
tex-upzhmono-h.vf \
tex-upzhmono-v.tfm \
tex-upzhmono-v.vf \
tex-upzhsans-h.tfm \
tex-upzhsans-h.vf \
tex-upzhsans-v.tfm \
tex-upzhsans-v.vf \
tex-upzhsansb-h.tfm \
tex-upzhsansb-h.vf \
tex-upzhsansb-v.tfm \
tex-upzhsansb-v.vf \
tex-upzhserif-h.tfm \
tex-upzhserif-h.vf \
tex-upzhserif-v.tfm \
tex-upzhserif-v.vf \
tex-upzhserifb-h.tfm \
tex-upzhserifb-h.vf \
tex-upzhserifb-v.tfm \
tex-upzhserifb-v.vf \
tex-upzhserifit-h.tfm \
tex-upzhserifit-h.vf \
tex-upzhserifit-v.tfm \
tex-upzhserifit-v.vf \
texlive-zhmetrics-uptex"

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
