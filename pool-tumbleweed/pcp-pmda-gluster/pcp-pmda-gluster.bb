SUMMARY = "Performance Co-Pilot (PCP) metrics for the Gluster filesystem"
DESCRIPTION = "This package contains the PCP Performance Metrics Domain Agent (PMDA) for \
collecting metrics about the gluster filesystem."
LICENSE = "GPL-2.0+"

PV = "6.3.8"

RPM_NAME = "pcp-pmda-gluster-6.3.8-3.1.noarch.rpm"
RPM_HASH = "b498e248ae6310075bab524f287c12264be159ec848a698360b78761389edf495b2fcea4650779768db57ad24399c0d6f6979dba1598b353490ca934367c75fc"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "pcp-pmda-gluster"

RDEPENDS:${PN} += "/usr/bin/pmpython \
/usr/bin/sh \
python3-pcp"

inherit rpm
