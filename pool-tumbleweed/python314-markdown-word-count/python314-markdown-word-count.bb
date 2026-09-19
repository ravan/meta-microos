SUMMARY = "Word counter for raw Markdown files"
DESCRIPTION = "Word counter for raw Markdown files"
LICENSE = "MIT"

PV = "0.1.0"

RPM_NAME = "python314-markdown-word-count-0.1.0-2.2.noarch.rpm"
RPM_HASH = "c9ef56dfcf8925f9f7cf94fee068199bd0c60d5bcf1e0aa60bcd3c713a7c1561cb61fffe5a7b6231ff0b7686b24562518101ccb22f73861b77bca2711e496922"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-markdown-word-count \
python314-markdown-word-count \
python3dist-markdown-word-count"

RDEPENDS:${PN} += "/usr/bin/python3.14 \
/usr/bin/sh \
alts \
python-abi"

inherit rpm
