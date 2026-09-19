SUMMARY = "Tools to work with documents in AbiWord file-format"
DESCRIPTION = "This package contains tools to work with documents in AbiWord file-format."
LICENSE = "MPL-2.0"

PV = "0.1.4"

RPM_NAME = "libabw-tools-0.1.4-1.3.aarch64.rpm"
RPM_HASH = "3709f82aaa576668cdf1c4611bdafd4ff3e12983f11c06a2353785ee224e7f56f1fd006933b13239522e545bec918ab24a490b86450770d3870eba8455282bbf"

RPROVIDES:${PN} += "libabw-tools"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libabw-0.1.so.1 \
libc.so.6 \
libgcc-s.so.1 \
librevenge-0.0.so.0 \
librevenge-generators-0.0.so.0 \
librevenge-stream-0.0.so.0"

inherit rpm
