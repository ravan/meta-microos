SUMMARY = "YaST2 - Package Manager Access"
DESCRIPTION = "This package contains a name space for accessing the package manager \
library in YaST2."
LICENSE = "GPL-2.0-only"

PV = "5.0.6"

RPM_NAME = "yast2-pkg-bindings-5.0.6-1.5.aarch64.rpm"
RPM_HASH = "e92bd2aca3c9ef158be180e56e5659817e7a3e5938061f863f5304d949c575b89f403fee70dd76ab1c1cb999caeb529adeedbf8f56765b55ad98b214aac2d138"

RPROVIDES:${PN} += "libpy2Pkg.so.2 \
yast2-pkg-bindings"

RDEPENDS:${PN} += "grep \
iproute2 \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libstdc++.so.6 \
liby2.so.4 \
liby2util.so.5 \
libycp.so.5 \
libzypp.so.1735"

inherit rpm
