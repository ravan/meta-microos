SUMMARY = "mail client icon"
DESCRIPTION = "The KMail application icon that is shared with a number of applications"
LICENSE = "GPL-2.0-only"

PV = "26.08.1"

RPM_NAME = "kmail-application-icons-26.08.1-1.1.aarch64.rpm"
RPM_HASH = "4da7725569860ad670b81e9aebb38969ac27e89a5222f815090f27e1082272493c6ee57d9fd3e933c720c4cde4453015aed928f1ffccafadf376375763dc2efd"

RPROVIDES:${PN} += "kmail-application-icons"

RDEPENDS:${PN} += ""

inherit rpm
