SUMMARY = "Filesystem extended attributes for python"
DESCRIPTION = "This is a C extension module for Python which \
implements extended attributes manipulation. It is a wrapper on top \
of the attr C library - see attr(5)."
LICENSE = "LGPL-2.1-or-later"

PV = "0.8.1"

RPM_NAME = "python314-pyxattr-0.8.1-2.7.aarch64.rpm"
RPM_HASH = "6c71b11669872780d66e95ce0387a424bff10a6da8b787044ed5b31e0f22296b34857936fe2961d7a66f1b36919aa990fded23ebbfe75df0dfeac9c18ac71776"

RPROVIDES:${PN} += "python3.14dist-pyxattr \
python314-pyxattr \
python3dist-pyxattr"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
python-abi"

inherit rpm
