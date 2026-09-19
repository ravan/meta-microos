SUMMARY = "Wait for a port or a service to enter the requested state"
DESCRIPTION = "Wait4X is a lightweight, zero-dependency tool to wait for services to be ready. \
Perfect for CI/CD, containers, and local development."
LICENSE = "Apache-2.0"

PV = "3.7.1"

RPM_NAME = "wait4x-3.7.1-1.1.aarch64.rpm"
RPM_HASH = "64cc5c055123ce9a0f90a92b93139ea75fcc74d0efc3ddeb8f7a18d0c35c2a2b39eea0929397f7f588defec9e9792a665cfaf5625253a8f3398bad0789da4ed1"

RPROVIDES:${PN} += "wait4x"

RDEPENDS:${PN} += "libc.so.6"

inherit rpm
