SUMMARY = "Modern concurrency tools for Ruby. Inspired by Erlang, Clojure,"
DESCRIPTION = "Modern concurrency tools including agents, futures, promises, thread pools, \
actors, supervisors, and more. \
Inspired by Erlang, Clojure, Go, JavaScript, actors, and classic concurrency \
patterns."
LICENSE = "MIT"

PV = "1.3.5"

RPM_NAME = "ruby4.0-rubygem-concurrent-ruby-1.3.5-1.8.aarch64.rpm"
RPM_HASH = "4c83e5a6ba1412ae83f7ea4177e4a560925e5f866b8b391d81444c25358a473cb06e217fc549473a00c851951c816dacc3101966a0b7403294fb6d68ff62ecb1"

RPROVIDES:${PN} += "ruby4.0-rubygem-concurrent-ruby \
rubygem-concurrent-ruby \
rubygem-ruby-4.0.0-concurrent-ruby \
rubygem-ruby-4.0.0-concurrent-ruby-1 \
rubygem-ruby-4.0.0-concurrent-ruby-1.3 \
rubygem-ruby-4.0.0-concurrent-ruby-1.3.5"

RDEPENDS:${PN} += "ruby-abi"

inherit rpm
