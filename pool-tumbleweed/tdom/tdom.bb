SUMMARY = "A XML/DOM/XPath/XSLT Implementation for Tcl"
DESCRIPTION = "tDOM combines high performance XML data processing with easy and \
powerful Tcl scripting functionality. tDOM should be one of the fastest \
ways to manipulate XML with a scripting language and uses very few \
memory: for example, the DOM tree of the XML recommendation in XML \
(160K) needs only about 450K of memory."
LICENSE = "MPL-2.0"

PV = "0.9.6"

RPM_NAME = "tdom-0.9.6-1.6.aarch64.rpm"
RPM_HASH = "dfab7100153b52e5d4fab7bb580b2b341e0316d6c45b92990a123368e3e41f68bd22e60ba71b2a2883f50f8a2770b694f1739c43fd72b62ed0cdfd85290d9481"

RPROVIDES:${PN} += "libtdom0.9.6.so \
libtnc0.3.0.so \
tdom"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libexpat.so.1"

inherit rpm
