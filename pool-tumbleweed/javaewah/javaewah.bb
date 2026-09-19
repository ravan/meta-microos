SUMMARY = "A word-aligned compressed variant of the Java bitset class"
DESCRIPTION = "JavaEWAH is a word-aligned compressed variant of the Java bitset class. \
It uses a 64-bit run-length encoding (RLE) compression scheme. \
 \
The goal of word-aligned compression is not to achieve the best \
compression, but rather to improve query processing time. Hence, we try \
to save CPU cycles, maybe at the expense of storage. However, the EWAH \
scheme we implemented is always more efficient storage-wise than an \
uncompressed bitmap (implemented in Java as the BitSet class). Unlike \
some alternatives, javaewah does not rely on a patented scheme."
LICENSE = "Apache-2.0"

PV = "1.2.3"

RPM_NAME = "javaewah-1.2.3-1.9.noarch.rpm"
RPM_HASH = "0d4bbac5a4dfb42e29300924dd04013d5cc86058c18e2431ac97b01eb7c593111b18ca694bd7f53cd0aad8120b24d7f6c130b83983e01169eecf4f24a7e1e77e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "javaewah \
mvn-com.googlecode.javaewah-JavaEWAH \
mvn-com.googlecode.javaewah-JavaEWAH-pom- \
osgi-com.googlecode.javaewah.JavaEWAH"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem"

inherit rpm
