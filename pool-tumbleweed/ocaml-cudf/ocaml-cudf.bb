SUMMARY = "Ocaml CUDF library"
DESCRIPTION = "CUDF (for Common Upgradeability Description Format) is a format for describing upgrade scenarios in package-based Free and Open Source Software distribution. This is reference implementation in Ocaml."
LICENSE = "LGPL-3.0-or-later-with-OCaml-LGPL-linking-exception"

PV = "0.10"

RPM_NAME = "ocaml-cudf-0.10-5.2.aarch64.rpm"
RPM_HASH = "85ab548405a4f698cdb033a5adf9389e2e6a9e1bf93b37724d49e2896e444378d07c535ecdc6e6102bd7a8805b1916bb89503d4bc3d70296071f57828b0fbd4f"

RPROVIDES:${PN} += "ocaml-cudf"

RDEPENDS:${PN} += "libc.so.6 \
libm.so.6"

inherit rpm
