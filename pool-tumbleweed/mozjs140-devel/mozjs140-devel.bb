SUMMARY = "Development files and tools for mozjs140"
DESCRIPTION = "JavaScript is the Netscape-developed object scripting language used in millions \
of web pages and server applications worldwide. Netscape's JavaScript is a \
super set of the ECMA-262 Edition 3 (ECMAScript) standard scripting language, \
with only mild differences from the published standard. \
 \
This package contains the header file and tools to develop with JavaScript."
LICENSE = "MPL-2.0"

PV = "140.15.0"

RPM_NAME = "mozjs140-devel-140.15.0-1.1.aarch64.rpm"
RPM_HASH = "65f6d65767a585a981f1458e9e36a202cdc328b54151c7826de3abf2b603a56794fe87667b1f6af3179de29b4f162f0f3fc57a73a62ec43ecaa767eeb4985254"

RPROVIDES:${PN} += "mozjs140-devel \
pkgconfig-mozjs-140"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libmozjs-140-0 \
pkgconfig"

inherit rpm
