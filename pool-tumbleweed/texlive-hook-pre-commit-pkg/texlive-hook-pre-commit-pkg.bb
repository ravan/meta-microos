SUMMARY = "Pre-commit git hook for LaTeX package developers"
DESCRIPTION = "This package provides a pre-commit git hook to check basic \
LaTeX syntax for the use of package developers. It is installed \
by copying it into the .git/.hooks file. It then checks the \
following file types: .sty, .dtx, .bbx, .cbx, and .lbx. List of \
performed checks: Each line must be terminated by a %, without \
a space before it. Empty lines are allowed, but not lines with \
nothing but spaces in them. \\begin{macro} and \\end{macro} must \
be paired. \\begin{macrocode} and \\end{macrocode} must be \
paired. \\begin{macro} must have a second argument. One space \
must be printed between % and \\begin{macro} or \\end{macro}. % \
must be the first character in the line. Four spaces must be \
printed between % and \\begin{macrocode} or \\end{macrocode}. \\cs \
argument must not start with a backslash."
LICENSE = "GPL-2.0-or-later"

PV = "2026.226.1.1.2svn76790"

RPM_NAME = "texlive-hook-pre-commit-pkg-2026.226.1.1.2svn76790-60.4.noarch.rpm"
RPM_HASH = "ba91d2eeacb2f215b62844282d43ca82e0e55fabc0eae4e8e5814c8e20463407420f954551a5a692ef4445d9ac2c0c485d6dd50a6e7b8e44eadf173dfca47972"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-hook-pre-commit-pkg"

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
