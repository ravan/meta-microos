SUMMARY = "YaST2 - widget demo"
DESCRIPTION = "A YaST2 module to demonstrate the UI widgets and for style sheet testing"
LICENSE = "GPL-2.0-only | GPL-3.0-only"

PV = "0.9.1"

RPM_NAME = "yast2-widget-demo-0.9.1-1.22.noarch.rpm"
RPM_HASH = "8fd8d1a0701d70e671c772ee2ea99684f3c4a0459f87c592af449a7d3407a9d4a0e9dd70c37952f13be7d5c38b8b99f06dd2aaee540045697542cd824ec52bad"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "yast2-widget-demo"

RDEPENDS:${PN} += "yast2 \
yast2-ruby-bindings"

inherit rpm
