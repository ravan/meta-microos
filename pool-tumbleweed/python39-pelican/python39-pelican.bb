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

RPM_NAME = "python39-pelican-4.5.4+git.1610713159.8bb5f1b7-1.4.noarch.rpm"
RPM_HASH = "0f151dc8f87aa1aef17f0d1744135173b42aebf82cd594785241d5babe8fa9be1b183c0ed7233401920528515aa73294cffaedc1f00fedc38b79e4a1badbc2df"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-pelican \
python39-pelican \
python3dist-pelican"

RDEPENDS:${PN} += "/usr/bin/python3.9 \
/usr/bin/sh \
python-abi \
python39-Jinja2 \
python39-Pygments \
python39-Unidecode \
python39-blinker \
python39-docutils \
python39-feedgenerator \
python39-python-dateutil \
python39-pytz \
update-alternatives"

inherit rpm
