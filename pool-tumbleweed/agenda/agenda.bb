SUMMARY = "Task Manager for Elementary"
DESCRIPTION = "A task manager for the Pantheon Desktop."
LICENSE = "GPL-3.0-or-later"

PV = "1.2.1"

RPM_NAME = "agenda-1.2.1-1.5.aarch64.rpm"
RPM_HASH = "b4ff270bc2161eb20857a4124b307b8948d7f38c0c9ffe90986db65e3760a504057b79ba8041da499634625e36a0c8dba0c82e7e4a5460b4321b547176b6890f"

RPROVIDES:${PN} += "agenda \
agenda-tasks"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libcairo.so.2 \
libgdk-3.so.0 \
libgee-0.8.so.2 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libgranite.so.6 \
libgtk-3.so.0 \
libpango-1.0.so.0 \
libpangocairo-1.0.so.0"

inherit rpm
