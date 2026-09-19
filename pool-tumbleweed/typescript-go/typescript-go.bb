SUMMARY = "Port of TypeScript compiler to go"
DESCRIPTION = "typescript-go is an experimental port of the TypeScript compiler to Go."
LICENSE = "Apache-2.0"

PV = "0.0.2075"

RPM_NAME = "typescript-go-0.0.2075-1.4.aarch64.rpm"
RPM_HASH = "406b2d50c8ae6478b531d93eebff83b15bbd57266f03f9f2de8941a0e08450e983e054e2aaa0966bd673318a4e542b252045cfd0303fea5d22a343b69ac36f96"

RPROVIDES:${PN} += "typescript-go"

RDEPENDS:${PN} += "libc.so.6"

inherit rpm
