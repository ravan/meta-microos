SUMMARY = "A fast CSV toolkit written in Rust"
DESCRIPTION = "xsv is a command line program for indexing, slicing, analyzing, \
splitting and joining CSV files."
LICENSE = "MIT | Unlicense"

PV = "0.13.0"

RPM_NAME = "xsv-0.13.0-2.22.aarch64.rpm"
RPM_HASH = "5d6c3bfb7528539d7660d1835383ee8f84b4def04dbbcd361bb50dcc36e551c6b21ec9b78a8ea99752a8fb66a3011092238e4fb0a8adad2ec8c347b94fe22456"

RPROVIDES:${PN} += "xsv"

RDEPENDS:${PN} += "libc.so.6 \
libgcc-s.so.1"

inherit rpm
