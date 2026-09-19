SUMMARY = "A fast Go linters runner"
DESCRIPTION = "golangci-lint is a fast Go linters runner. It runs linters in parallel, uses \
caching, supports yaml config, has integrations with all major IDE and has \
dozens of linters included."
LICENSE = "GPL-3.0-only"

PV = "2.13.2"

RPM_NAME = "golangci-lint-2.13.2-1.1.aarch64.rpm"
RPM_HASH = "9f7afb887ca4924b2c2e4a69f841cd169bc187ffde1596cad85fdbc46f9eb4e22d384a5b7c26073465209e9f743199c16ff7f2b32f7cb1eb289c881717fe44ab"

RPROVIDES:${PN} += "golangci-lint"

RDEPENDS:${PN} += "libc.so.6"

inherit rpm
