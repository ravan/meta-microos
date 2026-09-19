SUMMARY = "A small python module for wake on lan"
DESCRIPTION = "A small python module for wake on lan."
LICENSE = "MIT"

PV = "3.3.0"

RPM_NAME = "python314-wakeonlan-3.3.0-1.2.noarch.rpm"
RPM_HASH = "088768e1e7211f3d1d9e842cec8d4f1a6b0c928b749c2f8c447e902f08cf27333bb194d65a8d614ba8c0bf78fe998cfa106d95cb1d446b94e615e441c6b59d19"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-wakeonlan \
python314-wakeonlan \
python3dist-wakeonlan"

RDEPENDS:${PN} += "/usr/bin/python3.14 \
/usr/bin/sh \
python-abi \
update-alternatives"

inherit rpm
