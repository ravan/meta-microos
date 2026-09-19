SUMMARY = "Parse D-Bus introspection XML and process it in various ways"
DESCRIPTION = "dbus-deviation is a project for parsing D-Bus introspection XML and processing \
it in various ways. Its main tool is dbus-interface-diff, which calculates the \
difference between two D-Bus APIs for the purpose of checking for API breaks. \
This functionality is also available as a Python module, dbusdeviation."
LICENSE = "LGPL-2.1-or-later"

PV = "0.6.1"

RPM_NAME = "python313-dbus-deviation-0.6.1-2.12.noarch.rpm"
RPM_HASH = "4e59c53357706896cf3ba078c9b9d134df64895de9949d507337e2d5e68094aa3d6b825b50ef103a3fbf088dab5b963bc4409acf2fcb72890b5d474abf043e8e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-dbus-deviation \
python3.13dist-dbus-deviation \
python313-dbus-deviation \
python3dist-dbus-deviation"

RDEPENDS:${PN} += "/usr/bin/python3.13 \
/usr/bin/sh \
python-abi \
python313-lxml \
update-alternatives"

inherit rpm
