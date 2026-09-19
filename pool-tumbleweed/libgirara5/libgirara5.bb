SUMMARY = "A graphical user interface library"
DESCRIPTION = "girara is a library that implements a user interface that focuses on \
simplicity and minimalism. Currently based on GTK+, \
it provides an interface that focuses on three main \
components: A so-called view widget that represents the actual \
application (e.g. a website (browser), an image (image viewer) or the \
document (document viewer)), an input bar that is used to execute \
commands of the application and the status bar which provides the user \
with current information. girara was designed to replace and enhance \
the user interface that is used by zathura and jumanji and other \
features that those applications share."
LICENSE = "Zlib"

PV = "2026.07.18"

RPM_NAME = "libgirara5-2026.07.18-1.2.aarch64.rpm"
RPM_HASH = "f01b6e365a5659041f9bd475912b6c2f13a38edb9403c2e98bda1fb8ab13f1a44c253c324749a7efe7d45382d3b2b021d34be0268571045e2a975d90cd65888d"

RPROVIDES:${PN} += "libgirara.so.5 \
libgirara5"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0"

inherit rpm
