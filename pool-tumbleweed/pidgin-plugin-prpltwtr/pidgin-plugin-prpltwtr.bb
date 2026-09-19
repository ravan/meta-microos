SUMMARY = "Libpurple/Pidgin plugin supporting microblogging"
DESCRIPTION = "This is a Pidgin plugin which treats microblogging sites \
GNU social, Twitter as IM protocols."
LICENSE = "GPL-2.0+"

PV = "0.14.0"

RPM_NAME = "pidgin-plugin-prpltwtr-0.14.0-2.9.aarch64.rpm"
RPM_HASH = "409a17d079e5ac686eee18f8a57f5f44f072c3e6916471d0cc9aafc06c03aea056aa895009350d191eb6d6379a648e26452a3b0772192f33f16f399342de85e1"

RPROVIDES:${PN} += "libgtkprpltwtr.so \
pidgin-plugin-prpltwtr"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libprpltwtr.so \
libpurple-plugin-prpltwtr \
libpurple.so.0 \
pidgin"

inherit rpm
