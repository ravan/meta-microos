SUMMARY = "Strictly balanced brackets and numbers in command names"
DESCRIPTION = "This is a small, LuaLaTeX-only package providing you with \
three, sometimes useful features: It allows you to make \
brackets [...] 'strict', meaning that each [ must be balanced \
by a ]. It allows you to use numbers in command names, so that \
you can do stuff like \\newcommand\\pi12{\\pi_{12}}. It allows you \
to use numbers and primes in command names, so that you can do \
stuff like \\newcommand\\pi'12{\\pi '_{12}}."
LICENSE = "LPPL-1.0"

PV = "2026.226.0.0.2betasvn56320"

RPM_NAME = "texlive-stricttex-2026.226.0.0.2betasvn56320-64.2.noarch.rpm"
RPM_HASH = "59d7c7415fe48e9bc3970aa291f2ee66e6c47006d2782ac03ae548371f54b3cb7ee854d4f67aac9be56ca203558e12ebeb0993d546ad4d16da65b62b00b4c4fa"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-stricttex.sty \
texlive-stricttex"

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
