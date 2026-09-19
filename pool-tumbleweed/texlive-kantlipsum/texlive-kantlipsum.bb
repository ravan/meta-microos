SUMMARY = "Generate sentences in Kant's style"
DESCRIPTION = "The package spits out sentences in Kantian style; the text is \
provided by the Kant generator for Python by Mark Pilgrim, \
described in the book 'Dive into Python'. The package is \
modelled on lipsum, and may be used for similar purposes."
LICENSE = "LPPL-1.0"

PV = "2026.226.0.0.8csvn77682"

RPM_NAME = "texlive-kantlipsum-2026.226.0.0.8csvn77682-63.2.noarch.rpm"
RPM_HASH = "4b9d369cf6037f327128d5a6f91ae3832d847c56db70608fdf13d6e746ac8a0d7fd659cb6cc3c716fc8d70b9b6fdfadba8c5856f1df97692be1115e20b85b194"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-kantlipsum.sty \
texlive-kantlipsum"

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
