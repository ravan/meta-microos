SUMMARY = "A reliable logging library"
DESCRIPTION = "librelp is an easy to use library for the RELP protocol. RELP in turn provides \
reliable event logging over the network (and consequently RELP stands for \
Reliable Event Logging Protocol). RELP was initiated by Rainer Gerhards after \
he was finally upset by the lossy nature of plain tcp syslog and wanted a cure \
for all these dangling issues. \
 \
RELP (and hence) librelp assures that no message is lost, not even when \
connections break and a peer becomes unavailable. The current version of RELP \
has a minimal window of opportunity for message duplication after a session has \
been broken due to network problems. In this case, a few messages may be \
duplicated (a problem that also exists with plain tcp syslog). Future versions \
of RELP will address this shortcoming. \
 \
Please note that RELP is a general-purpose, extensible logging protocol. Even \
though it was designed to solve the urgent need of rsyslog-to-rsyslog \
communication, RELP supports many more applications. Extensible command verbs \
provide ample opportunity to extend the protocol without affecting existing \
applications."
LICENSE = "GPL-3.0-or-later"

PV = "1.13.0"

RPM_NAME = "librelp-devel-1.13.0-1.1.aarch64.rpm"
RPM_HASH = "38c22b19c9778daf58868a67ce8163f65ca5258b53cb339c7f266416e49ac6ad69ef3c1a114b2988809fdbefa0170c84b719bf7cfc126e1c0636536affc87726"

RPROVIDES:${PN} += "librelp-devel \
pkgconfig-relp"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libgnutls-devel \
librelp0 \
pkgconfig-openssl"

inherit rpm
