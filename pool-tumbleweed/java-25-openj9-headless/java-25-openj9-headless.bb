SUMMARY = "OpenJDK 25 Runtime Environment with Eclipse OpenJ9"
DESCRIPTION = "The OpenJDK 25 runtime environment without audio and video support. \
 \
Supported architectures are ppc64le, s390x and x86_64"
LICENSE = "Apache-1.1 & Apache-2.0 & EPL-2.0 & GPL-1.0-or-later & GPL-2.0-only & GPL-2.0-only-with-Classpath-exception-2.0 & LGPL-2.0-only & MPL-1.0 & MPL-1.1 & LicenseRef-SUSE-Public-Domain & W3C"

PV = "25.0.4.1"

RPM_NAME = "java-25-openj9-headless-25.0.4.1-1.1.aarch64.rpm"
RPM_HASH = "64718747e04c1761916ab6ee4eea93237c9c8cc52a2911c712730778d7846cade34ebd843c40325c9863bad4b06aae69657bf5049e084110330d92b68373b4b9"

RPROVIDES:${PN} += "config-java-25-openj9-headless \
jaas \
java-25-headless \
java-25-openj9-headless \
java-headless \
java-openj9-headless \
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
jre-25-openj9-headless \
jre-25-openjdk-headless \
jre-headless \
jre-openj9-headless \
jre-openjdk-headless \
jsse \
libawt-headless.so \
libawt.so \
libcuda4j29.so \
libdt-socket.so \
libextnet.so \
libfontmanager.so \
libinstrument.so \
libj2gss.so \
libj2pcsc.so \
libj2pkcs11.so \
libj9dmp29.so \
libj9gc-full29.so \
libj9gc29.so \
libj9gcchk-full29.so \
libj9gcchk29.so \
libj9hookable29.so \
libj9jextract.so \
libj9jit29.so \
libj9jnichk29.so \
libj9jvmti29.so \
libj9prt29.so \
libj9shr29.so \
libj9thr29.so \
libj9trc29.so \
libj9vm29.so \
libj9vmchk29.so \
libj9vrb-full29.so \
libj9vrb29.so \
libj9zlib29.so \
libjaas.so \
libjava.so \
libjavajpeg.so \
libjclse29.so \
libjdwp.so \
libjimage.so \
libjli.so \
libjncrypto.so \
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
libomrsig.so \
libprefs.so \
librmi.so \
libsctp.so \
libsyslookup.so \
libverify.so \
libzip.so"

RDEPENDS:${PN} += "/usr/bin/sh \
alts \
java-ca-certificates \
jpackage-utils \
ld-linux-aarch64.so.1 \
libasound.so.2 \
libc.so.6 \
libfreetype.so.6 \
libgcc-s.so.1 \
libharfbuzz.so.0 \
libjpeg.so.8 \
liblcms2.so.2 \
libm.so.6 \
libpcsclite.so.1 \
libstdc++.so.6 \
libz.so.1"

inherit rpm
