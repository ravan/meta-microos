SUMMARY = "Minimal PyPI server for uploading & downloading packages with pip/easy_install"
DESCRIPTION = "Minimal PyPI server for uploading & downloading packagesj with pip/easy_install"
LICENSE = "MIT"

PV = "2.4.1"

RPM_NAME = "python314-pypiserver-2.4.1-1.3.noarch.rpm"
RPM_HASH = "5d993d751789e7336637a3e30bd25f05fae6b4370e36fd88c3a644bd7e46a2b74298a7d2ad5e5ec6ab926de8352a30c06a840756669f565ae9ac75078904bd2a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-pypiserver \
python314-pypiserver \
python3dist-pypiserver"

RDEPENDS:${PN} += "/usr/bin/python3.14 \
/usr/bin/sh \
python-abi \
python314-packaging \
python314-passlib \
python314-pip \
update-alternatives"

inherit rpm
