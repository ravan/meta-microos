SUMMARY = "Gradual screen dimmer"
DESCRIPTION = "A program that gradually dims the screen. \
It can be used to implement a grace period before locking the session."
LICENSE = "MIT"

PV = "git20230209.61ad53b"

RPM_NAME = "chayang-git20230209.61ad53b-1.12.aarch64.rpm"
RPM_HASH = "dca265bacd8a0c1fdfe834af796cb9ce2593e4ce58f16bfc70131d16eefaaafa5c078efca0dd1232da7a5f37560627b70ba3b7947ea7267d96151b0d1b66e3e1"

RPROVIDES:${PN} += "chayang"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libwayland-client.so.0"

inherit rpm
