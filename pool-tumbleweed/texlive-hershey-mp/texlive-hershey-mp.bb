SUMMARY = "MetaPost support for the Hershey font file format"
DESCRIPTION = "This package provides MetaPost support for reading jhf vector \
font files, used by (mostly? only?) the so-called Hershey Fonts \
of the late 1960s. The package does not include the actual font \
files, which you can probably find in the software repository \
of your operating system."
LICENSE = "LPPL-1.0"

PV = "2026.226.2022_1.0svn70885"

RPM_NAME = "texlive-hershey-mp-2026.226.2022_1.0svn70885-60.4.noarch.rpm"
RPM_HASH = "9b1cc6a0d46d50199180def3f4edf86c983a0a954e88c8ab58c63468c9991e636f389c9f8c62ebb2783f733c5d7cb6030576ea32085760366ccdc16f3c736cd6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-hershey-mp"

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
