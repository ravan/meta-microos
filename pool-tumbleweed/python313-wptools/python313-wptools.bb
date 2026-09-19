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

RPM_NAME = "python313-wptools-0.4.17-5.10.noarch.rpm"
RPM_HASH = "5216f2769f0fb6de1465438d4d0a9f84dbe580d1d9d4462ed2639909554ba69b18b1471f427cda60e935377689256867dfa7a70c728f87293bc4df79147f4cbf"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-wptools \
python3.13dist-wptools \
python313-wptools \
python3dist-wptools"

RDEPENDS:${PN} += "/usr/bin/python3.13 \
/usr/bin/sh \
python-abi \
python313-certifi \
python313-html2text \
python313-lxml \
python313-pycurl \
update-alternatives"

inherit rpm
