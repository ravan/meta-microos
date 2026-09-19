SUMMARY = "Python bindings for GlusterFS"
DESCRIPTION = "GlusterFS is a clustered file-system capable of scaling to several \
petabytes."
LICENSE = "GPL-2.0-only | LGPL-3.0-or-later"

PV = "11.1"

RPM_NAME = "python3-gluster-11.1-4.10.noarch.rpm"
RPM_HASH = "d0600b7d359c1c13c4968766cc92b474975f6fd34638ed874eb6581c36d3ae82ebc27ab64d23e8621e1a6b2d3b190a289d1876c9534a502cd071570428eb45eb"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-gluster"

RDEPENDS:${PN} += "python-abi"

inherit rpm
