SUMMARY = "Network information for QNetworkInformation using GNetworkMonitor"
DESCRIPTION = "Plugin using GNetworkMonitor to get network information such as the \
reachability, media type..."
LICENSE = "LGPL-2.1-with-Qt-Company-Qt-exception-1.1 | LGPL-3.0-only"

PV = "6.11.2"

RPM_NAME = "qt6-networkinformation-glib-6.11.2-2.1.aarch64.rpm"
RPM_HASH = "3c26323f64e19a8fd73e1a7966afe61876f8811d1345650fbca3325f0b820b1fd3eafec613d3861ea9d5327c0e0c91000137f65b1e93b97286223e2b4142bc6d"

RPROVIDES:${PN} += "libqglib.so \
qt6-networkinformation-glib"

RDEPENDS:${PN} += "libQt6Core.so.6 \
libQt6Network.so.6 \
libc.so.6 \
libgio-2.0.so.0 \
libgobject-2.0.so.0 \
libstdc++.so.6"

inherit rpm
