SUMMARY = "Font actions in XeTeX according to what is being processed"
DESCRIPTION = "The package takes care of switching fonts when you switch from \
one Unicode block to another in the text of a document. This \
way, you can write a document with no explicit font selection, \
but a series of rules of the form 'when entering block ..., \
switch font to use ...'."
LICENSE = "SUSE-Public-Domain"

PV = "2026.226.2.6svn77682"

RPM_NAME = "texlive-ucharclasses-2026.226.2.6svn77682-60.2.noarch.rpm"
RPM_HASH = "db747dafe0a2d729ef4c5b26c459ddb6df2892dce97408a4bf5989da42c92706f1fe1dac609611b65c7da300afb7ecef20f305a78cd976d1a3a7c58ee1401dc8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-ucharclasses.sty \
texlive-ucharclasses"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-ifxetex.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
