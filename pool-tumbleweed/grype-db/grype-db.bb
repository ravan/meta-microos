SUMMARY = "A vulnerability scanner for container images and filesystems"
DESCRIPTION = "Application to create a Grype vulnerability database from upstream \
vulnerability data sources."
LICENSE = "Apache-2.0"

PV = "0.54.3"

RPM_NAME = "grype-db-0.54.3-1.1.aarch64.rpm"
RPM_HASH = "600c6c4f559aea0c1771ffc43aa9bb9c48210bf67d877ae620564127b0d12811c19f4f84679d33a4faf631ae9099d2f536bfc175efc9eb492a2ee7dcecdc0197"

RPROVIDES:${PN} += "grype-db"

RDEPENDS:${PN} += "libc.so.6"

inherit rpm
