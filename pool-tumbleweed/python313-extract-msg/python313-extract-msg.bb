SUMMARY = "Extracts emails and attachments saved in Microsoft Outlook's msg files"
DESCRIPTION = "The python package extract-msg automates the extraction of key email \
data (from, to, cc, date, subject, body) and the email’s attachments."
LICENSE = "GPL-3.0-only"

PV = "0.56.1"

RPM_NAME = "python313-extract-msg-0.56.1-1.1.noarch.rpm"
RPM_HASH = "f16afa4396e6885080c76474d5c9b9d4a293685c2638024b400388d15c5ff898ce753566bb0e4712cfd483cc7951bb3d0c30d41b2b1f232c48f52cbf2ce5a823"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-extract-msg \
python3.13dist-extract-msg \
python313-extract-msg \
python3dist-extract-msg"

RDEPENDS:${PN} += "/usr/bin/python3.13 \
/usr/bin/sh \
python-abi \
python313-RTFDE \
python313-beautifulsoup4 \
python313-compressed-rtf \
python313-ebcdic \
python313-olefile \
python313-red-black-tree-mod \
python313-tzlocal \
update-alternatives"

inherit rpm
