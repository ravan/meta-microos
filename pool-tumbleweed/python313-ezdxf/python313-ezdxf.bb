SUMMARY = "Python package for manipulating DXF drawings"
DESCRIPTION = "A Python package to create and modify DXF drawings, independent from the \
DXF version."
LICENSE = "MIT"

PV = "1.4.4"

RPM_NAME = "python313-ezdxf-1.4.4-1.1.aarch64.rpm"
RPM_HASH = "cadc79a2550c0fe47b82c32e8d4f674c26774397a9bbce4296cce4211cf1b9e6752665688ba1d38fff1b9485d28324df8720f08493995f445d31e6567daea2ec"

RPROVIDES:${PN} += "python3-ezdxf \
python3.13dist-ezdxf \
python313-ezdxf \
python3dist-ezdxf"

RDEPENDS:${PN} += "/usr/bin/python3.13 \
/usr/bin/sh \
ld-linux-aarch64.so.1 \
libc.so.6 \
python-abi \
python313-fonttools \
python313-numpy \
python313-pyparsing \
python313-typing-extensions \
update-alternatives"

inherit rpm
