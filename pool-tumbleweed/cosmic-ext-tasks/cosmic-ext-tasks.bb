SUMMARY = "Task Management app for COSMIC DE"
DESCRIPTION = "Task Management app for COSMIC DE."
LICENSE = "GPL-3.0-only"

PV = "0.3.1"

RPM_NAME = "cosmic-ext-tasks-0.3.1-1.2.aarch64.rpm"
RPM_HASH = "4f2d8b2faad2f57e44a2f5c496c71a157203a6d48b611808a23a4dee2177ae1c9ab60a840aced0269dc29cc9194a6481ba23c1cfe519425fed1f2cafaa099d43"

RPROVIDES:${PN} += "cosmic-ext-tasks"

RDEPENDS:${PN} += "libc.so.6 \
libgcc-s.so.1 \
libm.so.6 \
libxkbcommon.so.0"

inherit rpm
