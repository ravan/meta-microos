SUMMARY = "JNI binding for Zstd"
DESCRIPTION = "JNI bindings for Zstd native library that provides fast and high compression \
lossless algorithm for Android, Java and all JVM languages: \
• static compress/decompress methods \
• implementation of InputStream and OutputStream for transparent \
  compression of data streams fully compatible with the “zstd” program. \
• minimal performance overhead"
LICENSE = "BSD-2-Clause"

PV = "1.5.7.16"

RPM_NAME = "zstd-jni-1.5.7.16-1.1.aarch64.rpm"
RPM_HASH = "41fafe9ace278d575187aa6b6edbf406cfe84f0bed0893ebe4b700e79c663323ff7a0a76df0058aeec337055a70eff1f948d142762f31da26655cf024fd881ee"

RPROVIDES:${PN} += "libzstd-jni-1.5.7-16.so \
mvn-com.github.luben-zstd-jni \
mvn-com.github.luben-zstd-jni-pom- \
osgi-com.github.luben.zstd-jni \
zstd-jni"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem \
ld-linux-aarch64.so.1 \
libc.so.6"

inherit rpm
