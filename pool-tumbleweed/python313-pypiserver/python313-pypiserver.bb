SUMMARY = "Minimal PyPI server for uploading & downloading packages with pip/easy_install"
DESCRIPTION = "Minimal PyPI server for uploading & downloading packagesj with pip/easy_install"
LICENSE = "MIT"

PV = "2.4.1"

RPM_NAME = "python313-pypiserver-2.4.1-1.3.noarch.rpm"
RPM_HASH = "31b0d0ec1df0c26e9012a4f660655183a0fecbe1ad5b21dc813bfb9093b5c29a336dbf4e3e3d8d424cf08dd95dc9dbdc9c3cd05d4699b2ee17aaaa9bc21a4acd"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-pypiserver \
python3.13dist-pypiserver \
python313-pypiserver \
python3dist-pypiserver"

RDEPENDS:${PN} += "/usr/bin/python3.13 \
/usr/bin/sh \
python-abi \
python313-packaging \
python313-passlib \
python313-pip \
update-alternatives"

inherit rpm
