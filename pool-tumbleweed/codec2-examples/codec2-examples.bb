SUMMARY = "Example code for Codec 2"
DESCRIPTION = "Example code for Codec 2, including test voices and matlab/octave files."
LICENSE = "LGPL-2.1-only"

PV = "1.2.0"

RPM_NAME = "codec2-examples-1.2.0-2.8.noarch.rpm"
RPM_HASH = "35fbd1bfac879c78c0949c35e066953e234153f90eeb1e5483839afb752c1bd290f565295823f8f12f33525a032590ef0d6a476c38c3411b347116c20bc32a78"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "codec2-examples"

RDEPENDS:${PN} += ""

inherit rpm
