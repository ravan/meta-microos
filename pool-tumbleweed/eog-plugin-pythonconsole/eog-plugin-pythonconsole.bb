SUMMARY = "Eog pythonconsole plugin"
DESCRIPTION = "The Eye of Gnome python console plugin"
LICENSE = "GPL-2.0-or-later"

PV = "44.1"

RPM_NAME = "eog-plugin-pythonconsole-44.1-2.3.aarch64.rpm"
RPM_HASH = "e2446f89715213cab934564005b5aa0c80fb1b11c5f3be3696d30831357829598c66c9dc66c0cbacb43626b06434592581d361415e1e86f5e55bbb0a7ee922f6"

RPROVIDES:${PN} += "eog-plugin-pythonconsole \
eog-plugins-/usr/lib64/eog/plugins/pythonconsole.plugin"

RDEPENDS:${PN} += "eog-plugins-data"

inherit rpm
