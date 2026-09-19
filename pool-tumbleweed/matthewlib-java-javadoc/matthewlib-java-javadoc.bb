SUMMARY = "A few useful Java libraries"
DESCRIPTION = "A collection of Java libraries: - Unix Sockets Library This is a \
   collection of classes and native code to allow you to read and \
   write Unix sockets in Java. \
 \
- Debug Library This is a comprehensive logging and debugging \
   solution. \
 \
- CGI Library This is a collection of classes and native code to \
   allow you to write CGI applications in Java. \
 \
- I/O Library This provides a few much needed extensions to the Java \
   I/O subsystem. \
 \
- Hexdump This class formats byte-arrays in hex and ascii for display."
LICENSE = "MIT"

PV = "0.8.1"

RPM_NAME = "matthewlib-java-javadoc-0.8.1-1.11.aarch64.rpm"
RPM_HASH = "05525a3be3c146e36294c06a3f87ab5870af4a8e24c8f5aac49096e74d41640fd713603839f5aa1273d79dafd497b4fdd2940766720a197f0dfd018efff3e793"

RPROVIDES:${PN} += "matthewlib-java-javadoc"

RDEPENDS:${PN} += ""

inherit rpm
