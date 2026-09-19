SUMMARY = "C/C++ function declaration translator"
DESCRIPTION = "Cdecl is a program which will turn English-like phrases such as \
'declare foo as array 5 of pointer to function returning int' into C \
declarations such as 'int (*foo[5])()' and vice-versa. It handles \
typecasts and C++ as well, and offers command line editing and \
history."
LICENSE = "GPL-3.0-or-later"

PV = "18.7.2"

RPM_NAME = "cdecl-18.7.2-1.3.aarch64.rpm"
RPM_HASH = "9f2dba7ca27b747d4d9f145c14619411e148be75d7fac522213fdfbd513c01f7320cc6936bee98d84e193126ba47f252899a8ec0fa1d6af3634ebabd9f13578e"

RPROVIDES:${PN} += "cdecl"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libreadline.so.8 \
libtinfo.so.6"

inherit rpm
