SUMMARY = "LeechCraft Aggregator Web Interface Module"
DESCRIPTION = "WebAccess provides a basic web interface for the \
Aggregator feed reader, so one can read news \
articles from a mobile device or another machine."
LICENSE = "BSL-1.0"

PV = "0.6.70+git.18808.g3467692359"

RPM_NAME = "leechcraft-aggregator-webaccess-0.6.70+git.18808.g3467692359-3.1.aarch64.rpm"
RPM_HASH = "01accaabbca46eedb65dcc601f23e7da95e918ba83e85259c270cde007427bd9afc68fd967ff277d742e8e89240ae05992ed54baf33eb0c95fac83ccabeee4e5"

RPROVIDES:${PN} += "leechcraft-aggregator-webaccess \
libleechcraft-aggregator-webaccess.so"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
leechcraft-aggregator \
libQt6Core.so.6 \
libQt6Gui.so.6 \
libc.so.6 \
libgcc-s.so.1 \
libleechcraft-util-models-qt6.so.0.6.75 \
libleechcraft-util-qt6.so.0.6.75 \
libleechcraft-util-sys-qt6.so.0.6.75 \
libleechcraft-util-xsd-qt6.so.0.6.75 \
libleechcraft-xsd-qt6.so.0.6.75 \
libstdc++.so.6 \
libwt.so.4.12.6 \
libwthttp.so.4.12.6"

inherit rpm
