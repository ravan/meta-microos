SUMMARY = "Influx data language"
DESCRIPTION = "Flux is a lightweight scripting language for querying databases (like InfluxDB) \
and working with data. It is part of InfluxDB 1.7 and 2.0, but can be run \
independently of those. This repository contains the language definition and an \
implementation of the language core."
LICENSE = "Apache-2.0 & MIT & (Apache-2.0 | MIT) & Apache-2.0-with-LLVM-exception & CC-BY-3.0 & CC-BY-SA-4.0 & (Apache-2.0 | BSL-1.0) & BSD-3-Clause & MPL-2.0 & Zlib & X11 & Unicode-DFS-2016 & Unicode-TOU"

PV = "0.199.0"

RPM_NAME = "libflux0_199_0-0.199.0-1.5.aarch64.rpm"
RPM_HASH = "26773fcf26db8f50ce6f2b1c0b8f693fb5c696840256ed77066cdcf5967240b669933387ca94a21cdf35b6055e257195532fc2e45f89a8dfca486b09432257fd"

RPROVIDES:${PN} += "libflux \
libflux.so.0.199.0 \
libflux0-199-0"

RDEPENDS:${PN} += "/sbin/ldconfig \
libc.so.6 \
libgcc-s.so.1"

inherit rpm
