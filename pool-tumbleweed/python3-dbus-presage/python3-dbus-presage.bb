SUMMARY = "Intelligent predictive text entry platform (dbus service)"
DESCRIPTION = "Presage is an intelligent predictive text entry platform. \
 \
This package contains the presage D-Bus service. \
 \
This package also contains a simple demonstration program that uses the D-Bus service."
LICENSE = "GPL-2.0-only"

PV = "0.9.1"

RPM_NAME = "python3-dbus-presage-0.9.1-18.6.aarch64.rpm"
RPM_HASH = "f81522e2077ed9c4195328f2940b28407b4fde7947db62ef3241a561f91cffb5a758bb063c0d8bc7a02d46ee693ab4b9fc3957df20d117527b2e630eccd8cb0d"

RPROVIDES:${PN} += "dbus-1-presage \
python3-dbus-presage"

RDEPENDS:${PN} += "/usr/bin/python3.13 \
python-abi \
python3-dbus-python \
python3-presage"

inherit rpm
