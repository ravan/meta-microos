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

RPM_NAME = "python314-aiosmtpd-1.4.6-6.1.noarch.rpm"
RPM_HASH = "2fc4b31d7f403f2aad86f1cb426972f3101a1e6d5819dfd5c26bd4203d7f42fb1a2d6e2e4e93a876649d098549191d580c045570a18cf69e6bca1b88ebc831cd"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-aiosmtpd \
python314-aiosmtpd \
python3dist-aiosmtpd"

RDEPENDS:${PN} += "/usr/bin/python3.14 \
/usr/bin/sh \
alts \
python-abi \
python314-atpublic \
python314-attrs \
user-nobody"

inherit rpm
