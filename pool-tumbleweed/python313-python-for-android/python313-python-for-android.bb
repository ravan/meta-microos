SUMMARY = "Android APK packager for Python scripts and apps"
DESCRIPTION = "Android APK packager for Python scripts and apps"
LICENSE = "MIT"

PV = "2024.1.21"

RPM_NAME = "python313-python-for-android-2024.1.21-2.10.noarch.rpm"
RPM_HASH = "17730ff0604591043a0ef4700e1bd1dc82aecd338df467575eb43f7fb5ab786a68eb3dc130f94f63e01012b559939a2d176cc87de8e87552732d71139c0f0b05"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-python-for-android \
python3.13dist-python-for-android \
python313-python-for-android \
python3dist-python-for-android"

RDEPENDS:${PN} += "/usr/bin/bash \
/usr/bin/python3.13 \
/usr/bin/sh \
python-abi \
python313-Jinja2 \
python313-appdirs \
python313-build \
python313-colorama \
python313-packaging \
python313-setuptools \
python313-sh \
python313-toml \
update-alternatives"

inherit rpm
