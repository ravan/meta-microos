SUMMARY = "Library and tools to access Microsoft PFF/OFF/PST/OST/PAB files"
DESCRIPTION = "libpff is a library to access the Personal Folder File (PFF) and the \
Offline Folder File (OFF) format. These are used in several file \
Types: PAB (Personal Address Book), PST (Personal Storage Table) and \
OST (Offline Storage Table)."
LICENSE = "GFDL-1.1-or-later & LGPL-3.0-or-later & GFDL-1.3-or-later"

PV = "20231205"

RPM_NAME = "python314-libpff-20231205-2.30.aarch64.rpm"
RPM_HASH = "3825ef7e8d77a5c86dcb31c2dc88863b87f6d47f8b240af2af0a7caceec1cdaba74449e9c65c9eb2a7c21460e3261bace004939c21af47f01310bb4f92184372"

RPROVIDES:${PN} += "python314-libpff"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libbfio.so.1 \
libc.so.6 \
libcerror.so.1 \
libclocale.so.1 \
libpff.so.1 \
python-abi"

inherit rpm
