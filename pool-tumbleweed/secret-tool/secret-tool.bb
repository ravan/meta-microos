SUMMARY = "Store and retrieve passwords"
DESCRIPTION = "Secret-tool is a command line tool that can be used to store and \
retrieve passwords."
LICENSE = "LGPL-2.1-or-later"

PV = "0.21.7"

RPM_NAME = "secret-tool-0.21.7-2.4.aarch64.rpm"
RPM_HASH = "0498c6f80157c266be57392bdf7345b688fb2e19ce1b9e161400030403512969d4ab6472f7f35f6a31e6dd1e012cbdf41ef99bc367e63d492aeb0e1cca56f23d"

RPROVIDES:${PN} += "libsecret-tools \
secret-tool \
secret-tool-bash-completion"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libsecret-1.so.0"

inherit rpm
