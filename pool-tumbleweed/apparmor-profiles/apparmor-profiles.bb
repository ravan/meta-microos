SUMMARY = "AppArmor profiles that are loaded into the apparmor kernel module"
DESCRIPTION = "Base profiles. AppArmor is a file and network mandatory access control \
mechanism. AppArmor confines processes to the resources allowed by the \
systems administrator and can constrain the scope of potential security \
vulnerabilities. \
 \
This package is part of a suite of tools that used to be named \
SubDomain."
LICENSE = "GPL-2.0-only & LGPL-2.1-or-later"

PV = "5.0.2"

RPM_NAME = "apparmor-profiles-5.0.2-2.1.noarch.rpm"
RPM_HASH = "6e374047b6b87670d2f3adf707cb18393adfd80f93a67789f4586d62be648a2e00dd3b5e2f448419deaf1d878f5fdd4cbe8918fd279cabbb5f059be738dac2b5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "apparmor-profiles \
config-apparmor-profiles \
subdomain-profiles"

RDEPENDS:${PN} += "/usr/bin/sh \
apparmor-abstractions \
apparmor-parser-CAP-SYSLOG"

inherit rpm
