SUMMARY = "Wikipedia tools (for Humans)"
DESCRIPTION = "Python and command-line MediaWiki access for Humans. \
 \
Features: \
* get an HTML or plain text 'extract' (lead or summary) \
* get a representative image (pageimage, thumb, etc.) \
* get an Infobox as a python dictionary \
* get any/all Wikidata by title \
* get info in any language \
* get random info"
LICENSE = "MIT"

PV = "0.4.17"

RPM_NAME = "python314-wptools-0.4.17-5.10.noarch.rpm"
RPM_HASH = "b39f5dc5a3f79644e3d24397b72d4b8364b10908d43ad851dbd57884abb8a9968d3f3fc6302ce4a9acd0fba4f22411a6a96c10d8d4f67a25823658f8d3744387"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-wptools \
python314-wptools \
python3dist-wptools"

RDEPENDS:${PN} += "/usr/bin/python3.14 \
/usr/bin/sh \
python-abi \
python314-certifi \
python314-html2text \
python314-lxml \
python314-pycurl \
update-alternatives"

inherit rpm
