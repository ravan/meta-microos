SUMMARY = "Python bindings to libkdumpfile"
DESCRIPTION = "Python bindings to libkdumpfile"
LICENSE = "GPL-2.0-or-later"

PV = "0.5.5.1"

RPM_NAME = "python313-pykdumpfile-0.5.5.1-1.10.aarch64.rpm"
RPM_HASH = "39fe6c8d6b4e544f0eec91db58ff4c0700d034d8923de80d9162151b40009ba7e6259967b15e0c542c5ab2deca20c7cb8a43b73937e4314798e13a7906514a7e"

RPROVIDES:${PN} += "python3-libkdumpfile \
python3-pykdumpfile \
python3.13dist-pykdumpfile \
python313-libkdumpfile \
python313-pykdumpfile \
python3dist-pykdumpfile"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libaddrxlat.so.3 \
libc.so.6 \
libkdumpfile.so.12 \
python-abi \
python313-cffi"

inherit rpm
