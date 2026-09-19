SUMMARY = "Brotli compression format for Java"
DESCRIPTION = "Brotli is a generic-purpose lossless compression algorithm that compresses data \
using a combination of a modern variant of the LZ77 algorithm, Huffman coding \
and 2nd order context modeling, with a compression ratio comparable to the best \
currently available general-purpose compression methods. It is similar in speed \
with deflate but offers more dense compression. \
 \
The specification of the Brotli Compressed Data Format is defined in RFC 7932."
LICENSE = "MIT"

PV = "1.2.0"

RPM_NAME = "brotli-java-1.2.0-1.3.noarch.rpm"
RPM_HASH = "fe5a7f79bcd4d938cad09612fd0b755893b67d310155f25707032cbaf6f567fabd2dc8c8811eb7308a4c22a395cc2cdc260d122f993d8940032d576794b46595"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "brotli-java \
mvn-org.brotli-dec \
mvn-org.brotli-dec-pom- \
osgi-org.brotli.dec"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem"

inherit rpm
