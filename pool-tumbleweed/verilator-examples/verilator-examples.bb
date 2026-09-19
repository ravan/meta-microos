SUMMARY = "Examples for verilator"
DESCRIPTION = "Verilator is a compiling Verilog HDL simulator. \
 \
This package contains examples of using verilator."
LICENSE = "Artistic-2.0 | LGPL-3.0-only"

PV = "5.038"

RPM_NAME = "verilator-examples-5.038-1.6.noarch.rpm"
RPM_HASH = "b7a30f7b809a79d16125ac27f51041258f0fda4fa3cf185df2a1c9d663649c6bc4bf36bdb4882e9dd7cb601b6d440e3eaf30f5dbadd3dcceaec3d40f79c0126a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "verilator-examples"

RDEPENDS:${PN} += "verilator"

inherit rpm
