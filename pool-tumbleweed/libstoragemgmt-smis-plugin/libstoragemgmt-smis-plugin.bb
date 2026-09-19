SUMMARY = "Files for SMI-S generic array support for libstoragemgmt"
DESCRIPTION = "The libstoragemgmt-smis-plugin package contains plug-in for generic \
Storage Management Initiative Specification (SMI-S) array support."
LICENSE = "GPL-2.0-or-later & LGPL-2.1-or-later"

PV = "1.10.3"

RPM_NAME = "libstoragemgmt-smis-plugin-1.10.3-1.3.noarch.rpm"
RPM_HASH = "bc28cc85749a638c6fc4727ff2e3a6a81fa5d3d469788ebb7ae98dec39ee4097c6fdcacff7f16538d29b4d04a01b39174d0e34e04962f472c4cb24bf10cd335e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "libstoragemgmt-smis-plugin"

RDEPENDS:${PN} += "/usr/bin/python3.13 \
/usr/bin/sh \
python-abi \
python3-libstoragemgmt \
python3-pywbem"

inherit rpm
