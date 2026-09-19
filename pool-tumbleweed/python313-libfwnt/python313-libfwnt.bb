SUMMARY = "Library for Windows NT data types"
DESCRIPTION = "Library to provide Windows NT data type support for the libyal family of libraries. \
libyal is typically used in digital forensic tools."
LICENSE = "GFDL-1.3-or-later & LGPL-3.0-or-later"

PV = "20260602"

RPM_NAME = "python313-libfwnt-20260602-1.5.aarch64.rpm"
RPM_HASH = "f55bfbf517a0808334f79035ef8e1d745d380344c46297c18982ae36180b1f19e6a3217d7c54f42e79d5fa7f27b8bc8ae609ae8923b00557b746f50aede5e060"

RPROVIDES:${PN} += "python3-libfwnt \
python313-libfwnt"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libcerror.so.1 \
libfwnt.so.1 \
python-abi"

inherit rpm
