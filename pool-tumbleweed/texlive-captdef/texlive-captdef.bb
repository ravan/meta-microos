SUMMARY = "Declare free-standing \\caption commands"
DESCRIPTION = "The \\DeclareCaption command defines a class of caption command \
associated with the counter specified to the command. These \
commands are free-standing (i.e., don't need to be inside a \
float environment). The package uses \\DeclareCaption to define \
\\figcaption and \\tabcaption, which can be used outside figure \
or table environments."
LICENSE = "LPPL-1.0"

PV = "2026.226.svn77682"

RPM_NAME = "texlive-captdef-2026.226.svn77682-59.2.noarch.rpm"
RPM_HASH = "52631da2e6fb3e19c1019ef09fa62a21367d57221ea2e895bee6231c675aab32c64291e8fcef6591485fe74165d12d9fe63101b49e07b97c655dbb9e8132ffe4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-captdef.sty \
texlive-captdef"

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
