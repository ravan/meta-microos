SUMMARY = "MIME type definitions and documentation for libmirage"
DESCRIPTION = "libmirage provides uniform access to the data stored in different \
image formats by creating a representation of disc stored in image \
file. \
 \
This package contains the MIME type definitions and documentation."
LICENSE = "GPL-2.0-or-later"

PV = "3.3.2"

RPM_NAME = "libmirage-data-3.3.2-2.1.noarch.rpm"
RPM_HASH = "9d8525ca7724e92c77873da93fa4bf96818a68e398e42ab0ffb3196d91945f46b8be00d07d7e1d8de2783c4f0228c67f3301b2e0db66ca8c633e2f9902b9b888"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "libmirage-data"

RDEPENDS:${PN} += "/usr/bin/sh \
shared-mime-info"

inherit rpm
