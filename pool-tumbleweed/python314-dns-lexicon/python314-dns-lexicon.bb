SUMMARY = "DNS record manipulation utility"
DESCRIPTION = "Lexicon provides a way to manipulate DNS records on multiple DNS providers \
in a standardized way. Lexicon has a CLI, but it can also be used as a \
Python library. \
 \
Lexicon was designed to be used in automation, specifically letsencrypt."
LICENSE = "MIT"

PV = "3.25.2"

RPM_NAME = "python314-dns-lexicon-3.25.2-1.2.noarch.rpm"
RPM_HASH = "fab1adc3bdf76d3748d70f8e8829d3a9c3198c31be40e87b98c15af81bba5cbe4627335c53fe5fb2819abfb6dd0336968682ab46d111469aa68b6401ff931a0d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-dns-lexicon \
python314-dns-lexicon \
python3dist-dns-lexicon"

RDEPENDS:${PN} += "/usr/bin/python3.14 \
/usr/bin/sh \
python-abi \
python314-PyYAML \
python314-beautifulsoup4 \
python314-cryptography \
python314-dnspython \
python314-pyotp \
python314-requests \
python314-requests-unixsocket \
python314-tldextract \
update-alternatives"

inherit rpm
