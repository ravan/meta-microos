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

PV = "4.11.0"

RPM_NAME = "python314-pelican-4.11.0-3.5.noarch.rpm"
RPM_HASH = "deb8bd5ca54c61fbca6259cae96393671022847abc6487dc3a48bd9a9b70ced6da44176f6cbf574f4161ea09fcb1ec817332e7dc31b4ce752dbd9e0c80908370"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-pelican \
python314-pelican \
python3dist-pelican"

RDEPENDS:${PN} += "/usr/bin/python3.14 \
/usr/bin/sh \
python-abi \
python314-Jinja2 \
python314-Pygments \
python314-Unidecode \
python314-blinker \
python314-docutils \
python314-feedgenerator \
python314-ordered-set \
python314-python-dateutil \
python314-rich \
python314-watchfiles \
update-alternatives"

inherit rpm
