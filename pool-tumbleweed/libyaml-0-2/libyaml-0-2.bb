SUMMARY = "A YAML parser and emitter written in C"
DESCRIPTION = "This package holds the shared library of libyaml."
LICENSE = "MIT"

PV = "0.2.5"

RPM_NAME = "libyaml-0-2-0.2.5-2.14.aarch64.rpm"
RPM_HASH = "f498b37bcc503049594ed7f0710d4a704afd8119abb27a415d9c8adb0b3150c3fc488d8c91fb22578e48668bc3a1663e15e43db42b42b6f236fd50fe5acee0ea"

RPROVIDES:${PN} += "libyaml-0-2 \
libyaml-0.so.2"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6"

inherit rpm
