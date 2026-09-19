SUMMARY = "The binfmt_misc support for Java"
DESCRIPTION = "Linux beats them ALL! While all other OS's are TALKING about direct \
support of Java Binaries in the OS, Linux is doing it! \
 \
You can execute Java applications and Java Applets just like any other \
program after you have installed this package."
LICENSE = "GPL-2.0-only"

PV = "1.4"

RPM_NAME = "java-binfmt-misc-1.4-10.6.aarch64.rpm"
RPM_HASH = "ef7e62c8431980091bc4c8ccf2f299629d609978ea5866fd75a94d9593a0feae89243299b0ba7bd52c75c81e4083ea02d21f0103ae120ca25e02fc5aeab09211"

RPROVIDES:${PN} += "java-binfmt-misc \
jpackage-utils-/usr/bin/jarwrapper"

RDEPENDS:${PN} += "/usr/bin/bash \
/usr/bin/sh \
desktop-file-utils \
ld-linux-aarch64.so.1 \
libc.so.6 \
shared-mime-info \
systemd"

inherit rpm
