SUMMARY = "Plugin framework for desktop services"
DESCRIPTION = "Provides a plugin framework for handling desktop services. Services can \
be applications or libraries. They can be bound to MIME types or handled by \
application specific code."
LICENSE = "LGPL-2.1-or-later"

PV = "6.30.0"

RPM_NAME = "kf6-kservice-6.30.0-1.1.aarch64.rpm"
RPM_HASH = "aa35f1e5fd72eb77501f0eb48d645fe14f285a685fb5a162fa03faa02ff18de652929c3119aed5b4a5225d091c220c4d67ea3dca594d1d0d926b0a4ee4a90f71"

RPROVIDES:${PN} += "kf6-kservice"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libKF6CoreAddons.so.6 \
libKF6I18n.so.6 \
libKF6Service.so.6 \
libQt6Core.so.6 \
libc.so.6"

inherit rpm
