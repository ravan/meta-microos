SUMMARY = "Headers for building apps that use libredfish"
DESCRIPTION = "This package contains headers required to build applications that use libredfish."
LICENSE = "BSD-3-Clause"

PV = "1.3.8.0+git.f9a23c3"

RPM_NAME = "libredfish-devel-1.3.8.0+git.f9a23c3-1.5.aarch64.rpm"
RPM_HASH = "34b4bdc30c4d56d7390182f422a7ba33667a947b6e5bf4d8c56e27a1d61026bfb9b6619e3266faebc55690dc9683fe059baed8093d1ebbb384c816ebf46858e0"

RPROVIDES:${PN} += "libredfish-devel"

RDEPENDS:${PN} += "libredfish1"

inherit rpm
