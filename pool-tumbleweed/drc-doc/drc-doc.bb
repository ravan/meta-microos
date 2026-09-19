SUMMARY = "Documentation files for drc"
DESCRIPTION = "This package contains documentation for drc and Octave scripts to generate \
comparison graphs."
LICENSE = "GPL-3.0-or-later"

PV = "3.2.3"

RPM_NAME = "drc-doc-3.2.3-1.26.aarch64.rpm"
RPM_HASH = "663ff1bec3a9fe5008bbe09ea8f44f19a3c62e80cb588af583674d58de4fc5d020aed8620246c5cce1884384795ca9968128a1afea493cfbbb89f4ca9fbad003"

RPROVIDES:${PN} += "drc-doc"

RDEPENDS:${PN} += ""

inherit rpm
