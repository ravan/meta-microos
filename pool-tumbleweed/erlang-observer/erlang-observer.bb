SUMMARY = "A GUI tool for observing an erlang system"
DESCRIPTION = "The observer is gui frontend containing various tools to inspect a system. \
It displays system information, application structures, process information, \
ets or mnesia tables and a frontend for tracing with ttb."
LICENSE = "Apache-2.0"

PV = "28.5.0.4"

RPM_NAME = "erlang-observer-28.5.0.4-1.1.aarch64.rpm"
RPM_HASH = "5a39a5c47f27c022e1ed28d1da952a6ddfc7f74a70647518c3ca3fb11e7361fd0b30e76acfe677826bdc725a73a667c4d390eea23ad23adef5e8cd62489e081a"

RPROVIDES:${PN} += "erlang-observer"

RDEPENDS:${PN} += "/usr/bin/sh \
erlang \
erlang-wx"

inherit rpm
