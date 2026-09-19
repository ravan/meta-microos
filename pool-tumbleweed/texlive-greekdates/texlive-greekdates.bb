SUMMARY = "Provides ancient Greek day and month names, dates, etcetera"
DESCRIPTION = "The package provides easy access to ancient Greek names of days \
and months of various regions of Greece. In case the historical \
information about a region is not complete, we use the Athenian \
name of the month. Moreover commands and options are provided, \
in order to completely switch to the 'ancient way', commands \
such as \\today."
LICENSE = "LPPL-1.0"

PV = "2026.226.1.0svn75878"

RPM_NAME = "texlive-greekdates-2026.226.1.0svn75878-60.4.noarch.rpm"
RPM_HASH = "11a397c47f47bd5262fa3b8739c4bf485ecff3c275e31b07ecb8bce32bdafda4da458bb87c5221b5f8eba423731b1a64ec784b97404c26107d223495772f564f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-greekdates.sty \
texlive-greekdates"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-calc.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
