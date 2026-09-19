SUMMARY = "OpenJDK 25 Runtime Environment"
DESCRIPTION = "The OpenJDK 25 runtime environment without audio and video support."
LICENSE = "Apache-1.1 & Apache-2.0 & GPL-1.0-or-later & GPL-2.0-only & GPL-2.0-only-with-Classpath-exception-2.0 & LGPL-2.0-only & MPL-1.0 & MPL-1.1 & LicenseRef-SUSE-Public-Domain & W3C"

PV = "25.0.4.1"

RPM_NAME = "java-25-openjdk-headless-25.0.4.1-1.1.aarch64.rpm"
RPM_HASH = "238dd938083122927fabe79123645db75f1adaf6c3c4c1a10f5ccf3c4012ca2db6395d63efa6a2e60a518185f37fcaddd805bfbec8519b381aedd293d74a1b8f"

RPROVIDES:${PN} += "config-java-25-openjdk-headless \
jaas \
java-25-headless \
java-25-openjdk-headless \
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
jre-25-headless \
jre-25-openjdk-headless \
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
libnssadapter.so \
libprefs.so \
librmi.so \
libsctp.so \
libsleef.so \
libsyslookup.so \
libverify.so \
libzip.so \
timezone-java \
tzdata-java"

RDEPENDS:${PN} += "/usr/bin/sh \
alts \
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
libsoftokn3.so \
libstdc++.so.6 \
libz.so.1 \
rtld-GNU-HASH"

inherit rpm
