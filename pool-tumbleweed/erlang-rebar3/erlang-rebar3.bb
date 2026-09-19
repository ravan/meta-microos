SUMMARY = "Tool for working with Erlang projects"
DESCRIPTION = "Rebar3 is an Erlang tool that makes it easy to create, develop, and release \
Erlang libraries, applications, and systems in a repeatable manner. \
 \
Rebar3 is the spiritual successor to rebar 2.x, which was the first usable \
build tool for Erlang that ended up seeing widespread community adoption. It \
however had several shortcomings that made it difficult to use with larger \
projects or with teams with users new to Erlang."
LICENSE = "Apache-2.0"

PV = "3.23.0"

RPM_NAME = "erlang-rebar3-3.23.0-2.9.aarch64.rpm"
RPM_HASH = "1df3479ab0b78716f9465d2f1acdc1046716f7c6909de4b514464ed42220156adb51fdaa865f031ea0e9a99ee5b0a41ca7334c27ffd60a217b5f3c7ce7d08e07"

RPROVIDES:${PN} += "erlang-rebar3"

RDEPENDS:${PN} += "/usr/bin/escript \
erlang \
erlang-erlware-commons \
erlang-providers"

inherit rpm
