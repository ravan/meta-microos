SUMMARY = "Locale and ISO 2022 support for Unicode terminals"
DESCRIPTION = "Luit is a filter that can be run between an arbitrary application and a \
UTF-8 terminal emulator. It will convert application output from the \
locale's encoding into UTF-8, and convert terminal input from UTF-8 into \
the locale's encoding."
LICENSE = "MIT"

PV = "20230201"

RPM_NAME = "luit-20230201-1.11.aarch64.rpm"
RPM_HASH = "9d2a98ad12612a43783473c363d0fd030d150268d3c5f6ee4a74e491fb8f4fc79242c357716b057aa51c4f5df5a63ddfa1014eea41d1c846a35faa3324379941"

RPROVIDES:${PN} += "luit"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libz.so.1"

inherit rpm
