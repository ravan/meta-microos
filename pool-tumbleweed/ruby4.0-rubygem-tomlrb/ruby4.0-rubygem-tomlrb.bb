SUMMARY = "A racc based toml parser"
DESCRIPTION = "A racc based toml parser."
LICENSE = "MIT"

PV = "2.0.3"

RPM_NAME = "ruby4.0-rubygem-tomlrb-2.0.3-1.19.aarch64.rpm"
RPM_HASH = "31085981422b6b5183441b21647c74962092b50ecb8f8baa808424277f84091ef817beead2de1c96477e50c22fdd4889a2ec89fe0fd9b42113a1fee45964963d"

RPROVIDES:${PN} += "ruby4.0-rubygem-tomlrb \
rubygem-ruby-4.0.0-tomlrb \
rubygem-ruby-4.0.0-tomlrb-2 \
rubygem-ruby-4.0.0-tomlrb-2.0 \
rubygem-ruby-4.0.0-tomlrb-2.0.3 \
rubygem-tomlrb"

RDEPENDS:${PN} += "ruby-abi"

inherit rpm
