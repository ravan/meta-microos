SUMMARY = "Examples for GTKWave"
DESCRIPTION = "GTKWave is a waveform viewer that can view VCD files produced by most Verilog \
simulation tools, as well as LXT files produced by certain Verilog simulation \
tools. \
 \
This package contains examples for GTKWave"
LICENSE = "GPL-2.0-or-later"

PV = "3.3.126"

RPM_NAME = "gtkwave-examples-3.3.126-2.5.noarch.rpm"
RPM_HASH = "0e69e42a84237363a3b1350c25965bceaf601b9eccbd25d0896417055a33947ad9de6c67191391f7215d4effa20886be3aa9d20ca8464cf4160c2c6f21a674e6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "gtkwave-examples"

RDEPENDS:${PN} += "gtkwave"

inherit rpm
