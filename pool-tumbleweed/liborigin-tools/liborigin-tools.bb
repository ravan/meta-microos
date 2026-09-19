SUMMARY = "Converter for OriginLab OPJ project files"
DESCRIPTION = "Converter for OriginLab OPJ project files. \
Features: \
* reads any worksheets with all columns \
* supports 4.1, 5.0, 6.0, 6.1, 7.0, 7.5 projects"
LICENSE = "GPL-3.0-or-later"

PV = "3.0.3"

RPM_NAME = "liborigin-tools-3.0.3-1.5.aarch64.rpm"
RPM_HASH = "4845c2417bc51777c88f23729c1c668c7852a477561afa1a644578c5c32645dca6be4d751b05e0992308fe2645335ba225c18d4e53b4b57ef47a49baa0c33890"

RPROVIDES:${PN} += "liborigin-tools"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libm.so.6 \
liborigin.so.3 \
libstdc++.so.6"

inherit rpm
