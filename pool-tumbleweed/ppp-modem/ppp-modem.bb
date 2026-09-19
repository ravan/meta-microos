SUMMARY = "Automatic redial for any USB modem supported by the kernel"
DESCRIPTION = "This package contains peer, chat script, systemd unit and udev rule for \
automatic redial when connecting any USB modem supported by the kernel. \
For disable automatic redial (by default enabled for all), run \
sudo systemctl mask modem@0.service \
For enable again automatic redial, run \
sudo systemctl unmask modem@0.service \
'0' after '@' is the serial number of the modem, if you have more than one, \
you can disable unnecessary or disable everything."
LICENSE = "BSD-3-Clause & LGPL-2.1-or-later & GPL-2.0-or-later"

PV = "2.5.2"

RPM_NAME = "ppp-modem-2.5.2-3.4.noarch.rpm"
RPM_HASH = "0366ac21c1fea461b45bc8470085715dffd55891684c1e1de450c254e27c248881c4de78911ed9d2bbb7e890111b2f88d7661e20a72a9541ff3a2044e9c62257"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "config-ppp-modem \
ppp-modem"

RDEPENDS:${PN} += "group-dialout \
ppp \
udev"

inherit rpm
