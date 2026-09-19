SUMMARY = "A Java-based GUI for drawing Feynman diagrams"
DESCRIPTION = "JaxoDraw is a Java program for drawing Feynman diagrams. It has a \
complete graphical user interface that allows to carry out all actions \
in a mouse click-and-drag fashion. Fine-tuning of the diagrams is \
possible through keyboard short-cuts. Graphs may be exported to a \
variety of image formats, including (encapsulated) postscript, and can \
be saved in XML files to be used in later sessions. \
 \
The main feature of JaxoDraw is the possibility of generating \
LaTeX code that makes use of J. Vermaseren's axodraw package to \
compile. In fact the main motivation for writing JaxoDraw was to \
create a graphical user interface for the axodraw package. In that \
way, we combine the power of LaTeX with the easiness of a \
what-you-see-is-what-you-get interface."
LICENSE = "Apache-2.0 & GPL-2.0-or-later"

PV = "2.1.0"

RPM_NAME = "jaxodraw-2.1.0-7.10.noarch.rpm"
RPM_HASH = "38f31905fc2e7893f732905d37c77d562ab0dd9998ac4149e0d510f670896aeefb4b0e8f86d7c755aae9d91c67d60418abcc770145553cd31902a0054887d568"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "jaxodraw"

RDEPENDS:${PN} += "/usr/bin/sh \
java \
javapackages-tools"

inherit rpm
