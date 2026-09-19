SUMMARY = "Compatibility metapackage for X.Org sample applications"
DESCRIPTION = "This package is a compatibility metapackage. It used to contain the \
X.Org sample applications."
LICENSE = "MIT"

PV = "7.6_1"

RPM_NAME = "xorg-x11-7.6_1-17.5.noarch.rpm"
RPM_HASH = "d9dee5fb116d8ff43464f56cd2cd03908db6a242fbfed19cecaed456fe9da0dd6addfb612a01faf723ce5db98549bff01c57bf93c117d40765df97007ea936a6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "XFree86 \
xorg-x11"

RDEPENDS:${PN} += "xorg-x11-essentials"

inherit rpm
