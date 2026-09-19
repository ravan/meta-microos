SUMMARY = "DNS record manipulation utility"
DESCRIPTION = "Lexicon provides a way to manipulate DNS records on multiple DNS providers \
in a standardized way. Lexicon has a CLI, but it can also be used as a \
Python library. \
 \
Lexicon was designed to be used in automation, specifically letsencrypt."
LICENSE = "MIT"

PV = "3.25.2"

RPM_NAME = "python313-dns-lexicon-3.25.2-1.2.noarch.rpm"
RPM_HASH = "5e5548c1b149011e8e5a2fd448b3ab89728fc643935d5e84e2336dc8bcb73ab8675680b7040b44afc707fe886adfc93aa5ce007eb36b67451ba51de608a47285"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-dns-lexicon \
python3.13dist-dns-lexicon \
python313-dns-lexicon \
python3dist-dns-lexicon"

RDEPENDS:${PN} += "/usr/bin/python3.13 \
/usr/bin/sh \
python-abi \
python313-PyYAML \
python313-beautifulsoup4 \
python313-cryptography \
python313-dnspython \
python313-pyotp \
python313-requests \
python313-requests-unixsocket \
python313-tldextract \
update-alternatives"

inherit rpm
