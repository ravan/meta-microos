SUMMARY = "Process trailing punctuation which may be redundant"
DESCRIPTION = "The package provides commands enabling the user (or package \
writer) to insert punctuation after a macro. The method is \
similar to that of xspace, but goes further. The package \
provides the commands \\xperiod, \\xcomma and \\xperiodcomma, \
which follow a similar procedure to that of \\xspace, and insert \
punctuation if and only if it is necessary. It also provides \
\\xperiodafter, \\xcommaafter, \\xperiodcommaafter and \
\\xspaceafter, which all take one argument, the word or phrase \
to be punctuated. These then avoid problems with the spacing of \
periods and commas after emphasised words."
LICENSE = "LPPL-1.0"

PV = "2026.226.2.0svn67918"

RPM_NAME = "texlive-xpunctuate-2026.226.2.0svn67918-59.4.noarch.rpm"
RPM_HASH = "908b1b589db27e3e4d76bea25d1bd799e4fd4450d93aeea6ff5380b70772d47240e772583c49ee1132018ff080ae88021cbefd549f7e32ea47e5e92e68954fc7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-xpunctuate.sty \
texlive-xpunctuate"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-xspace.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
