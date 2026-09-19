SUMMARY = "JSON module for Guile"
DESCRIPTION = "Guile-json is JSON module for Guile. It supports parsing and building \
JSON documents according to the http:://json.org specification. These \
are the main features: \
 \
- Strictly complies to http://json.org specification. \
- Build JSON documents programmatically via macros. \
- Unicode support for strings. \
- Allows JSON pretty printing."
LICENSE = "GPL-3.0-or-later"

PV = "4.7.3"

RPM_NAME = "guile-json-4.7.3-1.9.aarch64.rpm"
RPM_HASH = "e959a007806760328463cf92cdba059accb05a5bf34f3b81ca7331d785c8af011883dc0bcc507c2be32f74f3b6fd5a5a7cdace6a3a596da1b3db52427aecad24"

RPROVIDES:${PN} += "guile-json"

RDEPENDS:${PN} += "guile"

inherit rpm
