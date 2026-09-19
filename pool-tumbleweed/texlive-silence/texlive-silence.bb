SUMMARY = "Selective filtering of error messages and warnings"
DESCRIPTION = "The package allows the user to filter out unwanted warnings and \
error messages issued by LaTeX, packages and classes, so they \
won't pop out when there's nothing one can do about them. \
Filtering goes from the very broad ('avoid all messages by such \
and such') to the fine-grained ('avoid messages that begin \
with...'). Messages may be saved to an external file for later \
reference."
LICENSE = "LPPL-1.0"

PV = "2026.226.1.5bsvn77682"

RPM_NAME = "texlive-silence-2026.226.1.5bsvn77682-60.2.noarch.rpm"
RPM_HASH = "a9ceba30acf80ec2a468978c0246aeff28a3d5e77eb50259c2283120481625b4080366c365babfd9e47f87a32bd2dcc9bfb826c0a14958b713b3b40be46e0232"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-silence.sty \
texlive-silence"

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
