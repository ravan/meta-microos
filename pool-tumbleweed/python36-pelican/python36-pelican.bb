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

RPM_NAME = "python36-pelican-4.5.4+git.1610713159.8bb5f1b7-1.4.noarch.rpm"
RPM_HASH = "4dfbeab63ceea73fe1477652923b21bd5740a0e60c739088e16242b1463690bb0cc3d4631cd33afb30ebbdc7566be1f9312d0ee43dde05a61d71fdd2979deb3d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.6dist-pelican \
python36-pelican \
python3dist-pelican"

RDEPENDS:${PN} += "/usr/bin/python3.6 \
/usr/bin/sh \
python-abi \
python36-Jinja2 \
python36-Pygments \
python36-Unidecode \
python36-blinker \
python36-docutils \
python36-feedgenerator \
python36-python-dateutil \
python36-pytz \
update-alternatives"

inherit rpm
