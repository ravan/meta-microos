SUMMARY = "A GTK user interface for TLP"
DESCRIPTION = "TLPUI is a GTK user interface for TLP written in Python. The Python scripts in \
this project generate a GTK-UI to change TLP configuration files easily. It has \
the aim to protect users from setting bad configuration and to deliver a basic \
overview of all the valid configuration values."
LICENSE = "CC-BY-SA-4.0 & GPL-2.0-or-later"

PV = "1.10.1"

RPM_NAME = "tlpui-1.10.1-1.2.noarch.rpm"
RPM_HASH = "0cdabcf8c5066244e7edc694a372be4db8899e6d9e0958b05d5bb975316a81fb0cda84918ac344c51ab6abe8b73db3e8f5bcbcd7ac346bed680fddafb78770fe"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.13dist-tlp-ui \
python3dist-tlp-ui \
tlpui"

RDEPENDS:${PN} += "/usr/bin/python3.13 \
python-abi \
python3-PyYAML \
python3-gobject \
python3-gobject-Gdk \
tlp"

inherit rpm
