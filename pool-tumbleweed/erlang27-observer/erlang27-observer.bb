SUMMARY = "A GUI tool for observing an erlang system"
DESCRIPTION = "The observer is gui frontend containing various tools to inspect a system. \
It displays system information, application structures, process information, \
ets or mnesia tables and a frontend for tracing with ttb."
LICENSE = "Apache-2.0"

PV = "27.1.3"

RPM_NAME = "erlang27-observer-27.1.3-3.1.aarch64.rpm"
RPM_HASH = "cbaca11476c34d827716239e36191e12b263560892965a8026bf51a42316b6b0969c84b9ac1bcebbf3681dd0e525972b2a890b7fad215f7e03d927a85bc47fcf"

RPROVIDES:${PN} += "erlang-observer \
erlang27-observer"

RDEPENDS:${PN} += "/usr/bin/sh \
erlang27 \
erlang27-wx"

inherit rpm
