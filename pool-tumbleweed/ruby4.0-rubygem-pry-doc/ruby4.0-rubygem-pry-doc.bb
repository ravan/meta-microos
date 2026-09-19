SUMMARY = "Provides YARD and extended documentation support for Pry"
DESCRIPTION = "Pry Doc is a Pry REPL plugin. It provides extended documentation support for \
the REPL by means of improving the `show-doc` and `show-source` commands. With help \
of the plugin the commands are be able to display the source code and the docs \
of Ruby methods and classes implemented in C."
LICENSE = "MIT"

PV = "1.5.0"

RPM_NAME = "ruby4.0-rubygem-pry-doc-1.5.0-1.11.aarch64.rpm"
RPM_HASH = "0aa24c23d90f1e3f69ecf543ff589b95454de74a757743912b5e1f1f9c58fb9665c4f2fdde45f0069899b1a4bdadda8ca3660a6de27ae8651b13e2cdc8d9d2ab"

RPROVIDES:${PN} += "ruby4.0-rubygem-pry-doc \
rubygem-pry-doc \
rubygem-ruby-4.0.0-pry-doc \
rubygem-ruby-4.0.0-pry-doc-1 \
rubygem-ruby-4.0.0-pry-doc-1.5 \
rubygem-ruby-4.0.0-pry-doc-1.5.0"

RDEPENDS:${PN} += "etags \
ruby-abi \
rubygem-ruby-4.0.0-pry-0 \
rubygem-ruby-4.0.0-yard-0.9"

inherit rpm
