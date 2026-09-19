SUMMARY = "This package includes the source files for Orthanc"
DESCRIPTION = "This package includes the source files for Orthanc. Use it in conjunction with the -devel package"
LICENSE = "GPL-3.0-or-later"

PV = "1.13.0"

RPM_NAME = "orthanc-source-1.13.0-1.2.noarch.rpm"
RPM_HASH = "fcd53324f2c2483ca231d0a8562058c9c6d3fe33b0d3b0e64ef32f71b7ec77e8485f434687813def14b081d5b9c7d25dcca688d7ce61d304bf550907568a7b4a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "orthanc-source"

RDEPENDS:${PN} += "/usr/bin/bash \
dcmtk"

inherit rpm
