SUMMARY = "Basic utility programs for use with TeX"
DESCRIPTION = "Basic utility programs from the original TeX project at \
Stanford, comprising: dvitype, which converts a TeX output \
(DVI) file to a plain text file (see also the DVI structure \
topic); pooltype, which converts a TeX-suite program's 'pool' \
(string) file into human-readable form; and tftopl and pltotf, \
which convert between binary TeX font metric (TFM) files and \
human readable property list (PL) files."
LICENSE = "LicenseRef-SUSE-Public-Domain"

PV = "2026.227.svn77830"

RPM_NAME = "texlive-texware-2026.227.svn77830-62.2.noarch.rpm"
RPM_HASH = "0fb258f37c6dfbb7a7dfbe5e18965fbb1bd025394f5c457f79d3ebbec9067fd43f668d20f2bab3bedd9a8f64ec557d59da89daff0cd9976ecd8fa9a160e94986"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "man-dvitype.1 \
man-pooltype.1 \
texlive-texware"

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
texlive-scripts-bin \
texlive-texware-bin"

inherit rpm
