SUMMARY = "A new reference scheme for LaTeX"
DESCRIPTION = "This package offers a means to remove the limitation, of only \
two properties, that is inherent in the way LaTeX's reference \
system works. The package implements an extensible referencing \
system, where properties may be defined and used in the course \
of a document. It provides an interface for macro programmers \
to access the new reference scheme and some modules that use \
it. Modules available are: zref-user, use zref for \
'traditional' labels and references; zref-abspage, retrieve \
absolute page numbers (physical pages, as opposed to the \
'logical' page number that is normally typeset when a page \
number is requested; zref-lastpage, provide a zref-label for \
the last page of the document; zref-nextpage, provide the page \
number of the next page of the document; zref-totpages, provide \
the total number of pages in the document; zref-pagelayout, \
provide the page layout parameters of a each page (which may \
then be printed at the end of the document); zref-perpage, make \
a counter reset for each new page; zref-titleref, make section \
title or caption text available through the reference system; \
zref-savepos, make positions on a page available; zref-dotfill, \
controlled dot-filling; zref-env, record the latest \
environment's name and the line it started on; and zref-xr, \
provide the facilities of the xr and xr-hyper packages."
LICENSE = "LPPL-1.0"

PV = "2026.226.2.36svn78101"

RPM_NAME = "texlive-zref-2026.226.2.36svn78101-59.4.noarch.rpm"
RPM_HASH = "280364f5d2f6852a324e2a6a86e7879829241af4458086526630951e496619b0a69809c36ca48f8563ba21ed852363d38a5ccf43e3aea085318413db88d4e481"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-zref-abspage.sty \
tex-zref-abspos.sty \
tex-zref-base.sty \
tex-zref-counter.sty \
tex-zref-dotfill.sty \
tex-zref-env.sty \
tex-zref-hyperref.sty \
tex-zref-lastpage.sty \
tex-zref-marks.sty \
tex-zref-nextpage.sty \
tex-zref-pageattr.sty \
tex-zref-pagelayout.sty \
tex-zref-perpage.sty \
tex-zref-runs.sty \
tex-zref-savepos.sty \
tex-zref-thepage.sty \
tex-zref-titleref.sty \
tex-zref-totpages.sty \
tex-zref-user.sty \
tex-zref-xr.sty \
tex-zref.sty \
texlive-zref"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-atbegshi.sty \
tex-auxhook.sty \
tex-etexcmds.sty \
tex-gettitlestring.sty \
tex-iftex.sty \
tex-infwarerr.sty \
tex-keyval.sty \
tex-kvdefinekeys.sty \
tex-kvoptions.sty \
tex-kvsetkeys.sty \
tex-ltxcmds.sty \
tex-makerobust.sty \
tex-pdftexcmds.sty \
tex-uniquecounter.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
