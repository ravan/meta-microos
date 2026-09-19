SUMMARY = "The calendar for the Pantheon Desktop"
DESCRIPTION = "A slim, lightweight Granite calendar app written in Vala, designed for \
Elementary OS where it is known simply as Calendar."
LICENSE = "GPL-3.0-or-later"

PV = "8.0.2"

RPM_NAME = "libelementary-calendar0-8.0.2-1.1.aarch64.rpm"
RPM_HASH = "862ff4f87e9b90de86ea8f91789efe8ffdc3142f34dca17b8d86e386e303c28e94938a9ad372b2752c02774d4021d4296160cda3eeea3765616423560af13b2c"

RPROVIDES:${PN} += "libelementary-calendar.so.0 \
libelementary-calendar0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libecal-2.0.so.3 \
libedataserver-1.2.so.27 \
libedataserverui-1.2.so.4 \
libgee-0.8.so.2 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgmodule-2.0.so.0 \
libgobject-2.0.so.0 \
libgranite.so.6 \
libgtk-3.so.0 \
libical-glib.so.3"

inherit rpm
