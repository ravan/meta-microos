SUMMARY = "CLI tool for visualization and analysis of profiling data"
DESCRIPTION = "pprof reads a collection of profiling samples in profile.proto format and generates reports to visualize and help analyze the data. \
It can generate both text and graphical reports (through the use of the dot visualization package)."
LICENSE = "Apache-2.0"

PV = "0.0.0+git20230820.407c9e7"

RPM_NAME = "pprof-0.0.0+git20230820.407c9e7-1.17.aarch64.rpm"
RPM_HASH = "cb3c8b122665fcf82f1367e6c3ef18ad20bd5ab71452c9f141a2a049813c327c13fbc2a3422ab7d5b13c41eaa9a18e89afc89e947e385928531de33826fdf00d"

RPROVIDES:${PN} += "pprof"

RDEPENDS:${PN} += "libc.so.6"

inherit rpm
