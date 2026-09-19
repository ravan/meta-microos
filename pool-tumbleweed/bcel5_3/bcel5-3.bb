SUMMARY = "Byte Code Engineering Library"
DESCRIPTION = "The Byte Code Engineering Library (formerly known as JavaClass) is \
intended to give users a convenient possibility to analyze, create, and \
manipulate (binary) Java class files (those ending with .class). Classes \
are represented by objects which contain all the symbolic information of \
the given class: methods, fields and byte code instructions, in \
particular.  Such objects can be read from an existing file, be \
transformed by a program (e.g. a class loader at run-time) and dumped to \
a file again. An even more interesting application is the creation of \
classes from scratch at run-time. The Byte Code Engineering Library \
(BCEL) may be also useful if you want to learn about the Java Virtual \
Machine (JVM) and the format of Java .class files.  BCEL is already \
being used successfully in several projects such as compilers, \
optimizers, obsfuscators and analysis tools, the most popular probably \
being the Xalan XSLT processor at Apache."
LICENSE = "Apache-2.0"

PV = "5.3"

RPM_NAME = "bcel5_3-5.3-21.15.noarch.rpm"
RPM_HASH = "346ba6389b87fcf926dd6865f39de6e50117fcf44bd45e6591e52e6b1352b3153399ffa8aae378d87279208300293018968b64b761599d32917a1a4a0195e3f7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "bcel5-3 \
bcel5.3"

RDEPENDS:${PN} += ""

inherit rpm
