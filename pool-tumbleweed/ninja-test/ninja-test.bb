SUMMARY = "A small build system closest in spirit to Make"
DESCRIPTION = "Ninja is yet another build system. It takes as input the interdependencies \
of files (typically source code and output executables) and orchestrates \
building them, quickly."
LICENSE = "Apache-2.0"

PV = "1.13.2"

RPM_NAME = "ninja-test-1.13.2-1.3.aarch64.rpm"
RPM_HASH = "fb9c55eaee4020c71a90c08dff8e1a6d2f61911f06fc418e5168c85db194f2f7e1c5ca38f31444fd761768d693c17c76c8464d1e2847580236b472e22d021482"

RPROVIDES:${PN} += "ninja-test"

RDEPENDS:${PN} += ""

inherit rpm
