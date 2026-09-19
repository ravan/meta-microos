SUMMARY = "Framebuffer Terminal to Display Japanese Characters"
DESCRIPTION = "JFBTERM is a program to display Japanese Kanji characters using the \
framebuffer. Similar to the well-known program kon, it uses a terminal \
emulator on the console and hooks into its output. But JFBTERM does not \
use VGA (like kon does). It uses the framebuffer instead."
LICENSE = "BSD-3-Clause"

PV = "0.4.7"

RPM_NAME = "jfbterm-0.4.7-14.7.aarch64.rpm"
RPM_HASH = "7b17b00b5ad8e2f42e05aebc4cd9ae1f1571ba84c9123cd46fe6a6eb9aa453bed16a7ca9b4e65611dcc06cf5516be70ada70d0eb7cef6dc6a0138a96d7c495f3"

RPROVIDES:${PN} += "config-jfbterm \
jfbterm"

RDEPENDS:${PN} += "/usr/bin/cat \
/usr/bin/grep \
/usr/bin/sh \
group-tty \
ld-linux-aarch64.so.1 \
libc.so.6 \
libm.so.6 \
permissions"

inherit rpm
