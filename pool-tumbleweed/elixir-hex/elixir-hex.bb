SUMMARY = "Package manager for the Erlang VM"
DESCRIPTION = "Hex is package manager for the Erlang VM. \
 \
This project currently provides tasks that integrate with Mix, Elixir's build tool. \
 \
See http://hex.pm for installation instructions and other documentation."
LICENSE = "Apache-2.0"

PV = "2.1.1"

RPM_NAME = "elixir-hex-2.1.1-1.13.noarch.rpm"
RPM_HASH = "b0ed129ff1b47f7ead6adc507a990f6f7f0743ecd7c4fd2b2d574cb6ada3a225907f44ebe0c2317945c88a80479a7a2d995ae79ca3de0aab87af13a3ef29e6d2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "elixir-hex"

RDEPENDS:${PN} += "elixir"

inherit rpm
