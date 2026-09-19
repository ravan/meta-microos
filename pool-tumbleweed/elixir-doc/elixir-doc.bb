SUMMARY = "Documentation for elixir"
DESCRIPTION = "Documentation for the Elixir language."
LICENSE = "Apache-2.0"

PV = "1.20.4"

RPM_NAME = "elixir-doc-1.20.4-1.1.noarch.rpm"
RPM_HASH = "38a389b37d180d0763775cf8dcb981748edc80b6f8a9f89bede5081f4984ff527e16b770e1a1cd8b9ed8f790e864bd5b8cbc7d3e4726f2eb3e04dac2b24b1b74"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "elixir-doc"

RDEPENDS:${PN} += "elixir"

inherit rpm
