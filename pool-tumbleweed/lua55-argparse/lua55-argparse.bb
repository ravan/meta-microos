SUMMARY = "A feature-rich command-line argument parser"
DESCRIPTION = "Argparse supports positional arguments, options, flags, optional \
arguments, subcommands and more. Argparse automatically generates usage, \
help, and error messages, and can generate shell completion scripts."
LICENSE = "MIT"

PV = "0.7.0"

RPM_NAME = "lua55-argparse-0.7.0-6.3.noarch.rpm"
RPM_HASH = "e2dd76e273a43088aca19cc2eac8b8df0d1fed9dc4cac878d97f455120a6660d6bda226a9cb4dfcbee87cdde349da3e58466f5a13a879d7b0bd96127f3b83843"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "lua55-argparse"

RDEPENDS:${PN} += "lua55"

inherit rpm
