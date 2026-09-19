SUMMARY = "Documentation for texlive-context"
DESCRIPTION = "This package includes the documentation for texlive-context"
LICENSE = "LPPL-1.0"

PV = "2026.226.20260219_11_49_asvn78010"

RPM_NAME = "texlive-context-doc-2026.226.20260219_11_49_asvn78010-61.2.noarch.rpm"
RPM_HASH = "a99bcd5ac16658a5233af4916f1ae2d338b242a1b030aaf24ece10487ca382c36bb46bc16aa1fce8948aa6c2c7c098bbb86b11e5c237b9d08a80397a262fb26a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "man-context.1 \
man-mtxrun-babel.1 \
man-mtxrun-bibtex.1 \
man-mtxrun-cache.1 \
man-mtxrun-chars.1 \
man-mtxrun-check.1 \
man-mtxrun-colors.1 \
man-mtxrun-context.1 \
man-mtxrun-convert.1 \
man-mtxrun-ctan.1 \
man-mtxrun-dvi.1 \
man-mtxrun-epub.1 \
man-mtxrun-evohome.1 \
man-mtxrun-fcd.1 \
man-mtxrun-fixpdf.1 \
man-mtxrun-flac.1 \
man-mtxrun-fonts.1 \
man-mtxrun-grep.1 \
man-mtxrun-interface.1 \
man-mtxrun-kpse.1 \
man-mtxrun-metapost.1 \
man-mtxrun-modules.1 \
man-mtxrun-package.1 \
man-mtxrun-patterns.1 \
man-mtxrun-pdf.1 \
man-mtxrun-plain.1 \
man-mtxrun-profile.1 \
man-mtxrun-rsync.1 \
man-mtxrun-scite.1 \
man-mtxrun-server.1 \
man-mtxrun-spell.1 \
man-mtxrun-synctex.1 \
man-mtxrun-texworks.1 \
man-mtxrun-tools.1 \
man-mtxrun-unicode.1 \
man-mtxrun-unzip.1 \
man-mtxrun-update.1 \
man-mtxrun-vscode.1 \
man-mtxrun-watch.1 \
man-mtxrun-youless.1 \
man-mtxrun.1 \
texlive-context-doc"

RDEPENDS:${PN} += ""

inherit rpm
