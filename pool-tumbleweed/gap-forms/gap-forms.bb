SUMMARY = "GAP: Sesquilinear and quadratic forms"
DESCRIPTION = "This package can be used for work with sesquilinear and quadratic \
forms on finite vector spaces; objects that are used to describe \
polar spaces and classical groups. It provides: \
 \
* A way to create and use sesquilinear and quadratic forms on finite \
  vector spaces. \
* An operation which finds an isometry between two forms of the same \
  type. \
* An operation which returns the forms left invariant by a matrix \
  group."
LICENSE = "GPL-2.0-or-later"

PV = "1.3.0"

RPM_NAME = "gap-forms-1.3.0-1.2.noarch.rpm"
RPM_HASH = "8cb10a68b655f22e4c79ea791d38d13d48d17ef68a86362899d8f78572519d11fec3dc8829b8d18e4acd3b0b58fc649bdaf6499841e572cb0d82762ddbec14cf"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "gap-forms"

RDEPENDS:${PN} += "/usr/bin/bash \
gap-core"

inherit rpm
