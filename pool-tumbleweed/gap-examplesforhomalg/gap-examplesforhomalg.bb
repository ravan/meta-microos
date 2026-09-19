SUMMARY = "GAP: Examples for the homalg GAP Package"
DESCRIPTION = "The ExamplesForHomalg package provides example scripts for the homalg \
package that can be used with several computer algebra systems."
LICENSE = "GPL-2.0-only"

PV = "2025.12.01"

RPM_NAME = "gap-examplesforhomalg-2025.12.01-1.2.noarch.rpm"
RPM_HASH = "c9b17e6ee8e267aafe8051733e126ab3392a51e8f4d4a6739195d55fd29964eca24ce4997f7b6a862bf3bace415a74cd82243547d79b60745ab8e2eb00a78dd1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "gap-examplesforhomalg"

RDEPENDS:${PN} += "/usr/bin/sh \
gap-core \
gap-gapdoc \
gap-gaussforhomalg \
gap-homalg \
gap-homalgtocas \
gap-matricesforhomalg \
gap-modules \
gap-ringsforhomalg"

inherit rpm
