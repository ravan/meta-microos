SUMMARY = "Library to parse MS Internet Explorer Cache Files"
DESCRIPTION = "libmsiecf is a library to parse MS Internet Explorer Cache Files."
LICENSE = "GFDL-1.3-or-later & LGPL-3.0-or-later"

PV = "20260525"

RPM_NAME = "python314-libmsiecf-20260525-1.11.aarch64.rpm"
RPM_HASH = "b44362542f7a44933b8f575c6d0fa11a37b30325498acbc6c462cf04be3c85065043729230bb54abfddaf2be523adcb40e08be788fe8893017ed362d66a38ddf"

RPROVIDES:${PN} += "python314-libmsiecf"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libbfio.so.1 \
libc.so.6 \
libcerror.so.1 \
libclocale.so.1 \
libmsiecf.so.1 \
python-abi"

inherit rpm
