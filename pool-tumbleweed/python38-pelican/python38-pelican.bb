SUMMARY = "A tool to generate a static blog from reStructuredText or Markdown input files"
DESCRIPTION = "Pelican is a static site generator, written in Python. \
 \
* Write your weblog entries directly with your editor of choice in reStructuredText, Markdown or AsciiDoc \
* Includes a simple CLI tool to (re)generate the weblog \
* Easy to interface with DVCSes and web hooks \
* Completely static output is easy to host anywhere \
 \
Pelican currently supports: \
 \
* Blog articles and pages \
* Comments, via an external service \
* Theming support (themes are created using Jinja2 templates) \
* PDF generation of the articles/pages (optional) \
* Publication of articles in multiple languages \
* Atom/RSS feeds \
* Code syntax highlighting \
* Asset management with webassets (optional) \
* Import from WordPress, Dotclear, or RSS feeds \
* Integration with external tools: Twitter, Google Analytics, etc. (optional)"
LICENSE = "AGPL-3.0-only"

PV = "4.5.4+git.1610713159.8bb5f1b7"

RPM_NAME = "python38-pelican-4.5.4+git.1610713159.8bb5f1b7-1.4.noarch.rpm"
RPM_HASH = "8f6e53b12dfbf7e4a9a928597f0b21b8feacbf292af24d3ebcbc30d9311fea588434a899f8057d5c9184185910e25ffad9dd9ce8599ecec7fe2d848591741f27"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-pelican \
python3.8dist-pelican \
python38-pelican \
python3dist-pelican"

RDEPENDS:${PN} += "/usr/bin/python3.8 \
/usr/bin/sh \
python-abi \
python38-Jinja2 \
python38-Pygments \
python38-Unidecode \
python38-blinker \
python38-docutils \
python38-feedgenerator \
python38-python-dateutil \
python38-pytz \
update-alternatives"

inherit rpm
