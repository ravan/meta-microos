SUMMARY = "Icarus Verilog development files"
DESCRIPTION = "This package contains necessary header files for Icarus Verilog"
LICENSE = "GPL-2.0-or-later"

PV = "13.0"

RPM_NAME = "iverilog-devel-13.0-1.4.aarch64.rpm"
RPM_HASH = "fe00ccc142eabe42bf7b0eb7340b1646dd925e8c059b65280a85866f4869d345e8c97c657d51d200da3026186b6deaa925a174c906c52a8d84639675b213287b"

RPROVIDES:${PN} += "iverilog-devel"

RDEPENDS:${PN} += "iverilog"

inherit rpm
