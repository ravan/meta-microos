SUMMARY = "HTTP web service mocking library"
DESCRIPTION = "uhttpmock is a project for mocking web service APIs which use HTTP or HTTPS. \
It provides a library, libuhttpmock, which implements recording and \
playback of HTTP request/response traces."
LICENSE = "LGPL-2.1-or-later"

PV = "0.11.0"

RPM_NAME = "typelib-1_0-Uhm-1_0-0.11.0-2.4.aarch64.rpm"
RPM_HASH = "48fc742825166b358d978efedfd8b0a8048a745dee428a821f52ed0d3621ef5b77f6f9f1f4c5045ce5769fc9f96ca0483abde813ccc0af5eb10d3e2f096a27f7"

RPROVIDES:${PN} += "typelib-1-0-Uhm-1-0 \
typelib-Uhm"

RDEPENDS:${PN} += "libuhttpmock-1.0.so.1 \
typelib-GLib \
typelib-GModule \
typelib-GObject \
typelib-Gio \
typelib-Soup"

inherit rpm
