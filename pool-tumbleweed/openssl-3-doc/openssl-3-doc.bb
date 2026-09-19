SUMMARY = "Manpages and additional documentation for openssl"
DESCRIPTION = "This package contains optional documentation provided in addition to \
this package's base documentation."
LICENSE = "Apache-2.0"

PV = "3.5.3"

RPM_NAME = "openssl-3-doc-3.5.3-8.3.noarch.rpm"
RPM_HASH = "b92765481a6346a58e9102c0ff38587c17712e640cbf61a116c99df015072b2a406b52064ef051f4311c5846962ff0237e415285d4d64e0a661afc9dafc9d41f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "openssl-3-doc \
openssl-doc"

RDEPENDS:${PN} += ""

inherit rpm
