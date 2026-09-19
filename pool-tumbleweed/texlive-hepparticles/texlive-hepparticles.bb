SUMMARY = "Macros for typesetting high energy physics particle names"
DESCRIPTION = "HEPparticles is a set of macros for typesetting high energy \
particle names, to meet the following criteria: 1. The main \
particle name is a Roman or Greek symbol, to be typeset in \
upright font in normal contexts. 2. Additionally a superscript \
and/or subscript may follow the main symbol. 3. Particle \
resonances may also have a resonance specifier which is typeset \
in parentheses following the main symbol. In general the \
parentheses may also be followed by sub- and superscripts. 4. \
The particle names are expected to be used both in and out of \
mathematical contexts. 5. If the surrounding text is bold or \
italic then the particle name should adapt to that context as \
best as possible (this may not be possible for Greek symbols). \
A consequence of point 5 is that the well-known problems with \
boldness of particle names in section titles, headers and \
tables of contents automatically disappear if these macros are \
used."
LICENSE = "LPPL-1.0"

PV = "2026.226.2.0svn35723"

RPM_NAME = "texlive-hepparticles-2026.226.2.0svn35723-60.4.noarch.rpm"
RPM_HASH = "0d394b0c22561f1c78894d8ef6f107b32330bb104b47392ee99ac1bd577e80cbeb8a4422e80eacaef62ef22d1882f5deac0cccfde07734d8c77e7aefbc8b8d31"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-hepparticles.sty \
texlive-hepparticles"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-amsmath.sty \
tex-subdepth.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
