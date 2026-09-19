SUMMARY = "Development files for debugbreak"
DESCRIPTION = "This package contains the header file needed to use debug_break."
LICENSE = "BSD-2-Clause"

PV = "1.0~git.20210702"

RPM_NAME = "debugbreak-devel-1.0~git.20210702-1.10.noarch.rpm"
RPM_HASH = "3cd899231512b3b0ed6217e9cfae283eeb20dd870e8f3fcae8f1e30ee83dd423b028a1b7d29fdf9583f586659e29a49e0f75cefaff55357edbc9b67cebd7fea1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "debugbreak-devel"

RDEPENDS:${PN} += "debugbreak"

inherit rpm
