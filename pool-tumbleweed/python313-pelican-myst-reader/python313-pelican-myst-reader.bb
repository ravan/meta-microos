SUMMARY = "Pelican plugin for converting MyST's Markdown variant to HTML"
DESCRIPTION = "MyST Reader is a Pelican plugin that converts documents written in \
MyST’s variant of Markdown into HTML. \
 \
MyST syntax is a superset of [CommonMark][]. So if you feed your Pelican \
site with non-MyST Markdown files or other variants, most of them will \
probably renders as they were with this plugin."
LICENSE = "AGPL-3.0-only"

PV = "1.4.0"

RPM_NAME = "python313-pelican-myst-reader-1.4.0-3.2.noarch.rpm"
RPM_HASH = "6570976114fe84f3c94a17ca78b9ce26cb5dcf618c058596a0147425fbb1c429c342a4eae09592eb7d65b0880c5ae9a2d930b557d145daaa2b80be3dc100aa0f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-pelican-myst-reader \
python3.13dist-pelican-myst-reader \
python313-pelican-myst-reader \
python3dist-pelican-myst-reader"

RDEPENDS:${PN} += "python-abi \
python313-Markdown \
python313-PyYAML \
python313-beautifulsoup4 \
python313-docutils \
python313-markdown-word-count \
python313-myst-parser \
python313-pelican"

inherit rpm
