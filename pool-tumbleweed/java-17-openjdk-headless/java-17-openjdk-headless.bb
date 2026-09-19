SUMMARY = "OpenJDK 17 Runtime Environment"
DESCRIPTION = "The OpenJDK 17 runtime environment without audio and video support."
LICENSE = "Apache-1.1 & Apache-2.0 & GPL-1.0-or-later & GPL-2.0-only & GPL-2.0-only-with-Classpath-exception-2.0 & LGPL-2.0-only & MPL-1.0 & MPL-1.1 & LicenseRef-SUSE-Public-Domain & W3C"

PV = "17.0.20.1"

RPM_NAME = "java-17-openjdk-headless-17.0.20.1-1.1.aarch64.rpm"
RPM_HASH = "2fa404a3c6068ff95359ed54e55a867808c9898f1831fa6513d79d34a6edae555e59ab83071e0c9067108a90ed540f6ac99c76d50293ac9233d012a4b4455f04"

RPROVIDES:${PN} += "config-java-17-openjdk-headless \
jaas \
java-17-headless \
java-17-openjdk-headless \
java-headless \
java-openjdk-headless \
java-sasl \
jce \
jdbc-stdext \
jndi \
jndi-cos \
jndi-dns \
jndi-ldap \
jndi-rmi \
jre-17-headless \
jre-17-openjdk-headless \
jre-headless \
jre-openjdk-headless \
jsse \
libawt-headless.so \
libawt.so \
libdt-socket.so \
libextnet.so \
libfontmanager.so \
libinstrument.so \
libj2gss.so \
libj2pcsc.so \
libj2pkcs11.so \
libjaas.so \
libjava.so \
libjavajpeg.so \
libjdwp.so \
libjimage.so \
libjli.so \
libjsig.so \
libjsound.so \
libjvm.so \
liblcms.so \
libmanagement-agent.so \
libmanagement-ext.so \
libmanagement.so \
libmlib-image.so \
libnet.so \
libnio.so \
libprefs.so \
librmi.so \
libsctp.so \
libsyslookup.so \
libsystemconf.so \
libverify.so \
libzip.so \
timezone-java \
tzdata-java"

RDEPENDS:${PN} += "/usr/bin/sh \
alts \
file \
java-ca-certificates \
jpackage-utils \
ld-linux-aarch64.so.1 \
libasound.so.2 \
libc.so.6 \
libfreetype.so.6 \
libgcc-s.so.1 \
libjpeg.so.8 \
liblcms2.so.2 \
libm.so.6 \
libnss3.so \
libpcsclite.so.1 \
libstdc++.so.6 \
libz.so.1 \
mozilla-nss \
rtld-GNU-HASH"

inherit rpm
