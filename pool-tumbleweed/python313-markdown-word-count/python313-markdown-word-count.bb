SUMMARY = "Word counter for raw Markdown files"
DESCRIPTION = "Word counter for raw Markdown files"
LICENSE = "MIT"

PV = "0.1.0"

RPM_NAME = "python313-markdown-word-count-0.1.0-2.2.noarch.rpm"
RPM_HASH = "bc1820b75195b83f61033e299bdd06eb1b6412a3df153230cfc93aba1af024155ed20095b1877397ba16e6097b5b1591987af6a7fb490de9bf38be0291cc10c3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-markdown-word-count \
python3.13dist-markdown-word-count \
python313-markdown-word-count \
python3dist-markdown-word-count"

RDEPENDS:${PN} += "/usr/bin/python3.13 \
/usr/bin/sh \
alts \
python-abi"

inherit rpm
