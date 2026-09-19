SUMMARY = "GAP: Matrices for the homalg project"
DESCRIPTION = "The MatricesForHomalg package provides lazy evaluated matrices with \
clever operations for the homalg project."
LICENSE = "GPL-2.0-only"

PV = "2026.04.01"

RPM_NAME = "gap-matricesforhomalg-2026.04.01-1.2.noarch.rpm"
RPM_HASH = "24a0f63586d9b25eda329223d1858510dac76af0e9b20308e6b5e93f450af2e780b21ddf1491592a93f8a3e6b79ea6e1e1f067691c795c50cb71afadf434fea9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "gap-matricesforhomalg"

RDEPENDS:${PN} += "/usr/bin/sh \
gap-core \
gap-gapdoc \
gap-toolsforhomalg"

inherit rpm
