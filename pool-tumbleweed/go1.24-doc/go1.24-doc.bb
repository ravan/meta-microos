SUMMARY = "Go documentation"
DESCRIPTION = "Go examples and documentation."
LICENSE = "BSD-3-Clause"

PV = "1.24.13"

RPM_NAME = "go1.24-doc-1.24.13-5.2.aarch64.rpm"
RPM_HASH = "085c66d6c488a99ec46f9e06d073b34ea097abb05da99c4f251537ca69e37ab44034113def196eba3b4d0736086302a4ec10447459eb2cc68bcbc3fd094c25fa"

RPROVIDES:${PN} += "go-doc \
go1.24-doc"

RDEPENDS:${PN} += ""

inherit rpm
