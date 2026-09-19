SUMMARY = "Injected bundles for webkitgtk3"
DESCRIPTION = "WebKit is a web content engine, derived from KHTML and KJS from KDE, \
and used primarily in Apple's Safari browser.  It is made to be \
embedded in other applications, such as mail readers, or web browsers. \
 \
It is able to display content such as HTML, SVG, XML, and others. It \
also supports DOM, XMLHttpRequest, XSLT, CSS, Javascript/ECMAscript and \
more."
LICENSE = "BSD-3-Clause & LGPL-2.0-or-later"

PV = "2.52.6"

RPM_NAME = "webkit2gtk-4_1-injected-bundles-2.52.6-1.2.aarch64.rpm"
RPM_HASH = "b579f506f3fec4110cead2c810efbe77b5ae3a4e724a276334413e5cd20e7f99dfef3e4782adfcf0ab1c5e2027208ca06cdd081354c07d338a43a3b0f016f014"

RPROVIDES:${PN} += "libwebkit2gtkinjectedbundle.so \
webkit2gtk-4-1-injected-bundles"

RDEPENDS:${PN} += "libc.so.6 \
libwebkit2gtk-4.1.so.0"

inherit rpm
