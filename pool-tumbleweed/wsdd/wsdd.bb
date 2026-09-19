SUMMARY = "A Web Service Discovery host daemon"
DESCRIPTION = "wsdd implements a Web Service Discovery host daemon. This enables (Samba) hosts, \
like your local NAS device, to be found by Web Service Discovery Clients like Windows. \
 \
Since NetBIOS discovery is not supported by Windows anymore, wsdd makes hosts to \
appear in Windows again using the Web Service Discovery method. This is beneficial \
for devices running Samba, like NAS or file sharing servers on your local network."
LICENSE = "MIT"

PV = "0.9"

RPM_NAME = "wsdd-0.9-2.3.noarch.rpm"
RPM_HASH = "be417fc4a8454bdb256e67722237a8fd757740961d849f83f477eca4a8a19a381b51d9dd8af4944f9fb51b04e20b932f8faca834e6e722855bd7b966eb28d54c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "group-wsdd \
user-wsdd \
wsdd"

RDEPENDS:${PN} += "/usr/bin/mkdir \
/usr/bin/python3 \
/usr/bin/sh \
/usr/bin/touch \
fillup \
sysuser-shadow"

inherit rpm
