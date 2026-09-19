SUMMARY = "Git credential backend using libsecret to access keyring"
DESCRIPTION = "A Git credential backend which uses libsecret API to acces keyrings such as \
kwallet or GNOME keyring."
LICENSE = "GPL-2.0-only"

PV = "2.55.0"

RPM_NAME = "git-credential-libsecret-2.55.0-3.2.aarch64.rpm"
RPM_HASH = "2b563803e8ef8ef6bd9ea0a6bb03ac7d726baf650a96f9adb38a4b1d39a7ae202dd984766fb1861b69b14f889c8c7f4ef1e566d9ef17fcba25dcb51d305af913"

RPROVIDES:${PN} += "git-credential-libsecret"

RDEPENDS:${PN} += "git-core \
ld-linux-aarch64.so.1 \
libc.so.6 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libsecret-1.so.0"

inherit rpm
