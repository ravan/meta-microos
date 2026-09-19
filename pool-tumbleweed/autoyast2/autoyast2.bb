SUMMARY = "YaST2 - Automated Installation"
DESCRIPTION = "This package is intended for management of the control files and the \
AutoYaST2 configurations. This system should only be used by \
experienced system administrators. Warning: AutoYaST2 performs the \
installation without any user intervention, warnings, or confirmations \
(unless specified otherwise in the control file). \
 \
This file contains YaST2-independent files needed to create \
installation sources."
LICENSE = "GPL-2.0-only"

PV = "5.0.10"

RPM_NAME = "autoyast2-5.0.10-1.1.noarch.rpm"
RPM_HASH = "6b23369dfbe0c416360f29a61bbf9748fcdd1763494eba277cf01c97234287c5650ffc5170d68551b89285382c723ea4cf9d8f715d0797f538e429e8d8020727"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "autoyast2 \
yast2-config-autoinst \
yast2-lib-autoinst \
yast2-module-autoinst"

RDEPENDS:${PN} += "/usr/bin/mkdir \
/usr/bin/sh \
/usr/bin/touch \
autoyast2-installation \
fillup \
libxslt \
yast2 \
yast2-core \
yast2-country \
yast2-network \
yast2-ruby-bindings \
yast2-schema \
yast2-security \
yast2-storage-ng \
yast2-transfer \
yast2-xml"

inherit rpm
