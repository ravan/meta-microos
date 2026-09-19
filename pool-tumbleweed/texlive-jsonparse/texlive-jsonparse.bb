SUMMARY = "Parse, store and access JSON data in LaTeX documents"
DESCRIPTION = "This package provides an easy way to read in JSON data from \
files or strings in LaTeX documents, parse the data and store \
it in a user-defined token variable."
LICENSE = "LPPL-1.0"

PV = "2026.226.1.7.1svn77682"

RPM_NAME = "texlive-jsonparse-2026.226.1.7.1svn77682-63.2.noarch.rpm"
RPM_HASH = "88d85f36ec7837ef56c23c5f9bb4e48e2a4ed3346885e005883660b3408e60117083124ba0d5a35ba5c84e65a63bd943d5945b05540c7ee3037bcc4174cfdf43"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-jsonparse.sty \
texlive-jsonparse"

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
