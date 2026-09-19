SUMMARY = "Library and tools to access Microsoft PFF/OFF/PST/OST/PAB files"
DESCRIPTION = "libpff is a library to access the Personal Folder File (PFF) and the \
Offline Folder File (OFF) format. These are used in several file \
Types: PAB (Personal Address Book), PST (Personal Storage Table) and \
OST (Offline Storage Table)."
LICENSE = "GFDL-1.1-or-later & LGPL-3.0-or-later & GFDL-1.3-or-later"

PV = "20231205"

RPM_NAME = "python313-libpff-20231205-2.30.aarch64.rpm"
RPM_HASH = "b2f052291c55796088a4d825e64d7ccefa40d7a84a5ea0dcf936c1d16762213c9a9a7c4ab6db101940f8d03f1be1dcfe0e8e6c7be1227bc033608162e8f06b05"

RPROVIDES:${PN} += "python3-libpff \
python313-libpff"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libbfio.so.1 \
libc.so.6 \
libcerror.so.1 \
libclocale.so.1 \
libpff.so.1 \
python-abi"

inherit rpm
