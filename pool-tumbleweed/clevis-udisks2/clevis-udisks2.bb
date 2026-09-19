SUMMARY = "UDisks2 integration for Clevis"
DESCRIPTION = "Automatically unlock LUKS devices in UDisks2 with Clevis."
LICENSE = "GPL-3.0-or-later"

PV = "21"

RPM_NAME = "clevis-udisks2-21-1.6.aarch64.rpm"
RPM_HASH = "a7a6e431ed8a4b9efb99ba97c4cdeca78dbb0bbdaaabe7e5d3ca69e8c16d77b6b92e8f7c319046c24532cc5438f38a264605b8a978168f9a685c9a300f56a655"

RPROVIDES:${PN} += "clevis-udisks2"

RDEPENDS:${PN} += "clevis-luks \
ld-linux-aarch64.so.1 \
libaudit.so.1 \
libc.so.6 \
libcryptsetup.so.12 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libjansson.so.4 \
libluksmeta.so.0 \
libudisks2.so.0"

inherit rpm
