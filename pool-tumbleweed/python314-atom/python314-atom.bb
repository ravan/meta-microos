SUMMARY = "Memory efficient Python objects"
DESCRIPTION = "Atom is a framework for creating memory efficient Python objects with \
enhanced features such as dynamic initialization, validation, and \
change notification for object attributes. It provides the default \
model binding behaviour for the Enaml UI framework."
LICENSE = "BSD-3-Clause"

PV = "0.12.1"

RPM_NAME = "python314-atom-0.12.1-2.1.aarch64.rpm"
RPM_HASH = "62b491a613928f84d820222b2b426880c64111f8b266ef849f291f9be577860622a448399569b8e0269fc6df30ed8fb9d2b736a17e8ed518f7eba2daa2ffd357"

RPROVIDES:${PN} += "python3.14dist-atom \
python314-atom \
python3dist-atom"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libstdc++.so.6 \
python-abi"

inherit rpm
