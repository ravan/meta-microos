SUMMARY = "Pad numbers with arbitrary characters"
DESCRIPTION = "This package provides some simple macros which will pad numbers \
(or, indeed, any expanded token) with your choice of character \
(defaulting to '0') to your choice of number of places \
(defaults to '2'). This works not only on arabic numerals, but \
on any expanded list of tokens passed to it. This makes it \
suitable for, among other things, counters of all kinds."
LICENSE = "LPPL-1.0"

PV = "2026.226.1.0svn47621"

RPM_NAME = "texlive-padcount-2026.226.1.0svn47621-58.2.noarch.rpm"
RPM_HASH = "2ed0434ba4dd1e757119e7e6790ac3e5c2fa238db34b9a52fa7f006f1e76f154c739c9db09c26a031c0746c9e36879fda057f418f36c34a6f054987ae0e4833c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-padcount.sty \
texlive-padcount"

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
