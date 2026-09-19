SUMMARY = "Skeleton for openSUSE OSS Media Sets"
DESCRIPTION = "Internal package only, used for openSUSE OSS Media sets"
LICENSE = "MIT"

PV = "84.87.20240227.984e01a"

RPM_NAME = "skelcd-openSUSE-84.87.20240227.984e01a-1.11.aarch64.rpm"
RPM_HASH = "06e8e3e0bbfc85edd51513edca878f81b8d5f4a413e7fed8555490224ecb788b0d26903948ca939af4a006f58160cadfddf5999c9fbb1629470daa34b7b4c0b0"

RPROVIDES:${PN} += "skelcd-openSUSE"

RDEPENDS:${PN} += ""

inherit rpm
