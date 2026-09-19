SUMMARY = "A library to create a command-line program from a function"
DESCRIPTION = "Autocommand turns a function into a command-line program. It converts the function's parameter \
signature into command-line arguments, and automatically runs the function if the module was \
called as __main__. In effect, it lets your create a smart main function."
LICENSE = "LGPL-3.0-only"

PV = "2.2.2"

RPM_NAME = "python313-autocommand-2.2.2-4.4.noarch.rpm"
RPM_HASH = "faee907f22b9f40bc0369400482ef23dd26f07a06ffbfc53040c2dde16aee31c300e1c070cc123cf23c21a5001e81898eb286e52392a3e1a05687fc14f7699f1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-autocommand \
python3.13dist-autocommand \
python313-autocommand \
python3dist-autocommand"

RDEPENDS:${PN} += "python-abi"

inherit rpm
