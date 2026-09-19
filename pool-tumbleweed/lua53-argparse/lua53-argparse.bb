SUMMARY = "A feature-rich command-line argument parser"
DESCRIPTION = "Argparse supports positional arguments, options, flags, optional \
arguments, subcommands and more. Argparse automatically generates usage, \
help, and error messages, and can generate shell completion scripts."
LICENSE = "MIT"

PV = "0.7.0"

RPM_NAME = "lua53-argparse-0.7.0-6.3.noarch.rpm"
RPM_HASH = "2a74be698d3708a04b31c7be1ab642f996fda1b87a53bb9b2c0965aa148a942a2c1e7194fde12854b20f876e86e9685cc497215ca48e4c390f9be4456d707081"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "lua53-argparse"

RDEPENDS:${PN} += "lua53"

inherit rpm
