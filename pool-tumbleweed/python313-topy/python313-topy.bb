SUMMARY = "Tool for fixing typos in text using regular expressions"
DESCRIPTION = "A tool for fixing typos in text using regular expressions, \
based on RegExTypoFix from Wikipedia."
LICENSE = "CC-BY-SA-4.0 & MIT"

PV = "1.1.0"

RPM_NAME = "python313-topy-1.1.0-2.5.noarch.rpm"
RPM_HASH = "c7213bf979efdf66d095cc3af01f5e8ac9c9a2eccd6657cd03daf15fc286bcd06ffa43fbd7515d13a8fc1914ad3e809405ad629c44ac0e913f163b37dcb8c6f8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-topy \
python3.13dist-topy \
python313-topy \
python3dist-topy"

RDEPENDS:${PN} += "/usr/bin/python3.13 \
/usr/bin/sh \
python-abi \
python313-beautifulsoup4 \
python313-regex \
update-alternatives"

inherit rpm
