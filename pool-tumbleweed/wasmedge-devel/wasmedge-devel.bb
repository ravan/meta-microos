SUMMARY = "Development files for WasmEdge"
DESCRIPTION = "This package contains the header files and libraries needed for \
compiling programs using WasmEdge."
LICENSE = "Apache-2.0 & CC0-1.0"

PV = "0.16.1"

RPM_NAME = "wasmedge-devel-0.16.1-2.5.aarch64.rpm"
RPM_HASH = "862b49223eb1da70f3b332e36582be4a0fb8385a986ce914d8bf9f11688b4df0aa43fa1299fbd5ba20c4121ffc5bad03d4e3e8f261c893f11fc1d088d1754440"

RPROVIDES:${PN} += "wasmedge-devel"

RDEPENDS:${PN} += "libwasmedge0"

inherit rpm
