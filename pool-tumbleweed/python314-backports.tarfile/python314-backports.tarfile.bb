SUMMARY = "Backport of CPython tarfile module"
DESCRIPTION = "Backport of CPython tarfile module"
LICENSE = "MIT"

PV = "1.2.0"

RPM_NAME = "python314-backports.tarfile-1.2.0-1.4.noarch.rpm"
RPM_HASH = "6b62f592b6ed26488236ded9e4cd5890022e92d719c32f0a7c35a62e973ea37507039771ba6233d638b878a16c64eb680a3b1494cfd65267bea4dc9fc3a032c8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-backports.tarfile \
python314-backports.tarfile \
python3dist-backports.tarfile"

RDEPENDS:${PN} += "python-abi"

inherit rpm
