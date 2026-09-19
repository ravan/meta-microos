SUMMARY = "Additional documentation for form - A Symbolic Manipulation System"
DESCRIPTION = "FORM is a Symbolic Manipulation System. It reads symbolic expressions from files \
and executes symbolic/algebraic transformations upon them. The answers are \
returned in a textual mathematical representation. As its landmark feature, the \
size of the considered expressions in FORM is only limited by the available \
disk space and not by the available RAM. \
 \
This package provides additional documentation for form."
LICENSE = "GPL-3.0-or-later"

PV = "5.0.0"

RPM_NAME = "form-doc-5.0.0-1.6.noarch.rpm"
RPM_HASH = "ed032f4d3fc094cd757799ccc0dc70a7e544895c01a09186f7cffede3e0732014f2fe78487f25cc5dffad00452faff6e42566f0b8538f4f2374095badaa55a82"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "form-doc"

RDEPENDS:${PN} += ""

inherit rpm
