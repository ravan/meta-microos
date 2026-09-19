SUMMARY = "Go documentation"
DESCRIPTION = "Go examples and documentation."
LICENSE = "BSD-3-Clause"

PV = "1.25.14"

RPM_NAME = "go1.25-doc-1.25.14-1.1.aarch64.rpm"
RPM_HASH = "12f840b2ba91273518509f0006322a9311e8e63dc5f058e07f9e636de7c9e50e1371ae37dc0eabde072ed56c7af6c482a044466aa8ba460cd8cef26de298e8e5"

RPROVIDES:${PN} += "go-doc \
go1.25-doc"

RDEPENDS:${PN} += ""

inherit rpm
