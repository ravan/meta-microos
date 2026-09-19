SUMMARY = "Collect your thoughts and notes without leaving the command line"
DESCRIPTION = "Simple journal application for the command line. You can use it to \
easily create, search, and view journal entries. Journals are stored \
as human-readable plain text, and can also be encrypted using AES \
encryption."
LICENSE = "GPL-3.0-only"

PV = "4.2.1"

RPM_NAME = "jrnl-4.2.1-1.5.noarch.rpm"
RPM_HASH = "a73c863ec2c4aad151cd20b190899b1c6e3c9a8eb2f9c60cd2c303cdfb52dfeec54f003421dcf4a2a28d0786ebe11f9838641c5787c8c276cea8891c033e4f92"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "jrnl \
python3.13dist-jrnl \
python3dist-jrnl"

RDEPENDS:${PN} += "/usr/bin/python3.13 \
python-abi \
python3-colorama \
python3-cryptography \
python3-dateutil \
python3-keyring \
python3-parsedatetime \
python3-pyxdg \
python3-rich \
python3-ruamel.yaml \
python3-tzlocal"

inherit rpm
