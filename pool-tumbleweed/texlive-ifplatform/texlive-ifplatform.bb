SUMMARY = "Conditionals to test which platform is being used"
DESCRIPTION = "This package uses the (La)TeX extension -shell-escape to \
establish whether the document is being processed on a Windows \
or on a Unix-like system (Mac OS X, Linux, etc.), or on Cygwin \
(Unix environment over a windows system). Booleans provided \
are: \\ifwindows, \\iflinux, \\ifmacosx and \\ifcygwin. The package \
also preserves the output of uname on a Unix-like system, which \
may be used to distinguish between various classes of Unix \
systems."
LICENSE = "LPPL-1.0"

PV = "2026.226.0.0.4asvn77682"

RPM_NAME = "texlive-ifplatform-2026.226.0.0.4asvn77682-60.2.noarch.rpm"
RPM_HASH = "6c14d44c5c9c38f901256b008828d8d6763b04016e0bbe9b1f1dfcd86e209eca422d07f3cf3dd12717e8a8d37dddda9c62f0d9a7ad2c4ad221b9bbd49975e0cc"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-ifplatform.sty \
texlive-ifplatform"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-catchfile.sty \
tex-ifluatex.sty \
tex-pdftexcmds.sty \
tex-shellesc.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
