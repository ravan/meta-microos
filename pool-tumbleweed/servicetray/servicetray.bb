SUMMARY = "Tool to start and stop systemd services as a normal user via a tray applet"
DESCRIPTION = "Tool to start and stop systemd services as a normal user via a tray applet. \
Services that this tool can manage are configured via /etc/servicetray.toml."
LICENSE = "GPL-3.0-or-later"

PV = "0.3"

RPM_NAME = "servicetray-0.3-1.1.noarch.rpm"
RPM_HASH = "28a17b9e599ce9f1e48e77ef6df78e0f1a9922181078f53b201c93a1792f43725847fe38b2431ffa2252f285665816bf5d2828ab972ff219f55a5475f3798cc3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "config-servicetray \
servicetray"

RDEPENDS:${PN} += "/usr/bin/python3 \
python3 \
python3-pyside6 \
python3-toml \
sudo \
systemd"

inherit rpm
