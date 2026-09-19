SUMMARY = "Parse D-Bus introspection XML and process it in various ways"
DESCRIPTION = "dbus-deviation is a project for parsing D-Bus introspection XML and processing \
it in various ways. Its main tool is dbus-interface-diff, which calculates the \
difference between two D-Bus APIs for the purpose of checking for API breaks. \
This functionality is also available as a Python module, dbusdeviation."
LICENSE = "LGPL-2.1-or-later"

PV = "0.6.1"

RPM_NAME = "python314-dbus-deviation-0.6.1-2.12.noarch.rpm"
RPM_HASH = "e5c2609f7d4c32d5ec78b1196e4a4052f9279a504c7d6a4b4465870ca6bd84428873bb3064cdee2f8e9100c5b0dbe9c5510a34685f308fbf2b763a6cef327292"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-dbus-deviation \
python314-dbus-deviation \
python3dist-dbus-deviation"

RDEPENDS:${PN} += "/usr/bin/python3.14 \
/usr/bin/sh \
python-abi \
python314-lxml \
update-alternatives"

inherit rpm
