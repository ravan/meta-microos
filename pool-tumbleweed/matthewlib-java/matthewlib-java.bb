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

RPM_NAME = "matthewlib-java-0.8.1-1.11.aarch64.rpm"
RPM_HASH = "b31d58dadd2baee47bc7a920fa523bc20592575c205bace40b0c43ba6b98f0b5da853dc412797255714dcec64b28872e23925b7214e5467470a210045a54de35"

RPROVIDES:${PN} += "libcgi-java.so \
libmatthew-java \
libunix-java.so \
matthewlib-java"

RDEPENDS:${PN} += "/sbin/ldconfig \
libc.so.6"

inherit rpm
