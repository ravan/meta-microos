SUMMARY = "LeechCraft OpenSearch Module"
DESCRIPTION = "This package contains an OpenSearch plugin for LeechCraft \
which provides a search client for OpenSearch-enabled web sites and engines. \
 \
Features: \
 * Support for autodiscovery of OpenSearch-capable web sites. \
 * Tagging of search engines. \
 * Support for queries to several search engines at once. \
 * Support search results in RSS/Atom format and subscribe to them \
with a suitable plugin like Aggregator. \
 * Show results in HTML format with a suitable plugin like Poshuku."
LICENSE = "BSL-1.0"

PV = "0.6.70+git.18808.g3467692359"

RPM_NAME = "leechcraft-seekthru-0.6.70+git.18808.g3467692359-3.1.aarch64.rpm"
RPM_HASH = "9d9f73ff847b3597011c6cd0bb6d17dccf357e318f32f22af8da3402549ddb1abbd3936f402f37f14707576ba2c65919762bf675f8bbc5ee1624aa0283595ab8"

RPROVIDES:${PN} += "leechcraft-seekthru \
libleechcraft-seekthru.so"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
leechcraft \
leechcraft-http \
leechcraft-summaryrepresentation \
libQt6Core.so.6 \
libQt6Gui.so.6 \
libQt6Widgets.so.6 \
libQt6Xml.so.6 \
libc.so.6 \
libgcc-s.so.1 \
libleechcraft-util-gui-qt6.so.0.6.75 \
libleechcraft-util-models-qt6.so.0.6.75 \
libleechcraft-util-qt6.so.0.6.75 \
libleechcraft-util-sll-qt6.so.0.6.75 \
libleechcraft-util-sys-qt6.so.0.6.75 \
libleechcraft-util-tags-qt6.so.0.6.75 \
libleechcraft-util-xpc-qt6.so.0.6.75 \
libleechcraft-xsd-qt6.so.0.6.75 \
libstdc++.so.6"

inherit rpm
