SUMMARY = "Javadoc for auto"
DESCRIPTION = "This package contains javadoc for auto."
LICENSE = "Apache-2.0"

PV = "1.6.1"

RPM_NAME = "auto-javadoc-1.6.1-3.4.noarch.rpm"
RPM_HASH = "30dbb3c8694ed23be0c7b842d2fbf6843375dc4539e2490dc5691bfcdd779ab5adfb7aa338d06b308ae70c0ac9943b8d36c1d0533847f4e3d8f3d506a4c8ead1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "auto-javadoc"

RDEPENDS:${PN} += "javapackages-filesystem"

inherit rpm
