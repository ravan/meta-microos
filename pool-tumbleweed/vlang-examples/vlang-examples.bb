SUMMARY = "Examples for the V Programming Language"
DESCRIPTION = "V is a statically typed compiled programming language inspired \
by Go but with a more low-level approach, similar to C or Rust. \
 \
This package contains examples for the V Programming Language."
LICENSE = "MIT & BSD-2-Clause"

PV = "0.5.2"

RPM_NAME = "vlang-examples-0.5.2-3.1.noarch.rpm"
RPM_HASH = "c860baffd55c41a2da7c3b0414d33799e3989dc6174a3351a074d9c6ab2fa8377111f9fa2b9be27fc7d9e2bce26aa121153860e7e04464b2b8369143dec0f961"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "vlang-examples"

RDEPENDS:${PN} += ""

inherit rpm
