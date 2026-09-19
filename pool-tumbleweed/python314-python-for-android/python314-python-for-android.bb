SUMMARY = "Android APK packager for Python scripts and apps"
DESCRIPTION = "Android APK packager for Python scripts and apps"
LICENSE = "MIT"

PV = "2024.1.21"

RPM_NAME = "python314-python-for-android-2024.1.21-2.10.noarch.rpm"
RPM_HASH = "e2e4c42ad6c999cf25a5fc92a0af18fd1a83543a86159d67598778a6d5b3b035e65ef1fb41cab5188ccf618d211a595277566a111e6ccc4714fdf458d1639945"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-python-for-android \
python314-python-for-android \
python3dist-python-for-android"

RDEPENDS:${PN} += "/usr/bin/bash \
/usr/bin/python3.14 \
/usr/bin/sh \
python-abi \
python314-Jinja2 \
python314-appdirs \
python314-build \
python314-colorama \
python314-packaging \
python314-setuptools \
python314-sh \
python314-toml \
update-alternatives"

inherit rpm
