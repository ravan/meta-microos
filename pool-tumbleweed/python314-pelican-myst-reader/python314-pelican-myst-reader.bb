SUMMARY = "Pelican plugin for converting MyST's Markdown variant to HTML"
DESCRIPTION = "MyST Reader is a Pelican plugin that converts documents written in \
MyST’s variant of Markdown into HTML. \
 \
MyST syntax is a superset of [CommonMark][]. So if you feed your Pelican \
site with non-MyST Markdown files or other variants, most of them will \
probably renders as they were with this plugin."
LICENSE = "AGPL-3.0-only"

PV = "1.4.0"

RPM_NAME = "python314-pelican-myst-reader-1.4.0-3.2.noarch.rpm"
RPM_HASH = "f215ce9924e2804ab825c5581ebdac0b2c00565d7d08af7a4b9d146219e4ddba3c2b1c6ecac133307f95f4baa12a111dae3a7eb4f49f29559564e0397006c717"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-pelican-myst-reader \
python314-pelican-myst-reader \
python3dist-pelican-myst-reader"

RDEPENDS:${PN} += "python-abi \
python314-Markdown \
python314-PyYAML \
python314-beautifulsoup4 \
python314-docutils \
python314-markdown-word-count \
python314-myst-parser \
python314-pelican"

inherit rpm
