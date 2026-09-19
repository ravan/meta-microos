SUMMARY = "Open vSwitch Documentation"
DESCRIPTION = "Contains additional documentation for the Open vSwitch."
LICENSE = "Apache-2.0"

PV = "3.7.1"

RPM_NAME = "openvswitch-doc-3.7.1-37.1.noarch.rpm"
RPM_HASH = "479f8b8ef13fdaed89306a93ed8137f87fe91e6d92cfe11e134ce81ff9950e36256daa332702210027cf039ca94ab83b71cec1104245727007c1e6e8b470901e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "openvswitch-doc"

RDEPENDS:${PN} += ""

inherit rpm
