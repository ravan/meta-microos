SUMMARY = "The SeaMonkey DOM Inspector"
DESCRIPTION = "This is a tool that allows you to inspect the DOM for web pages in \
SeaMonkey. This is of great use to people who are doing SeaMonkey \
chrome development or web page development."
LICENSE = "MPL-2.0"

PV = "2.53.17.1"

RPM_NAME = "seamonkey-dom-inspector-2.53.17.1-4.1.aarch64.rpm"
RPM_HASH = "da97340c5dab22057192fb2388c5c9a0db4459bdf6b007e470299d559587d8356396d6707e9f3271b7dad38a3771c3bef0a9258b7c841c28b2eb2c14feee23af"

RPROVIDES:${PN} += "seamonkey-dom-inspector"

RDEPENDS:${PN} += "seamonkey"

inherit rpm
