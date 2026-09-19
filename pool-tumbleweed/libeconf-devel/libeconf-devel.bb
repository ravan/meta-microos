SUMMARY = "Development files for libeconf"
DESCRIPTION = "This package contains all necessary include files and libraries needed \
to develop applications that needs to read configuration files from \
different locations."
LICENSE = "MIT"

PV = "0.8.4"

RPM_NAME = "libeconf-devel-0.8.4-1.2.aarch64.rpm"
RPM_HASH = "21e6b7fe3de4a95b7af77b14f4453e288bab02ad72ffe96821af6c7d1af94d06f0a49f76463f9ee167196717713dd006797a849bd4d69dadbfb00c354bed69af"

RPROVIDES:${PN} += "libeconf-devel \
pkgconfig-libeconf"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libeconf0"

inherit rpm
