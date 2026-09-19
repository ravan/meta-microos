SUMMARY = "GNU Privacy Assistant"
DESCRIPTION = "Gnu Privacy Assistant (GPA) is a graphical user interface for Gnu \
Privacy Guard (GPG) for displaying keyrings, manipulating keys, \
checking signatures, and signing, decrypting, and encrypting files."
LICENSE = "GPL-3.0-only"

PV = "0.11.1"

RPM_NAME = "gpa-0.11.1-1.5.aarch64.rpm"
RPM_HASH = "8820d5cba8c3991eacdeb13ae0ab9dc564cd89494580313a7e7fbd9e4692a2d49ea39dc4b62975a1f25ebb3edc3e4a140d9546c3242535bde0bc1bb7e2c00ed4"

RPROVIDES:${PN} += "gpa"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libassuan.so.9 \
libc.so.6 \
libgdk-3.so.0 \
libgdk-pixbuf-2.0.so.0 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libgpg-error.so.0 \
libgpgme.so.45 \
libgtk-3.so.0 \
libm.so.6 \
libz.so.1"

inherit rpm
