SUMMARY = "Library to read and write netrc files"
DESCRIPTION = "This library can read and update netrc files, preserving formatting including \
comments and whitespace."
LICENSE = "MIT"

PV = "0.11.0"

RPM_NAME = "ruby4.0-rubygem-netrc-0.11.0-1.43.aarch64.rpm"
RPM_HASH = "a786dfa3f2d32774d20f88aeb8959fdddc6f5334244a5e5e0fdb1208a93d29e5772b56ebd27f9cbd6246a613ed05122ac94e27351bea58ad97394d48e87726a5"

RPROVIDES:${PN} += "ruby4.0-rubygem-netrc \
rubygem-netrc \
rubygem-ruby-4.0.0-netrc \
rubygem-ruby-4.0.0-netrc-0 \
rubygem-ruby-4.0.0-netrc-0.11 \
rubygem-ruby-4.0.0-netrc-0.11.0"

RDEPENDS:${PN} += "ruby-abi"

inherit rpm
