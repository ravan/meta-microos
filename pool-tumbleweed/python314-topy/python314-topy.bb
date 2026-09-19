SUMMARY = "Tool for fixing typos in text using regular expressions"
DESCRIPTION = "A tool for fixing typos in text using regular expressions, \
based on RegExTypoFix from Wikipedia."
LICENSE = "CC-BY-SA-4.0 & MIT"

PV = "1.1.0"

RPM_NAME = "python314-topy-1.1.0-2.5.noarch.rpm"
RPM_HASH = "02c02a3f04d77482e6f8eb9da060b2789c5220dc70acfa30c441091d44d9ecea4cd03f82e52aec31a5665b43e0f780e766b6015e97596dba6954ba42eed969c6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-topy \
python314-topy \
python3dist-topy"

RDEPENDS:${PN} += "/usr/bin/python3.14 \
/usr/bin/sh \
python-abi \
python314-beautifulsoup4 \
python314-regex \
update-alternatives"

inherit rpm
