SUMMARY = "Injected bundles for webkitgtk4"
DESCRIPTION = "WebKit is a web content engine, derived from KHTML and KJS from KDE, \
and used primarily in Apple's Safari browser.  It is made to be \
embedded in other applications, such as mail readers, or web browsers. \
 \
It is able to display content such as HTML, SVG, XML, and others. It \
also supports DOM, XMLHttpRequest, XSLT, CSS, Javascript/ECMAscript and \
more."
LICENSE = "BSD-3-Clause & LGPL-2.0-or-later"

PV = "2.52.6"

RPM_NAME = "webkitgtk-6_0-injected-bundles-2.52.6-1.2.aarch64.rpm"
RPM_HASH = "b95d7c7f27eb9ee24bd7d702599531fcae1b0381a14a0a1c2d45e84a0b629396908d5fa48df57a380d6affc5802e8d88be894dfcf5d76cc40e3e57b04e87dce2"

RPROVIDES:${PN} += "libwebkitgtkinjectedbundle.so \
webkitgtk-6-0-injected-bundles"

RDEPENDS:${PN} += "libc.so.6 \
libwebkitgtk-6.0.so.4"

inherit rpm
