SUMMARY = "A font inspired by Baskerville design"
DESCRIPTION = "Boisik is a serif font set (inspired by the Baskerville \
typeface), written in Metafont. The set comprises roman and \
italic text fonts and maths fonts. LaTeX support is offered for \
use with OT1, IL2 and OM* encodings."
LICENSE = "GPL-2.0-or-later"

PV = "2026.226.0.0.5svn15878"

RPM_NAME = "texlive-boisik-2026.226.0.0.5svn15878-59.2.noarch.rpm"
RPM_HASH = "f351c926457a15ce4d194d892d561a73b06550a078f3cbf54cabad127a7aa4dd7d9f932216a68d02fc1098fb4f66d104f0e3f60915cb8b7d9aedcb552e092260"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-boisik.sty \
tex-bskarr10.tfm \
tex-bskex10.tfm \
tex-bskhc10.tfm \
tex-bski10-TS1.tfm \
tex-bski10.tfm \
tex-bskib10.tfm \
tex-bskiol10.tfm \
tex-bskiu10.tfm \
tex-bskiub10.tfm \
tex-bskma10.tfm \
tex-bskmab10.tfm \
tex-bskmi10.tfm \
tex-bskmib10.tfm \
tex-bskms10.tfm \
tex-bskmsb10.tfm \
tex-bskmsbsl10.tfm \
tex-bskmssl10.tfm \
tex-bskr10-T1.tfm \
tex-bskr10-TS1.tfm \
tex-bskr10.tfm \
tex-bskrb10.tfm \
tex-bskrc10.tfm \
tex-bskrcb10.tfm \
tex-bskrf10.tfm \
tex-bskrl10.tfm \
tex-bskrol10.tfm \
tex-bskrsb10.tfm \
tex-bskrsl10.tfm \
tex-bskrw10.tfm \
tex-bsksc10.tfm \
tex-bsksy10.tfm \
tex-bsksyol10.tfm \
tex-bsksysl10.tfm \
tex-il2bsk.fd \
tex-il2bskf.fd \
tex-lblbskm.fd \
tex-lblcmr.fd \
tex-lblenc.def \
tex-lbmbsk.fd \
tex-lbmbskms.fd \
tex-lbmcmr.fd \
tex-lbmenc.def \
tex-lbsbsk.fd \
tex-lbsbsksy.fd \
tex-lbscmr.fd \
tex-lbsenc.def \
tex-ot1bsk.fd \
tex-ot1bskf.fd \
tex-ts1bsk.fd \
tex-ubskex.fd \
texlive-boisik"

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
