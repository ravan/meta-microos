SUMMARY = "Library and tools to access the OLE 2 Compound File (OLECF) format"
DESCRIPTION = "Library and tools to access the OLE 2 Compound File (OLECF) format. \
The OLE 2 Compound File format is used to store certain versions of \
Microsoft Office files, thumbs.db and other file formats."
LICENSE = "GFDL-1.3-or-later & LGPL-3.0-or-later"

PV = "20260526"

RPM_NAME = "python314-libolecf-20260526-1.12.aarch64.rpm"
RPM_HASH = "6083e375f198b3dd2413131585306bdad45f64b57a88540422d2a9dbefde8c718a1cb9ac9904ce7d3442ec4a7af83b7388b78b10bdf60a84a4a6493aab7c6e7b"

RPROVIDES:${PN} += "python314-libolecf"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libbfio.so.1 \
libc.so.6 \
libcerror.so.1 \
libclocale.so.1 \
libfguid.so.1 \
libolecf.so.1 \
python-abi"

inherit rpm
