SUMMARY = "Python 3 bindings for libmodulemd"
DESCRIPTION = "This package provides the Python 3 bindings for libmodulemd."
LICENSE = "MIT"

PV = "2.15.2"

RPM_NAME = "python313-libmodulemd-2.15.2-2.3.aarch64.rpm"
RPM_HASH = "7a1f562dcd78f638b9e03eb07280c92b4cf44e51618472aeed569018fd48db7f60de45ce7499bf815aceceb1d87ec9660b1d9955963923fef9288e48e0810b88"

RPROVIDES:${PN} += "python3-libmodulemd \
python313-libmodulemd"

RDEPENDS:${PN} += "python-abi \
python313-gobject \
python313-six \
typelib-1-0-Modulemd-2-0 \
typelib-GLib \
typelib-Modulemd"

inherit rpm
