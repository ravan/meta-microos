SUMMARY = "Static library for slicot"
DESCRIPTION = "This package provides the static library for slicot."
LICENSE = "BSD-3-Clause"

PV = "5.9"

RPM_NAME = "slicot-devel-static-5.9-1.8.aarch64.rpm"
RPM_HASH = "77b624e900f3eaf6ffc63f091922a8d03fc48ea02164f0aab732d7c820308a0d2dc0427bde7c1bfa4a912f90861a0b82b99825b73e294a9804939f36b5528af3"

RPROVIDES:${PN} += "slicot-devel-static"

RDEPENDS:${PN} += ""

inherit rpm
