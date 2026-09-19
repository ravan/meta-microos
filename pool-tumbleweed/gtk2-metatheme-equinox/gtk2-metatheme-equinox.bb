SUMMARY = "Equinox Metathemes for GTK+"
DESCRIPTION = "This package provides a set of elegant GTK+ themes that use the Equinox \
engine."
LICENSE = "GPL-2.0-or-later"

PV = "1.50"

RPM_NAME = "gtk2-metatheme-equinox-1.50-11.8.aarch64.rpm"
RPM_HASH = "1ca677dd6d8bc1c226ea8362480e27d1c632768298b3837bf7984bcc2e3a30719de206188f191e7b956132c0eae9d3acedfe255fd1b64a114092a45f9ac3d602"

RPROVIDES:${PN} += "gtk2-metatheme-equinox"

RDEPENDS:${PN} += "dmz-icon-theme-cursors \
faenza-icon-theme \
gtk2-engine-equinox"

inherit rpm
