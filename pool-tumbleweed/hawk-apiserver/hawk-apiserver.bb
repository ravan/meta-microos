SUMMARY = "Web server and API provider for Hawk"
DESCRIPTION = "This package contains the Hawk API server"
LICENSE = "GPL-3.0-or-later"

PV = "0.2.3+git.1787575068.680f9de"

RPM_NAME = "hawk-apiserver-0.2.3+git.1787575068.680f9de-1.1.aarch64.rpm"
RPM_HASH = "f47f3c8caa915e922e498684ded0e50cbcad95555094064b88eac586cf927b125ab6f6000a7359400cd96f5695e0c3c5e199833b4e6defed9ab1863ea9c5117c"

RPROVIDES:${PN} += "hawk-apiserver"

RDEPENDS:${PN} += "libc.so.6 \
libcib.so.54 \
libcrmcommon.so.68 \
libglib-2.0.so.0 \
libxml2.so.16 \
pacemaker"

inherit rpm
