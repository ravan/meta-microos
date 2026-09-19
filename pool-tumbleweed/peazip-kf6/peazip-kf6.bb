SUMMARY = "KF6 servicemenu for peazip"
DESCRIPTION = "PeaZip is a file and archive manager GUI for many formats. \
This subpackage contains the KF6 integration."
LICENSE = "LGPL-3.0-only"

PV = "11.2.0"

RPM_NAME = "peazip-kf6-11.2.0-2.1.noarch.rpm"
RPM_HASH = "216fa4a44801607c861c6d3ea2de8ac475a9218f6a167a0fb5c0b262ad376f9be9474ddda5b3d79f62c0fc6ec2c7c0dd0201a48fb6e2073b59ac945f0f2a1019"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "peazip-kf6"

RDEPENDS:${PN} += "peazip"

inherit rpm
