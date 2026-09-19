SUMMARY = "Documentation for GTKWave"
DESCRIPTION = "GTKWave is a waveform viewer that can view VCD files produced by most Verilog \
simulation tools, as well as LXT files produced by certain Verilog simulation \
tools. \
 \
This package contains documentation for GTKWave"
LICENSE = "GPL-2.0-or-later"

PV = "3.3.126"

RPM_NAME = "gtkwave-doc-3.3.126-2.5.noarch.rpm"
RPM_HASH = "2a4e6ad4b51b179187e0c312e86e340a8cb38243103cbc1a6986e029343cd073e85c4d41cc4eb8ba46a8ac96972a9329269636a28ae63b9e2af189cc36f6ea32"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "gtkwave-doc"

RDEPENDS:${PN} += "gtkwave"

inherit rpm
