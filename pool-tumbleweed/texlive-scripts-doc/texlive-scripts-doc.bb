SUMMARY = "Documentation for texlive-scripts"
DESCRIPTION = "This package includes the documentation for texlive-scripts"
LICENSE = "LPPL-1.0"

PV = "2026.227.svn78213"

RPM_NAME = "texlive-scripts-doc-2026.227.svn78213-62.2.noarch.rpm"
RPM_HASH = "365063355d2ff99fd1a4dce6e02a073896854bcdb1e5fcab023d90e09198d5f9ceab6599820f4bbf08983647d1dfd5373ba6df79cd6a4f48bff352e21ede1de3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "man-fmtutil-sys.1 \
man-fmtutil-user.1 \
man-fmtutil.1 \
man-install-tl.1 \
man-mktexfmt.1 \
man-mktexmf.1 \
man-mktexpk.1 \
man-mktextfm.1 \
man-texhash.1 \
man-updmap-sys.1 \
man-updmap-user.1 \
man-updmap.1 \
texlive-scripts-doc \
texlive-tetex-doc-/usr/share/man/man1/fmtutil-sys.1.gz \
texlive-tetex-doc-/usr/share/man/man1/fmtutil-user.1.gz \
texlive-tetex-doc-/usr/share/man/man1/fmtutil.1.gz \
texlive-tetex-doc-/usr/share/man/man1/updmap-sys.1.gz \
texlive-tetex-doc-/usr/share/man/man1/updmap-user.1.gz \
texlive-tetex-doc-/usr/share/man/man1/updmap.1.gz \
texlive-tetex-doc-/usr/share/man/man5/fmtutil.cnf.5.gz \
texlive-tetex-doc-/usr/share/man/man5/updmap.cfg.5.gz \
texlive-texconfig-doc-/usr/share/man/man1/texconfig-sys.1.gz \
texlive-texconfig-doc-/usr/share/man/man1/texconfig.1.gz"

RDEPENDS:${PN} += ""

inherit rpm
