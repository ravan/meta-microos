SUMMARY = "Redfish C Client Library"
DESCRIPTION = "libRedfish is a C client library that allows for Creation of Entities (POST), Read of Entities (GET), Update of Entities (PATCH), Deletion of Entities (DELETE), running Actions (POST), receiving events, and providing some basic query abilities."
LICENSE = "BSD-3-Clause"

PV = "1.3.8.0+git.f9a23c3"

RPM_NAME = "libredfish-1.3.8.0+git.f9a23c3-1.5.aarch64.rpm"
RPM_HASH = "86e02a38557d8b2f97a4ee70f8efdfbac5e62bd99000308a3ff1f98399993fd868d292f73862528e77020c2099ed6854bc05b4e5aa538e89cecb347160ffd4a3"

RPROVIDES:${PN} += "libredfish"

RDEPENDS:${PN} += "libc.so.6 \
libredfish.so.1 \
readline"

inherit rpm
