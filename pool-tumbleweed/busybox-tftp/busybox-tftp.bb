SUMMARY = "Busybox applets replacing tftp"
DESCRIPTION = "This package contains the symlinks to provide tftp with busybox."
LICENSE = "GPL-2.0-or-later"

PV = "1.38.0"

RPM_NAME = "busybox-tftp-1.38.0-42.2.noarch.rpm"
RPM_HASH = "139fb2d42cc8d837ea5d6963aa2958e4e6a4b22ac653d51b8a9fefa8f5fe0e7566152482e0b9c85fac938f325ae5973f17c4169d798fe3977086e199ab77cce3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "busybox-tftp"

RDEPENDS:${PN} += "busybox"

inherit rpm
