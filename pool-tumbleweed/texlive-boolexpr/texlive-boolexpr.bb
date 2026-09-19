SUMMARY = "A boolean expression evaluator and a switch command"
DESCRIPTION = "The \\boolexpr macro evaluates boolean expressions in a purely \
expandable way. \\boolexpr{ A \\OR B \\AND C } expands to 0 if the \
logical expression is TRUE. A, B, C may be: numeric expressions \
such as: x=y, x<>y, x>y or x<y; - boolean switches: \\iftrue \
0\\else 1\\fi; - conditionals: \\ifcsname whatsit\\endcsname 0\\else \
1\\fi; - another \\boolexpr: \\boolexpr{ D \\OR E \\AND F }: \
\\boolexpr may be used with \\ifcase: \\ifcase\\boolexpr{ A \\OR B \
\\AND C } What to do if true \\else What to do if false \\fi The \
\\switch command (which is also expandable) has the form: \
\\switch \\case{<boolean expression>} ... \\case{<boolean \
expression>} ... ... \\otherwise ... \\endswitch"
LICENSE = "LPPL-1.0"

PV = "2026.226.3.14svn17830"

RPM_NAME = "texlive-boolexpr-2026.226.3.14svn17830-59.2.noarch.rpm"
RPM_HASH = "7fbeb459cee8d1b2c3bea0c392f125428a8a783b33511650d2e3039a81b368a2de46a76c5ebf2dfc9031feb0c28ea386acf08c621a10124a9b6f3b126f104184"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-boolexpr.sty \
texlive-boolexpr"

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
