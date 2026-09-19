SUMMARY = "OpenStack oslo.concurrency library"
DESCRIPTION = "The oslo.concurrency library has utilities for safely running multi-thread, \
multi-process applications using locking mechanisms and for running \
external processes."
LICENSE = "Apache-2.0"

PV = "7.6.1"

RPM_NAME = "python314-oslo.concurrency-7.6.1-1.1.noarch.rpm"
RPM_HASH = "cde3c774c3007f019d709f2fa046b409180b5ad887572140b016b198d2ab0b7ebc71f95b65ba55de83ef51727f6d18baab1c5a8cd7a68e3a28b858a5a29df439"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-oslo.concurrency \
python314-oslo.concurrency \
python3dist-oslo.concurrency"

RDEPENDS:${PN} += "/usr/bin/python3.14 \
/usr/bin/sh \
python-abi \
python314-debtcollector \
python314-fasteners \
python314-oslo.config \
python314-oslo.i18n \
python314-oslo.utils"

inherit rpm
