SUMMARY = "Create lists of random numbers"
DESCRIPTION = "This package can create lists of random numbers for any given \
interval [a;b]. It is possible to get lists with or without \
multiple numbers. The random generator will be initialized by \
the system time. The package can only be used with LuaLaTeX!"
LICENSE = "LPPL-1.0"

PV = "2026.226.0.0.02svn78101"

RPM_NAME = "texlive-luarandom-2026.226.0.0.02svn78101-59.2.noarch.rpm"
RPM_HASH = "8fc0dc156a1c0c6035905fe853ec553668dab4550138cc5b09377bc73ba24216e68a81ef8f06746635ab9a350caa3698bb62ebaa64199c7228249bd5de0ffe4b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-luarandom.sty \
texlive-luarandom"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-iftex.sty \
tex-luacode.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
