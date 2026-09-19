SUMMARY = "run build without aslr"
DESCRIPTION = "Run the build without aslr. Does not require root permissions."
LICENSE = "MIT"

PV = "0.5.5+0"

RPM_NAME = "reproducible-faketools-aslr-0.5.5+0-1.7.noarch.rpm"
RPM_HASH = "62c5c529d8760a3ce6949c1a7f8a66fe3efba9090bc3d3ed4027acc874cff63a7096fec5e41049388ab38045b8112db0402b0c90af8d769f0ecc0e878cd904b4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "reproducible-faketools-aslr"

RDEPENDS:${PN} += "reproducible-faketools-rpmbuild"

inherit rpm
