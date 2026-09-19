SUMMARY = "Support for writing modular and customisable code"
DESCRIPTION = "The package provides the means of writing code in a modular \
fashion: big macros or functions are divided into small chunks \
(called gates) with names, which can be externally controlled \
(e.g. they can be disabled, subjected to conditionals, \
loops...) and/or augmented with new chunks. Thus complex code \
may easily be customised without having to rewrite it, or even \
understand its implementation: the behavior of existing gates \
can be modified, and new ones can be added, without endangering \
the whole design. This allows code to be hacked in ways the \
original authors might have never envisioned. The gates package \
is implemented independently for both TeX and Lua. The TeX \
implementation, running in any current environment, requires \
the texapi package, whereas the Lua version can be run with any \
Lua interpreter, not just LuaTeX."
LICENSE = "LPPL-1.0"

PV = "2026.226.0.0.2svn29803"

RPM_NAME = "texlive-gates-2026.226.0.0.2svn29803-60.2.noarch.rpm"
RPM_HASH = "161d946d9d38d9b807695f4da775b0997497a67042910c1556a27d3da68eb98346edf499c4f3b3f7149f05411662babb50dfbae573b1a114cb5b1392f8d9e6ca"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-gates.sty \
tex-gates.tex \
tex-t-gates.tex \
texlive-gates"

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
