SUMMARY = "Brushes to be used with the MyPaint library"
DESCRIPTION = "This package contains brush files for use with MyPaint and other programs."
LICENSE = "CC0-1.0"

PV = "1.3.1"

RPM_NAME = "mypaint-brushes1-1.3.1-2.7.noarch.rpm"
RPM_HASH = "77c82eab14a4b0882138f1e2bbde6666a4f88648e6cb8bcaf7067221ccc811eaf3f572ff8f09439017b1e6805b59e2bd5cf15cfe63fdbb1cdd410303fc3ee436"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "mypaint-brushes \
mypaint-brushes1"

RDEPENDS:${PN} += ""

inherit rpm
