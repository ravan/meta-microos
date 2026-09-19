SUMMARY = "Print dates according to the classical Latin calendar"
DESCRIPTION = "kalendarium is a LaTeX3 package that provides several macros \
with which to print dates in classical Latin given days on the \
Julian or Gregorian calendars, using the same syntax used by \
ancient Roman authors. The format of these dates may be \
customised either in the package options or on a per-command \
basis; these options also allow for the generation of date \
strings according to different eras of the Classical period."
LICENSE = "LPPL-1.0"

PV = "2026.226.1.0svn48744"

RPM_NAME = "texlive-kalendarium-2026.226.1.0svn48744-63.2.noarch.rpm"
RPM_HASH = "4cecb3358ecd11273b22f3fccd47b2a0d463d93c50c86b61292966e862e0d012a3bf4793aa484ed850b1523bc442c441b5fe92608a3d968c1e47990214e16c0f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-kalendarium.sty \
texlive-kalendarium"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-l3keys2e.sty \
tex-xparse.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
