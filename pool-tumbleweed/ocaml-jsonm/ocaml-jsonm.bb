SUMMARY = "Non-blocking streaming JSON codec for OCaml"
DESCRIPTION = "Jsonm is an OCaml non-blocking streaming codec to decode and encode the JSON \
data format. It can process JSON text without blocking on IO and without a \
complete in-memory representation of the data. \
 \
The uncut codec also processes whitespace and (non-standard) JSON with \
JavaScript comments."
LICENSE = "ISC"

PV = "1.0.2"

RPM_NAME = "ocaml-jsonm-1.0.2-4.1.aarch64.rpm"
RPM_HASH = "cc0eb2fa140cb293cf41bac1113a9b53ec610fdf824ab74f8410fc4692fe2a182d3150df623959381bb0c6110c1c42940127fcc6bf8ac95f5d0356d97fee93c3"

RPROVIDES:${PN} += "ocaml-jsonm"

RDEPENDS:${PN} += ""

inherit rpm
