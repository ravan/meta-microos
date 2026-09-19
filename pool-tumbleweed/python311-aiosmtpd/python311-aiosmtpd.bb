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

RPM_NAME = "python311-aiosmtpd-1.4.6-5.2.noarch.rpm"
RPM_HASH = "783d4916c3cd68598f4ccf1acdd7d97330f7ba2989df18d30f410cbc3b58535b1824a946c16c1f1b8cc72a242da6e61bd3288fbbfae90cb5e04cb446367f4b35"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist-aiosmtpd \
python311-aiosmtpd \
python3dist-aiosmtpd"

RDEPENDS:${PN} += "/usr/bin/python3.11 \
/usr/bin/sh \
alts \
python-abi \
python311-atpublic \
python311-attrs \
user-nobody"

inherit rpm
