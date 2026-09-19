SUMMARY = "Python IMAP for Human beings"
DESCRIPTION = "Python library for reading IMAP mailboxes and converting email content to machine readable data"
LICENSE = "MIT"

PV = "0.10.1"

RPM_NAME = "python314-imbox-0.10.1-2.1.noarch.rpm"
RPM_HASH = "e3a665df70d8aed24a0fc71956880313e7a327a512aaebd8615b310cae764748a613d9ca2f83ec03880aff5e52bf1806a7a33fa5662100a8848da3b976f3222b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-imbox \
python314-imbox \
python3dist-imbox"

RDEPENDS:${PN} += "/usr/bin/python3.14 \
/usr/bin/sh \
alts \
python-abi \
python314-chardet"

inherit rpm
