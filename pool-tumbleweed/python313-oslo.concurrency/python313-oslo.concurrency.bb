SUMMARY = "OpenStack oslo.concurrency library"
DESCRIPTION = "The oslo.concurrency library has utilities for safely running multi-thread, \
multi-process applications using locking mechanisms and for running \
external processes."
LICENSE = "Apache-2.0"

PV = "7.6.1"

RPM_NAME = "python313-oslo.concurrency-7.6.1-1.1.noarch.rpm"
RPM_HASH = "c5f99968addd675788241ef37baac52d1cbf773f6036147fde45542c925d21ebd3fc784c8d82c77369a062dd6091fae3b27e20cdbad7ce7ee02f8e7873815a24"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-oslo.concurrency \
python3.13dist-oslo.concurrency \
python313-oslo.concurrency \
python3dist-oslo.concurrency"

RDEPENDS:${PN} += "/usr/bin/python3.13 \
/usr/bin/sh \
python-abi \
python313-debtcollector \
python313-fasteners \
python313-oslo.config \
python313-oslo.i18n \
python313-oslo.utils"

inherit rpm
