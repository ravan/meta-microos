SUMMARY = "Access metadata from the git distributed version control system"
DESCRIPTION = "The package makes it possible to incorporate git version \
control metadata into documents. For memoir users, the package \
provides the means to tailor page headers and footers to use \
the metadata. gitinfo2 is a new release of gitinfo. The changes \
to version 2 are not backward-compatible, and the package name \
has been changed to avoid impact on existing users' \
repositories. All new repositories should use this version of \
the package."
LICENSE = "LPPL-1.0"

PV = "2026.226.2.0.7svn77682"

RPM_NAME = "texlive-gitinfo2-2026.226.2.0.7svn77682-60.4.noarch.rpm"
RPM_HASH = "b0bcffc9d0379ea533b3a06b2da625063783da86ce8bc27ba27fe31ea4752d1d5bab71c1545aa6a219acae7dcb38d303f995fc2d95a9f96672bf010aed27380a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-gitexinfo.sty \
tex-gitinfo2.sty \
texlive-gitinfo2"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-eso-pic.sty \
tex-etoolbox.sty \
tex-kvoptions.sty \
tex-xstring.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
