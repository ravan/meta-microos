SUMMARY = "LaTeX guide for word processor users, in Italian"
DESCRIPTION = "The package provides a version of the document in Italian"
LICENSE = "GFDL-1.3-or-later"

PV = "2026.226.1.0.10svn36000"

RPM_NAME = "texlive-latex4wp-it-2026.226.1.0.10svn36000-61.2.noarch.rpm"
RPM_HASH = "86adb77fa6c33d1252a1156eaad7a8c6969111e68fc5040eeb9dfd2eabc37424f8e48b091f328d18960f95b1ac8f497398d471a1ceaeb7dcb24d536e4a52fbbf"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-latex4wp-it"

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
