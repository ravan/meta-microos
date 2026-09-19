SUMMARY = "Date parsing library designed to parse dates from HTML pages"
DESCRIPTION = "Date parsing library designed to parse dates from HTML pages"
LICENSE = "BSD-3-Clause"

PV = "1.4.2"

RPM_NAME = "python313-dateparser-1.4.2-1.1.noarch.rpm"
RPM_HASH = "b41948a2e52a041be865bc062742f7e6b147f7434bc61f34e366e8c4e40b46bff6c9940e191612dc381a7603c7ee626815ecf5e083037ac9568b545fc8804590"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-dateparser \
python3.13dist-dateparser \
python313-dateparser \
python3dist-dateparser"

RDEPENDS:${PN} += "/usr/bin/python3.13 \
/usr/bin/sh \
alts \
python-abi \
python313-python-dateutil \
python313-pytz \
python313-regex \
python313-tzlocal"

inherit rpm
