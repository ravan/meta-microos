SUMMARY = "QR Code generator library - Javadoc"
DESCRIPTION = "The Javadoc for the Java implementaion of the QR Code generator library"
LICENSE = "MIT"

PV = "1.8.0+git17.856ba8a"

RPM_NAME = "QR-Code-generator-javadoc-1.8.0+git17.856ba8a-3.6.aarch64.rpm"
RPM_HASH = "3c48090996a0784dec421bf9953fb09dbb933b091425bbf485f4a43eb446b1fc4993cd748a1bf9995b426a1b80e3087b238353892fa918bcd78de9187545bb13"

RPROVIDES:${PN} += "QR-Code-generator-javadoc"

RDEPENDS:${PN} += "javapackages-filesystem"

inherit rpm
