SUMMARY = "Babel support for English"
DESCRIPTION = "The package provides the language definition file for support \
of English in babel. Care is taken to select british \
hyphenation patterns for British English and Australian text, \
and default ('american') patterns for Canadian and USA text."
LICENSE = "LPPL-1.0"

PV = "2026.226.3.3rsvn77682"

RPM_NAME = "texlive-babel-english-2026.226.3.3rsvn77682-60.2.noarch.rpm"
RPM_HASH = "ae9f39fb7367d6f74d7101b241b6d4bd57cf6eec94da32e0e6524fa2e3d59622bfa093f09f66f360597646297e05dfa0bc4d6f35cb7793d8c59c7f7cbcdc72e8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-UKenglish.ldf \
tex-USenglish.ldf \
tex-american.ldf \
tex-australian.ldf \
tex-british.ldf \
tex-canadian.ldf \
tex-english.ldf \
tex-newzealand.ldf \
texlive-babel-english"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
texlive \
texlive-filesystem \
texlive-hyphen-english \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
