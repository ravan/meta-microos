SUMMARY = "Use Latin Modern Typewriter fonts"
DESCRIPTION = "The package allows selection of Latin Modern Typewriter fonts \
with scaling and access to all its features."
LICENSE = "LPPL-1.0"

PV = "2026.226.1.032svn77682"

RPM_NAME = "texlive-zlmtt-2026.226.1.032svn77682-59.4.noarch.rpm"
RPM_HASH = "2c18449cefd2b5223dad78ca82958688f67d43aebf1dd3c7381151279afffac6456697544403fe61154096e9c6c4e45ad21874bd12645d9caff872f080c64df3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-il2zlmtt.fd \
tex-il2zlmvtt.fd \
tex-l7xzlmtt.fd \
tex-l7xzlmvtt.fd \
tex-ly1zlmtt.fd \
tex-ly1zlmvtt.fd \
tex-ot1zlmtt.fd \
tex-ot1zlmvtt.fd \
tex-ot4zlmtt.fd \
tex-ot4zlmvtt.fd \
tex-qxzlmtt.fd \
tex-qxzlmvtt.fd \
tex-t1zlmtt.fd \
tex-t1zlmvtt.fd \
tex-t5zlmtt.fd \
tex-t5zlmvtt.fd \
tex-ts1zlmtt.fd \
tex-ts1zlmvtt.fd \
tex-zlmtt.sty \
texlive-zlmtt"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-mweights.sty \
tex-xkeyval.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
