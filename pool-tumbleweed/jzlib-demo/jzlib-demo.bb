SUMMARY = "Examples for jzlib"
DESCRIPTION = "Examples for jzlib."
LICENSE = "BSD-3-Clause"

PV = "1.1.3"

RPM_NAME = "jzlib-demo-1.1.3-6.9.noarch.rpm"
RPM_HASH = "0464a403fa8b075a6d0b37315c4aad6f3e8fc8288a5282995e1a3cc7c7bb416eff1c776d4d6d95b4dc0ad6223cad91bea33d3de0ce9a83e1ce045e3f0194680c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "jzlib-demo"

RDEPENDS:${PN} += "jzlib"

inherit rpm
