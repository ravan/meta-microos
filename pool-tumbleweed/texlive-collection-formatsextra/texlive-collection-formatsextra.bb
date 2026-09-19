SUMMARY = "Additional formats"
DESCRIPTION = "Collected TeX `formats', i.e., large-scale macro packages \
designed to be dumped into .fmt files -- excluding the most \
common ones, such as latex and context, which have their own \
package(s). It also includes the Aleph engine and related Omega \
formats and packages, and the HiTeX engine and related."
LICENSE = "LPPL-1.0"

PV = "2026.222.svn72250"

RPM_NAME = "texlive-collection-formatsextra-2026.222.svn72250-68.2.noarch.rpm"
RPM_HASH = "9c9b823c5ed16bdad34dcb60f8c145c3f85cf5b5715fe7182f481e7b33f5cf2605e8fc40f4b7d2d8162755d2e160028aaf74f28d78a54d58d7021377b1aed0e4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "pattern- \
pattern-category- \
tex-formatsextra \
texlive-collection-formatsextra"

RDEPENDS:${PN} += "texlive-aleph \
texlive-antomega \
texlive-collection-basic \
texlive-collection-latex \
texlive-eplain \
texlive-hitex \
texlive-jadetex \
texlive-lambda \
texlive-lollipop \
texlive-mltex \
texlive-mxedruli \
texlive-omega \
texlive-omegaware \
texlive-otibet \
texlive-passivetex \
texlive-psizzl \
texlive-startex \
texlive-texsis \
texlive-xmltex"

inherit rpm
