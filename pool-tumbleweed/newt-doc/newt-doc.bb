SUMMARY = "Tutorial for Nifty Erik's Windowing Toolkit"
DESCRIPTION = "This package contains a tutorial about the Newt windowing toolkit. \
 \
Newt is a programming library for color text-mode, widget-based user \
interfaces.  Newt can be used to add stacked windows, entry widgets, \
check boxes, radio buttons, labels, plain text fields, scrollbars, \
etc., to text mode user interfaces. Newt is based on the slang library."
LICENSE = "LGPL-2.1-or-later"

PV = "0.52.25"

RPM_NAME = "newt-doc-0.52.25-2.1.noarch.rpm"
RPM_HASH = "5b0ed7079e52cd4674918dd496b29d4519ca5c28ed7b150d0fe17def01e4c54b52f80e9ab98ca248e61674ab2331a9bee421e31723d81c7345f4ca828c4aac2e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "newt-doc"

RDEPENDS:${PN} += ""

inherit rpm
