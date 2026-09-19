SUMMARY = "SGML parser tools (development package)"
DESCRIPTION = "Libraries and includes to compile applications that use the SGML parser \
tools (package 'opensp')."
LICENSE = "MIT"

PV = "1.5.2"

RPM_NAME = "opensp-devel-1.5.2-205.3.aarch64.rpm"
RPM_HASH = "c056339dc147306ebc61a7f9b425d20f84dd11be7c7a99e00e9017e9d9ef80d94a1ddc2512c71ed4a041647514747b14ca82cc339c6a8298323caf4181b9aac7"

RPROVIDES:${PN} += "OpenSP-devel \
opensp-devel \
sp-devel"

RDEPENDS:${PN} += "glibc-devel \
libstdc++-devel \
opensp"

inherit rpm
