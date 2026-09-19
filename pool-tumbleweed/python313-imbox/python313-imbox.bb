SUMMARY = "Python IMAP for Human beings"
DESCRIPTION = "Python library for reading IMAP mailboxes and converting email content to machine readable data"
LICENSE = "MIT"

PV = "0.10.1"

RPM_NAME = "python313-imbox-0.10.1-2.1.noarch.rpm"
RPM_HASH = "4440996b5be50c0a4beb520ded60daf6d8b274b63f5e066bd3af8a714ff5a038016daa564a9525397b8bb0583b26b478ab984fa785193540ab5e0b35d25caf19"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-imbox \
python3.13dist-imbox \
python313-imbox \
python3dist-imbox"

RDEPENDS:${PN} += "/usr/bin/python3.13 \
/usr/bin/sh \
alts \
python-abi \
python313-chardet"

inherit rpm
