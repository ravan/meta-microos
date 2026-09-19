SUMMARY = "AppArmor abstractions and directory structure"
DESCRIPTION = "AppArmor abstractions (common parts used in various profiles) and \
the /etc/apparmor.d/ directory structure. \
 \
AppArmor is a file and network mandatory access control mechanism. \
AppArmor confines processes to the resources allowed by the systems \
administrator and can constrain the scope of potential security \
vulnerabilities. \
 \
This package is part of a suite of tools that used to be named \
SubDomain."
LICENSE = "GPL-2.0-only & LGPL-2.1-or-later"

PV = "5.0.2"

RPM_NAME = "apparmor-abstractions-5.0.2-2.1.noarch.rpm"
RPM_HASH = "70e6c582ebf05317b00acbb746cfdfbcfb723aaa8820766125daa57857c5a9ab355d235b3001709000f819cbc52cee933c8e50e79d237a5fbcd397d08cc7dee7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "apparmor-abstractions \
config-apparmor-abstractions"

RDEPENDS:${PN} += "/usr/bin/sh \
apparmor-parser-CAP-SYSLOG"

inherit rpm
