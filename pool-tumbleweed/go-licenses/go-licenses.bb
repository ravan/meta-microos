SUMMARY = "CLI tool to report the licenses used by a Go package and its dependencies"
DESCRIPTION = "go-licenses analyzes the dependency tree of a Go package/binary. It can output a \
report on the libraries used and under what license they can be used. It can \
also collect all of the license documents, copyright notices and source code \
into a directory in order to comply with license terms on redistribution."
LICENSE = "Apache-2.0"

PV = "2.0.1"

RPM_NAME = "go-licenses-2.0.1-1.8.aarch64.rpm"
RPM_HASH = "67fc99008dcbc97ed540cb5f9bd0f86101e9c50be692c27e45988af2499e08ba96636a0685f532b2520f62fdc7e2e42e919c97ae58432891bb3df7a1de105efa"

RPROVIDES:${PN} += "go-licenses"

RDEPENDS:${PN} += "libc.so.6"

inherit rpm
