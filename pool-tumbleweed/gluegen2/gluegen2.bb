SUMMARY = "Tool for automatic generation the Java and JNI code"
DESCRIPTION = "GlueGen is a tool which automatically generates the Java and JNI code \
necessary to call C libraries. It reads as input ANSI C header files and \
separate configuration files which provide control over many aspects of \
the glue code generation. GlueGen uses a complete ANSI C parser and \
an internal representation (IR) capable of representing all C types \
to represent the APIs for which it generates interfaces. It has \
the ability to perform significant transformations on the IR before \
glue code emission. GlueGen is currently powerful enough to bind even \
low-level APIs such as the Java Native Interface (JNI) and \
the AWT Native Interface (JAWT) back up to the Java programming language."
LICENSE = "BSD-2-Clause"

PV = "2.3.2"

RPM_NAME = "gluegen2-2.3.2-12.5.aarch64.rpm"
RPM_HASH = "ff2d5ce70f34bcc9c27aec610b4cd89c123f4f82c8639925c41966adc7bdf7c9b2335ad517df63563b280c22296f361b0190071d1ed98bb55a0001d0bee52aa3"

RPROVIDES:${PN} += "gluegen2 \
libgluegen2-rt.so"

RDEPENDS:${PN} += "java"

inherit rpm
