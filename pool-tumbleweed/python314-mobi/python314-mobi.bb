SUMMARY = "Library for unpacking unencrypted mobi files"
DESCRIPTION = "Python library for unpacking unencrypted mobi files (forked from KindleUnpack)"
LICENSE = "GPL-3.0-only"

PV = "0.3.3"

RPM_NAME = "python314-mobi-0.3.3-4.2.noarch.rpm"
RPM_HASH = "1f288366a8653380269dcb0cb8202193782752ae249ba422957639b65fd37c6f6e05bca2ac99bf123214aedd07deef230367675feae6a2654de3d662416cc7f6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-mobi \
python314-mobi \
python3dist-mobi"

RDEPENDS:${PN} += "/usr/bin/python3.14 \
/usr/bin/sh \
alts \
python-abi \
python314-loguru"

inherit rpm
