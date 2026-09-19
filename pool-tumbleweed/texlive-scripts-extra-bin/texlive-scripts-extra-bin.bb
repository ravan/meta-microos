SUMMARY = "Binary files of texlive-scripts-extra"
DESCRIPTION = "Binary files of texlive-scripts-extra"
LICENSE = "LPPL-1.0"

PV = "2026.20260301.svn71749"

RPM_NAME = "texlive-scripts-extra-bin-2026.20260301.svn71749-120.4.aarch64.rpm"
RPM_HASH = "3101127d12f86dbb6fdeaa38f7d5af89a1975f7c95c419697d33ec4efcfb627dcfc8dc2d82d39925a8ea1193f0d61dcff4eac247e31dc08ef68e3494946f4780"

RPROVIDES:${PN} += "texlive-pdftools-bin-/usr/bin/e2pall \
texlive-scripts-extra-bin \
texlive-tetex-bin-/usr/bin/allcm \
texlive-tetex-bin-/usr/bin/allneeded \
texlive-tetex-bin-/usr/bin/dvi2fax \
texlive-tetex-bin-/usr/bin/dvired \
texlive-tetex-bin-/usr/bin/kpsetool \
texlive-tetex-bin-/usr/bin/kpsewhere \
texlive-tetex-bin-/usr/bin/texconfig-dialog \
texlive-tetex-bin-/usr/bin/texconfig-sys \
texlive-tetex-bin-/usr/bin/texlinks \
texlive-texconfig-bin-/usr/bin/texconfig"

RDEPENDS:${PN} += "/usr/bin/sh \
texlive-scripts-extra"

inherit rpm
