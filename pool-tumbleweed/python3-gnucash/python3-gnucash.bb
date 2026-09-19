SUMMARY = "Python bindings for GnuCash"
DESCRIPTION = "This package provides the Python 3 bindings for development of GnuCash, \
a personal finance manager."
LICENSE = "LicenseRef-SUSE-GPL-2.0-with-openssl-exception | SUSE-GPL-3.0-with-openssl-exception"

PV = "5.16"

RPM_NAME = "python3-gnucash-5.16-1.1.aarch64.rpm"
RPM_HASH = "b58177a4dc822c17b329540e36347741629ebaa027a0363616ffcf4e963fd9f81fd3c7d2fa415880bf875a7c05019eb656f108c20830cf843797be45c7b94018"

RPROVIDES:${PN} += "python3-gnucash"

RDEPENDS:${PN} += "gnucash \
ld-linux-aarch64.so.1 \
libc.so.6 \
libglib-2.0.so.0 \
libgnc-app-utils.so \
libgnc-core-utils.so \
libgnc-engine.so \
libgobject-2.0.so.0 \
libpython3.13.so.1.0 \
python-abi"

inherit rpm
