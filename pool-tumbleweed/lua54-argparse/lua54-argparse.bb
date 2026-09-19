SUMMARY = "A feature-rich command-line argument parser"
DESCRIPTION = "Argparse supports positional arguments, options, flags, optional \
arguments, subcommands and more. Argparse automatically generates usage, \
help, and error messages, and can generate shell completion scripts."
LICENSE = "MIT"

PV = "0.7.0"

RPM_NAME = "lua54-argparse-0.7.0-6.3.noarch.rpm"
RPM_HASH = "78e46a1017877c8ee3cd1d6ea3cbbb94f375a300d68b436049a74928f206666ea75e35c5111206480d6d5b3ce27202a145c374d56c72642ddc83863713abb8ab"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "lua-argparse \
lua54-argparse"

RDEPENDS:${PN} += "lua54"

inherit rpm
