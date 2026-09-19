SUMMARY = "SMTP server based on asyncio"
DESCRIPTION = "The Python standard library includes a basic SMTP server in the smtpd module, \
based on the old asynchronous libraries asyncore and asynchat. These modules \
are quite old and are definitely showing their age; asyncore and asynchat are \
difficult APIs to work with, understand, extend, and fix. \
 \
With the introduction of the asyncio module in Python 3.4, a much better way of \
doing asynchronous I/O is now available. It seems obvious that an asyncio-based \
version of the SMTP and related protocols are needed for Python 3. This project \
brings together several highly experienced Python developers collaborating on \
this reimplementation. \
 \
This package provides such an implementation of both the SMTP and LMTP protocols."
LICENSE = "Apache-2.0"

PV = "1.4.6"

RPM_NAME = "python312-aiosmtpd-1.4.6-5.1.noarch.rpm"
RPM_HASH = "a08c8eaf363a46c70858f7c51c6f7d60bc61bc541fb25d2d6933fbe7b5d75291a02d55ee6e98d4a6953a2313a9402b769948b51d63e24fede9e263610b1b671a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.12dist-aiosmtpd \
python312-aiosmtpd \
python3dist-aiosmtpd"

RDEPENDS:${PN} += "/usr/bin/python3.12 \
/usr/bin/sh \
alts \
python-abi \
python312-atpublic \
python312-attrs \
user-nobody"

inherit rpm
