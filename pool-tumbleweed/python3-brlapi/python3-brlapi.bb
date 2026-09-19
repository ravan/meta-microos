SUMMARY = "Library to use BRLTTY from applications -- Python Bindings"
DESCRIPTION = "BrlAPI is a service provided by the brltty daemon. \
 \
Its purpose is to allow programmers to write applications that take \
advantage of a braille terminal in order to deliver a blind user \
suitable information for his/her specific needs. \
 \
While an application communicates with the braille terminal, everything \
brltty sends to the braille terminal in the application's console is \
ignored, whereas each piece of data coming from the braille terminal is \
sent to the application, rather than to brltty."
LICENSE = "LGPL-2.1-or-later"

PV = "6.9.1"

RPM_NAME = "python3-brlapi-6.9.1-2.1.aarch64.rpm"
RPM_HASH = "8083f2d567f472059178728b651f96ad585b2cc89d365bc88b50c27131f68be1f39c50cf0065413b76441b25111488e8f453d9bd64a303e0c086a9594c45eb1a"

RPROVIDES:${PN} += "python3-brlapi \
python3.13dist-brlapi \
python3dist-brlapi"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libbrlapi.so.0.8 \
libc.so.6 \
python-abi"

inherit rpm
