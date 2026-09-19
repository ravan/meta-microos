SUMMARY = "X Session Manager"
DESCRIPTION = "xsm is a session manager. A session is a group of applications, each \
of which has a particular state. xsm allows you to create arbitrary \
sessions - for example, you might have a 'light' session, a 'development' \
session, or an 'xterminal' session. Each session can have its own set of \
applications. Within a session, you can perform a 'checkpoint' to save \
application state, or a 'shutdown' to save state and exit the session. When \
you log back in to the system, you can load a specific session, and you can \
delete sessions you no longer want to keep."
LICENSE = "MIT"

PV = "1.0.6"

RPM_NAME = "xsm-1.0.6-1.9.aarch64.rpm"
RPM_HASH = "0ff0685aa1552f1c7d78adbe2390c9228e4151c4d2672450ae01a61753d961456bce509194c7eef3bc24fd7e1b2b57121978a3bb64df87699529bb4323ff99f7"

RPROVIDES:${PN} += "xsm"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libICE.so.6 \
libSM.so.6 \
libX11.so.6 \
libXaw.so.7 \
libXt.so.6 \
libc.so.6 \
openssh"

inherit rpm
