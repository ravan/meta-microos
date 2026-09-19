SUMMARY = "Determine Web browser, version, and platform from an HTTP user agent string"
DESCRIPTION = "The HTTP::BrowserDetect object does a number of tests on an HTTP user agent \
string. The results of these tests are available via methods of the object. \
 \
For an online demonstration of this module's parsing, you can check out \
https://www.browserdetect.org/ \
 \
This module was originally based upon the JavaScript browser detection code \
available at \
http://www.mozilla.org/docs/web-developer/sniffer/browser_type.html."
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"

PV = "3.450.0"

RPM_NAME = "perl-HTTP-BrowserDetect-3.450.0-1.5.noarch.rpm"
RPM_HASH = "41f39cc2eb1a1413c06f85ab056b49a324d4d104b134fb3d54c182b61f83a03e06199dfb6a38cb4ab4bde75d7c4758280fb7fb9a7dd22a3dddec68242acd1f92"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-HTTP--BrowserDetect \
perl-HTTP-BrowserDetect"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.44.0"

inherit rpm
