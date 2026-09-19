SUMMARY = "Development files for glaze"
DESCRIPTION = "Glaze is a JSON library that reads/writes from/to object memory. It \
supports BEVE and CSV as well. \
 \
Glaze utilizes SIMD (SSE/AVX/NEON) and deals well with \
out-of-sequence data and missing keys. Based on an August 2024 \
measurement on an Apple M1 CPU, it was measured at 1224/1366 MB/s, \
outperforming other implementations like yyjson-0.10.0 by 10/35% and \
rapidjson-1.1.0 by 172/371% (read/write speeds, respectively). \
 \
This subpackage contains development files for glaze."
LICENSE = "MIT"

PV = "7.2.1"

RPM_NAME = "glaze-devel-7.2.1-1.3.noarch.rpm"
RPM_HASH = "ea4d91e0112f089df4f9cd806847696c36541d836172ea15eab39529d8165625b087f7e9670636a1b687eec0844b957a40e6b836a0a985b3b68517fe9414ca10"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "glaze-devel"

RDEPENDS:${PN} += ""

inherit rpm
