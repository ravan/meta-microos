SUMMARY = "Interactive use of \\includeonly"
DESCRIPTION = "The package asks the user which files to put in a \\includeonly \
command. There is provision for answering 'same as last time' \
or 'all files'."
LICENSE = "LPPL-1.0"

PV = "2026.226.2.7svn77682"

RPM_NAME = "texlive-askinclude-2026.226.2.7svn77682-60.2.noarch.rpm"
RPM_HASH = "07c0df93c60d86f16e471683eb292b531fe7920907dbdaf45f273448eb592e96950c92666fd73b58f420ca4a66019e787349456788d0ef6c038834a37ec55956"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-askinclude.sty \
texlive-askinclude"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-kvsetkeys.sty \
tex-makematch.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
