SUMMARY = "Extracts emails and attachments saved in Microsoft Outlook's msg files"
DESCRIPTION = "The python package extract-msg automates the extraction of key email \
data (from, to, cc, date, subject, body) and the email’s attachments."
LICENSE = "GPL-3.0-only"

PV = "0.56.1"

RPM_NAME = "python314-extract-msg-0.56.1-1.1.noarch.rpm"
RPM_HASH = "19d68446a99c72a7495b95fe08592085646872fe0a78808ae9e11a83c60a0c01d17026a022a10b91f8307382c58af1f400e79bf7ffcb99401a5d17866d7b1780"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-extract-msg \
python314-extract-msg \
python3dist-extract-msg"

RDEPENDS:${PN} += "/usr/bin/python3.14 \
/usr/bin/sh \
python-abi \
python314-RTFDE \
python314-beautifulsoup4 \
python314-compressed-rtf \
python314-ebcdic \
python314-olefile \
python314-red-black-tree-mod \
python314-tzlocal \
update-alternatives"

inherit rpm
