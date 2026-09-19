SUMMARY = "IRCv3 bouncer"
DESCRIPTION = "Soju is an IRC bouncer. It connects to upstream IRC servers on \
behalf of the user to provide extra functionality and supports \
features such as multiple users, numerous IRCv3 extensions, \
chat history playback and detached channels. \
It is well-suited for both small and large deployments."
LICENSE = "AGPL-3.0-only"

PV = "0.10.1"

RPM_NAME = "soju-0.10.1-1.7.aarch64.rpm"
RPM_HASH = "ddd8a144d013a804a10ced9ea8da5a07b284f5bf0d222a3b124f1e4942bd927832097826d78ac9faae1cf76afbbbeb3467e62a2e344a95af0b5ff83ad29a92e1"

RPROVIDES:${PN} += "config-soju \
group-soju \
soju \
user-soju"

RDEPENDS:${PN} += "/usr/bin/sh \
libc.so.6 \
libpam.so.0 \
libsqlite3.so.0"

inherit rpm
