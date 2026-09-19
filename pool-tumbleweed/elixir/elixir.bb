SUMMARY = "Functional meta-programming aware language built atop Erlang"
DESCRIPTION = "Elixir is a functional meta-programming aware language built on top \
of the Erlang VM. It is a dynamic language with flexible syntax with \
macros support that leverage Erlang's abilities to build concurrent, \
distributed, fault-tolerant applications with hot code upgrades. \
 \
Elixir also provides first-class support for pattern matching, \
polymorphism via protocols (similar to Clojure's), aliases and \
associative data structures (usually known as dicts or hashes in \
other programming languages). \
 \
Finally, Elixir and Erlang share the same bytecode and data types. \
This means one can invoke Erlang code from Elixir (and vice-versa) \
without any conversion or performance impact."
LICENSE = "Apache-2.0"

PV = "1.20.4"

RPM_NAME = "elixir-1.20.4-1.1.noarch.rpm"
RPM_HASH = "55b0e4dde1f9f835e0d8cd6b5634ba472c30e061e811940af8554bec1c363bec25fd4f67174b207d39bfceb72ee1acb7153704e0d69ec2d4e476ce4b14f4671f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "elixir \
rpm-macro-elixir-dir \
rpm-macro-elixir-libdir \
rpm-macro-mix-compile"

RDEPENDS:${PN} += "/usr/bin/env \
/usr/bin/sh \
erlang"

inherit rpm
