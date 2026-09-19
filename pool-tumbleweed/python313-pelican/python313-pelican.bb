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

RPM_NAME = "python313-pelican-4.11.0-3.5.noarch.rpm"
RPM_HASH = "12bfbeec94d39c690d94a88e64e83f68c73114604bd18e708411ef13542483bc6029da25bf0969772b6532ec1bcc66d14b4a9038eaabb5ee9e52e26b35e79007"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-pelican \
python3.13dist-pelican \
python313-pelican \
python3dist-pelican"

RDEPENDS:${PN} += "/usr/bin/python3.13 \
/usr/bin/sh \
python-abi \
python313-Jinja2 \
python313-Pygments \
python313-Unidecode \
python313-blinker \
python313-docutils \
python313-feedgenerator \
python313-ordered-set \
python313-python-dateutil \
python313-rich \
python313-watchfiles \
update-alternatives"

inherit rpm
