SUMMARY = "Python Bindings for babeltrace"
DESCRIPTION = "This project provides trace read and write libraries, as well as a \
trace converter. A plugin can be created for any trace format to \
allow its conversion to/from another trace format. \
 \
Python Bindings for the babeltrace package."
LICENSE = "GPL-2.0-only & MIT"

PV = "1.5.8"

RPM_NAME = "python3-babeltrace-1.5.8-4.9.aarch64.rpm"
RPM_HASH = "690dc888ccab8a2082880c32f9dad35a6d9b57420d5ed927630a28958e6cea4d80c7ff0f8d779dd2bf72466c3b436692d67c4203ec2ddec465bc8dfe3a0a0774"

RPROVIDES:${PN} += "python3-babeltrace \
python3.13dist-babeltrace \
python3dist-babeltrace"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libbabeltrace-ctf.so.1 \
libbabeltrace.so.1 \
libc.so.6 \
python-abi"

inherit rpm
