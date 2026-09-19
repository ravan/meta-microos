SUMMARY = "Demonstrations and samples for bsh2"
DESCRIPTION = "Scripting for Java (BeanShell Version 2.x) (demo and samples)."
LICENSE = "LGPL-2.0-or-later | SPL-1.0"

PV = "2.1.1"

RPM_NAME = "bsh2-demo-2.1.1-2.9.noarch.rpm"
RPM_HASH = "61219e98bb9206dbbb5d49b4f3a67045c733614870d602c0730e702ca7ec9880e3636695b7a9c9baf7a61a358bc9cf0a008f475fd1ff54b3cad133e3946caf64"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "bsh2-demo"

RDEPENDS:${PN} += "bsh2"

inherit rpm
