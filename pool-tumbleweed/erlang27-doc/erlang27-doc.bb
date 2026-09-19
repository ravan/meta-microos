SUMMARY = "Erlang documentation"
DESCRIPTION = "Documentation for Erlang."
LICENSE = "Apache-2.0"

PV = "27.1.3"

RPM_NAME = "erlang27-doc-27.1.3-3.1.aarch64.rpm"
RPM_HASH = "dfb7b82f15e38c30cea5f70cb01a3364fa008143df0caf7822cdaf8f4710de0d5b322363f1d9cc402dbbdf648d4ec230f549490ca5e051e519d0991f12c6fea9"

RPROVIDES:${PN} += "erlang-doc \
erlang27-doc"

RDEPENDS:${PN} += "erlang27"

inherit rpm
