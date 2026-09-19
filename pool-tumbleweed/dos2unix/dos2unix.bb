SUMMARY = "Text converters to and from DOS/MAC to UNIX"
DESCRIPTION = "Dos2unix is used to convert plain text from DOS (CR/LF) format. Mac2unix \
converts plain text from MAC (CR) format to UNIX format (LF). \
 \
Unix2dos converts plain text files from UNIX \
format to DOS format and unix2dos converts from UNIX to MAC format."
LICENSE = "BSD-2-Clause"

PV = "7.5.7"

RPM_NAME = "dos2unix-7.5.7-1.1.aarch64.rpm"
RPM_HASH = "e66bbc64f339fb05b87560730fb489b89f89cd0a532658c619d5458a1e37bd06dd57f987fb311a18ef59fff3dd9e64f23f0ffc44d90604cff40adde68fbfb7f2"

RPROVIDES:${PN} += "dos2unix \
unix2dos"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6"

inherit rpm
