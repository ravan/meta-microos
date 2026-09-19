SUMMARY = "WASI libc implementation for WebAssembly"
DESCRIPTION = "WASI libc allows cross platform binaries to be created and executed on a variety of platforms"
LICENSE = "MIT"

PV = "32"

RPM_NAME = "wasi-libc-32-1.5.noarch.rpm"
RPM_HASH = "0a4b06a6042fec1b603ca0ed5d362a2cf7e44fe21bd22aa59dc54c8683e89a7e490f5429724acf2a2817fc7d62426697dfc1fbe1c31d66a3865bd401a242aab4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "wasi-libc"

RDEPENDS:${PN} += ""

inherit rpm
