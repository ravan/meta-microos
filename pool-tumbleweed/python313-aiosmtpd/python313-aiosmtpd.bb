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

RPM_NAME = "python313-aiosmtpd-1.4.6-6.1.noarch.rpm"
RPM_HASH = "80a960b698968163c6ad082f89dff65d42f48657d26c84d312c850b9597ede8c557686d29e9be8c42d8eda25875a3c7c77550d758b94fdcecdb4275713f5b016"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-aiosmtpd \
python3.13dist-aiosmtpd \
python313-aiosmtpd \
python3dist-aiosmtpd"

RDEPENDS:${PN} += "/usr/bin/python3.13 \
/usr/bin/sh \
alts \
python-abi \
python313-atpublic \
python313-attrs \
user-nobody"

inherit rpm
