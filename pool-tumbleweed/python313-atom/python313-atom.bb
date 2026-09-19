SUMMARY = "Memory efficient Python objects"
DESCRIPTION = "Atom is a framework for creating memory efficient Python objects with \
enhanced features such as dynamic initialization, validation, and \
change notification for object attributes. It provides the default \
model binding behaviour for the Enaml UI framework."
LICENSE = "BSD-3-Clause"

PV = "0.12.1"

RPM_NAME = "python313-atom-0.12.1-2.1.aarch64.rpm"
RPM_HASH = "263831dcf40d147e9c4e72e46275fb4188dbdfbdf5aed557e9999a29bc46e37ed9336b7a6e4a5058fa4f8f6a2b669d555f28e93239ff32a6b8119cd554d6957d"

RPROVIDES:${PN} += "python3-atom \
python3.13dist-atom \
python313-atom \
python3dist-atom"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libstdc++.so.6 \
python-abi"

inherit rpm
