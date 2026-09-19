SUMMARY = "A feature-rich command-line argument parser"
DESCRIPTION = "Argparse supports positional arguments, options, flags, optional \
arguments, subcommands and more. Argparse automatically generates usage, \
help, and error messages, and can generate shell completion scripts."
LICENSE = "MIT"

PV = "0.7.0"

RPM_NAME = "luajit-argparse-0.7.0-6.3.noarch.rpm"
RPM_HASH = "6207cae56d32f20bcaa804b651a957f1f18f8c2c111f7de0698114443c0f06cc3aabf6fbfe35b85d40fb77c85b80db7d675ae15eb9318f7b1f0580d2d901b20d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "luajit-argparse"

RDEPENDS:${PN} += "luajit"

inherit rpm
