SUMMARY = "Audio Library Tools REloaded"
DESCRIPTION = "ALURE is a utility library to help manage common tasks with OpenAL \
applications. This includes device enumeration and initialization, \
file loading, and streaming."
LICENSE = "LGPL-2.0-or-later"

PV = "1.2"

RPM_NAME = "alure-1.2-6.4.aarch64.rpm"
RPM_HASH = "7ba85a0ecc3c5b63fb2ffa3b52f9ab57f46d3a66e2c5438081ebeef1cc201f5ad489e97a5599d90053e652eaa1b000cc599b9f50032ea4696cf0cae2cbcb6e73"

RPROVIDES:${PN} += "alure"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libalure.so.1 \
libc.so.6 \
libopenal.so.1"

inherit rpm
