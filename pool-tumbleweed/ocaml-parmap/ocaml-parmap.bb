SUMMARY = "Multicore architecture exploitation for OCaml programs with minimal modifications"
DESCRIPTION = "If you want to use your many cores to accelerate an operation \
which happens to be a map, fold or map/fold (map-reduce), just use \
Parmap's parmap, parfold and parmapfold primitives in place of the \
standard List.map and friends; you can specify the number of \
subprocesses to use with the optional parameter ncores, and the \
size of granularity of the parallel computation with the optional \
parameter chunksize."
LICENSE = "LGPL-2.0-only"

PV = "1.2.5"

RPM_NAME = "ocaml-parmap-1.2.5-3.2.aarch64.rpm"
RPM_HASH = "63ece3d1208d38e221921ac44c9e26efbd4549a78ac15f0d7ec165232a31b43e2b63bea46cc532d11a86f6940bf422b33ab98b3c861704d2a7aaf63392000a54"

RPROVIDES:${PN} += "ocaml-parmap"

RDEPENDS:${PN} += "libc.so.6"

inherit rpm
