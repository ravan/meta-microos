SUMMARY = "A library for changing configuration files"
DESCRIPTION = "A library for programmatically editing configuration files. Augeas \
parses configuration files into a tree structure, which it exposes \
through its public API. Changes made through the API are written back \
to the initially read files. \
 \
The transformation works very hard to preserve comments and formatting \
details. It is controlled by ``lens'' definitions that describe the \
file format and the transformation into a tree."
LICENSE = "LGPL-2.1-or-later"

PV = "1.14.1"

RPM_NAME = "libaugeas0-1.14.1-2.6.aarch64.rpm"
RPM_HASH = "e64c8da527aa648c9bf4bfebcbec9152fb416c27e4457f143e81d3ea7e8f3a694883288b152821f872986adea98dacbcfbca4ac98b520c59167ad2fc41253f8a"

RPROVIDES:${PN} += "libaugeas.so.0 \
libaugeas0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libfa.so.1 \
libxml2.so.16"

inherit rpm
