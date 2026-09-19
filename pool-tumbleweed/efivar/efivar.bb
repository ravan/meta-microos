SUMMARY = "Tools to manage UEFI variables"
DESCRIPTION = "efivar provides a simple command line interface to the UEFI variable facility."
LICENSE = "LGPL-2.1-only"

PV = "38"

RPM_NAME = "efivar-38-3.9.aarch64.rpm"
RPM_HASH = "f8d2678d2fd12df0b5a549bffd6a9d7bff7340cea13ad2e8e08b0d251f6b65013febcaf06906efd668417957b7981c8a6dfd06790faa503feac9757842527c48"

RPROVIDES:${PN} += "efivar"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libefisec.so.1 \
libefivar.so.1 \
libefivar1"

inherit rpm
