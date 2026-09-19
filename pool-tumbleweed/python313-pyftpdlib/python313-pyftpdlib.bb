SUMMARY = "Asynchronous FTP server library for Python"
DESCRIPTION = "The Python FTP server library provides a high-level interface to \
write very asynchronous FTP servers with Python."
LICENSE = "MIT"

PV = "2.2.0"

RPM_NAME = "python313-pyftpdlib-2.2.0-2.2.noarch.rpm"
RPM_HASH = "41c24d465e6cd36f59519db785c1b23ba30ab3bd2b1e117065467e4bfc439d15164eb7db9abb52a86b4af9bae4da486ce857de57bbfa5220cd01f47df9fd6170"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-pyftpdlib \
python3.13dist-pyftpdlib \
python313-pyftpdlib \
python3dist-pyftpdlib"

RDEPENDS:${PN} += "/usr/bin/python3.13 \
/usr/bin/sh \
alts \
python-abi \
python313-pyOpenSSL \
python313-pyasynchat \
python313-pyasyncore"

inherit rpm
