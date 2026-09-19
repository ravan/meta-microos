SUMMARY = "Modern and friendly alternative to GnuPG"
DESCRIPTION = "Enc is a CLI tool for encryption, a modern and friendly alternative to GnuPG. It is easy to use, secure by default and can encrypt and decrypt files using password or encryption keys, manage and download keys, and sign data. Our goal was to make encryption available to all engineers without the need to learn a lot of new words, concepts, and commands."
LICENSE = "MIT"

PV = "1.1.5"

RPM_NAME = "enc-1.1.5-2.4.aarch64.rpm"
RPM_HASH = "0bc59937bc475c3e0f4083e268718eb49d7355ad91294b7783d8f8b7f955c492c4c3895a5cf195542437c7d9a57c48d88f79a55ec569bbf7efd061bfa9857d9d"

RPROVIDES:${PN} += "enc"

RDEPENDS:${PN} += "libc.so.6"

inherit rpm
