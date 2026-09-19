SUMMARY = "Library to access the File Vault Drive Encryption format"
DESCRIPTION = "libfvde is a library to access the File Vault Drive Encryption format."
LICENSE = "GFDL-1.3-or-later & LGPL-3.0-or-later"

PV = "20240502"

RPM_NAME = "python313-libfvde-20240502-2.20.aarch64.rpm"
RPM_HASH = "a52062b635a709038cd5b5780daae4bbafa5c2beecc760c261525dde6a17b890e795ffce41ece00e62d2e2d3d6bdea880db25f5ee38b179148e92bbfd9344f49"

RPROVIDES:${PN} += "python3-libfvde \
python313-libfvde"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libbfio.so.1 \
libc.so.6 \
libcerror.so.1 \
libfguid.so.1 \
libfvde.so.1 \
python-abi"

inherit rpm
