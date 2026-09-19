SUMMARY = "Debug sources for package cosmic-applets"
DESCRIPTION = "Debug sources for package cosmic-applets."
LICENSE = "GPL-3.0-only"

PV = "1.0.14"

RPM_NAME = "cosmic-applet-a11y-1.0.14-1.3.aarch64.rpm"
RPM_HASH = "89c604c1a4fc2339f165aa29caf52a217e0f9d0fdc2e4e51e3750c7fd3a003fb4ee80ea6851f0efdb115b22fdab2afab33bf8b38bbe1bba3258cd23960313622"

RPROVIDES:${PN} += "cosmic-applet-a11y"

RDEPENDS:${PN} += "cosmic-applets"

inherit rpm
