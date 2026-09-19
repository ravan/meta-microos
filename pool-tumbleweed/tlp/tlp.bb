SUMMARY = "Tools to save battery power on laptops"
DESCRIPTION = "TLP is a feature-rich command-line utility, saving laptop battery power \
without the need to delve deeper into technical details. \
 \
TLP’s default settings are already optimized for battery life and implement \
Powertop’s recommendations out of the box. Moreover TLP is highly \
customizable to fulfill specific user requirements. \
 \
Settings are organized into two profiles, allowing to adjust between \
savings and performance independently for battery (BAT) and AC operation. \
In addition TLP can enable or disable Bluetooth, NFC, Wi-Fi and WWAN radio \
devices on boot. \
 \
For ThinkPads and selected other laptops it provides a unified way \
to configure charge thresholds and re-calibrate the battery."
LICENSE = "GPL-2.0-or-later & GPL-3.0-or-later"

PV = "1.10.2"

RPM_NAME = "tlp-1.10.2-1.1.noarch.rpm"
RPM_HASH = "f0a6146e74df5a6a8a026adefafeeb779574c330cd6111bb6caf4924cf5c541df0287985fff245c6f7efa3e4f298e15f9ee437096e459610197b17729c9e5fd9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "config-tlp \
tlp"

RDEPENDS:${PN} += "/usr/bin/perl \
/usr/bin/sh \
hdparm \
iw \
pciutils \
rfkill \
systemd \
usbutils \
util-linux"

inherit rpm
