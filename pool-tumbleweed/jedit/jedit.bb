SUMMARY = "Programmer's Text Editor Written in Java"
DESCRIPTION = "jEdit is a cross-platform programmer's text editor written in Java. \
Some of jEdit's features include: \
 \
* Built-in macro language (BeanShell). \
* Extensible plug-in architecture with more than 80 plug-ins \
   available. \
* Plug-ins can be downloaded and installed from within jEdit using \
   the plug-in manager feature. \
* Syntax highlighting for more than 80 languages. \
* Supports a large number of character encodings including UTF8 and \
   Unicode. \
* Auto-indenting of source code. \
* Folding (indent and marker based). \
* Word wrap. \
* Unlimited undo and redo. \
* Highly configurable and customizable. \
* Every other feature, both basic and advanced, that you would expect \
to find in a text editor."
LICENSE = "GPL-2.0-or-later"

PV = "5.5.0"

RPM_NAME = "jedit-5.5.0-7.9.noarch.rpm"
RPM_HASH = "7ae497c457a7eacabe4a4e4f3904014d0dd1f045f73307ebe1971b7f8dc74ff3177ba4bf427a6f2472ebde9d94ad792e7b0da26ab2ba075c8e8bc6d82a5dc051"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "jedit"

RDEPENDS:${PN} += "/usr/bin/sh"

inherit rpm
