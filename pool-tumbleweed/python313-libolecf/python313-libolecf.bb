SUMMARY = "Library and tools to access the OLE 2 Compound File (OLECF) format"
DESCRIPTION = "Library and tools to access the OLE 2 Compound File (OLECF) format. \
The OLE 2 Compound File format is used to store certain versions of \
Microsoft Office files, thumbs.db and other file formats."
LICENSE = "GFDL-1.3-or-later & LGPL-3.0-or-later"

PV = "20260526"

RPM_NAME = "python313-libolecf-20260526-1.12.aarch64.rpm"
RPM_HASH = "5611f1671fd8ba3a7fa290e6042b7e2ae6b1c61c3eccd36ab31e08ffdc12ab5a4594798ad1e880fdd395887d4a103743cffe310599708982f1aa71c90124bdda"

RPROVIDES:${PN} += "python3-libolecf \
python313-libolecf"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libbfio.so.1 \
libc.so.6 \
libcerror.so.1 \
libclocale.so.1 \
libfguid.so.1 \
libolecf.so.1 \
python-abi"

inherit rpm
