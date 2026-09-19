SUMMARY = "XML document formatter"
DESCRIPTION = "xmlformat is a configurable formatter (or 'pretty-printer') for XML \
documents. It provides control over indentation, line-breaking, and text \
wrapping. These properties can be defined on a per-element basis. \
 \
xmlformat provides improved diagnostic information when a document is not \
well-formed. (Prints line and token number, and stack trace). \
 \
Based on Kitebird's original implementation v1.04"
LICENSE = "BSD-3-Clause & GPL-3.0-only"

PV = "1.9"

RPM_NAME = "xmlformat-1.9-1.20.noarch.rpm"
RPM_HASH = "790f7b4df57f60cc18a5c203b4f5945c2676f62326b982187f6da6f403b3782c80943037551606817246caf3dc1faad062f8b8d66779fe49de6f2c78fef481cf"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "xmlformat"

RDEPENDS:${PN} += "/usr/bin/perl \
/usr/bin/ruby \
/usr/bin/sh \
update-alternatives"

inherit rpm
