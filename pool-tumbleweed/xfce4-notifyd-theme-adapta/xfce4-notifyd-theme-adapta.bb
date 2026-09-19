SUMMARY = "Adapta Xfce4 notifyd themes"
DESCRIPTION = "Adapta is a GTK+ theme based on Material Design Guidelines that was \
created based on the Flat-Plat theme. \
 \
This package contains the Xfce4 notifyd themes."
LICENSE = "CC-BY-SA-4.0 & GPL-2.0-only"

PV = "3.95.0.11"

RPM_NAME = "xfce4-notifyd-theme-adapta-3.95.0.11-5.4.noarch.rpm"
RPM_HASH = "ab8b0a877de30ffdd896e1d077bea64ed336a9e98a1c0cb26ab88e30e3bfaa69a57481747c6133976deeb3be823db87fbf887380e38805e283e241a719290caf"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "xfce4-notifyd-theme-adapta"

RDEPENDS:${PN} += "metatheme-adapta-common \
xfce4-notifyd"

inherit rpm
