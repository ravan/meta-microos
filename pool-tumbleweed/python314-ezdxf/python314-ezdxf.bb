SUMMARY = "Python package for manipulating DXF drawings"
DESCRIPTION = "A Python package to create and modify DXF drawings, independent from the \
DXF version."
LICENSE = "MIT"

PV = "1.4.4"

RPM_NAME = "python314-ezdxf-1.4.4-1.1.aarch64.rpm"
RPM_HASH = "12913e4e7d9929fd109bce632e5a0f634bc3f11c367302821e9e811f24696353ccf0d38f921526a9427875af6d79fb7f5d85015ac27694183cffa82ce64a4786"

RPROVIDES:${PN} += "python3.14dist-ezdxf \
python314-ezdxf \
python3dist-ezdxf"

RDEPENDS:${PN} += "/usr/bin/python3.14 \
/usr/bin/sh \
ld-linux-aarch64.so.1 \
libc.so.6 \
python-abi \
python314-fonttools \
python314-numpy \
python314-pyparsing \
python314-typing-extensions \
update-alternatives"

inherit rpm
