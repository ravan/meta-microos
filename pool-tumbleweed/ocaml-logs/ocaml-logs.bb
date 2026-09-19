SUMMARY = "Logging infrastructure for OCaml"
DESCRIPTION = "Logs provides a logging infrastructure for OCaml. Logging is performed on sources whose reporting level can be set independently. Log message report is decoupled from logging and is handled by a reporter. \
 \
A few optional log reporters are distributed with the base library and the API easily allows to implement your own."
LICENSE = "ISC"

PV = "0.10.0"

RPM_NAME = "ocaml-logs-0.10.0-1.3.aarch64.rpm"
RPM_HASH = "b346c92d8631822e4c187ebee6e133c3a19213d234b9a624196dc2aec1cf6fb2581575e54eed9a52902710a77e40f10192b32c9ae755d82c22628a2c8acb33a6"

RPROVIDES:${PN} += "ocaml-logs"

RDEPENDS:${PN} += ""

inherit rpm
