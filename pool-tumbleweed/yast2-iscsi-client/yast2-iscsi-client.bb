SUMMARY = "YaST2 - iSCSI Client Configuration"
DESCRIPTION = "This package contains the YaST2 component for configuration of an iSCSI \
client."
LICENSE = "GPL-2.0-only"

PV = "5.0.12"

RPM_NAME = "yast2-iscsi-client-5.0.12-1.2.noarch.rpm"
RPM_HASH = "cd0e5d65f92ae46769ce517ef2fe52393355ebdeabad21b47165908097e4d4ba96be5a07ff61208af27186a7744bec5121fbf34db72e16455fc96ebe77796f7b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "yast2-iscsi-client"

RDEPENDS:${PN} += "yast2 \
yast2-packager \
yast2-ruby-bindings"

inherit rpm
