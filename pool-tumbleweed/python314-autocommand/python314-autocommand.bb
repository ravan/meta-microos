SUMMARY = "A library to create a command-line program from a function"
DESCRIPTION = "Autocommand turns a function into a command-line program. It converts the function's parameter \
signature into command-line arguments, and automatically runs the function if the module was \
called as __main__. In effect, it lets your create a smart main function."
LICENSE = "LGPL-3.0-only"

PV = "2.2.2"

RPM_NAME = "python314-autocommand-2.2.2-4.4.noarch.rpm"
RPM_HASH = "254814571a6bc56be3795b5e5385dff5dbb94ece8eb94ac054cd00cbb0fcf2fbbef4ef5acb8db539f6d366295fc30c9c1588d9e9ef21a669c27dd97f6bf85a97"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-autocommand \
python314-autocommand \
python3dist-autocommand"

RDEPENDS:${PN} += "python-abi"

inherit rpm
