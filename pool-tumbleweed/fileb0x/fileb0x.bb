SUMMARY = "Tool to embed files in go applications"
DESCRIPTION = "A better customizable tool to embed files in go. \
 \
It is an alternative to `go-bindata` that have better features and organized configuration."
LICENSE = "MIT"

PV = "v1.1.1~git10.d54f404"

RPM_NAME = "fileb0x-v1.1.1~git10.d54f404-1.26.aarch64.rpm"
RPM_HASH = "cab54e50769275dc5c1bc72bd367a3e4ac37b0e7b02e921f952eff75e97db87f69e96daa57cfc79865735ff16b9dadf1cc7850171cdba03f0430fc5fd3517e02"

RPROVIDES:${PN} += "fileb0x"

RDEPENDS:${PN} += "libc.so.6"

inherit rpm
