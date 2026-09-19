SUMMARY = "Documentation for C OpenGL Mathematics"
DESCRIPTION = "This package contains documentation files for cglm."
LICENSE = "MIT"

PV = "0.9.6"

RPM_NAME = "cglm-devel-doc-0.9.6-1.4.noarch.rpm"
RPM_HASH = "259d3f745c65ff421c6e717e873ab521d520afef843df08819777ad840c742b1027d4d2604f647f7dbb2d8af50326a003da9a01c0e3f8844d621af6864023448"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "cglm-devel-doc"

RDEPENDS:${PN} += ""

inherit rpm
